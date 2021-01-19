import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

/**
 * This class will create a GUI and allow the user to iterate over the employee
 * list
 * 
 * @author Anthony Nguyen
 *
 */
public class EmployeeInfo extends JFrame {

    public static int number;
    private JPanel contentPane;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
	    public void run() {
		try {
		    EmployeeInfo frame = new EmployeeInfo();
		    frame.setVisible(true);
		} catch (Exception e) {
		    e.printStackTrace();
		}
	    }
	});
    }

    /**
     * Create the frame.
     */
    public EmployeeInfo() {
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(100, 100, 987, 426);
	contentPane = new JPanel();
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(contentPane);
	contentPane.setLayout(null);

	JLabel lblNewLabel_1 = new JLabel("ID");
	lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 41));
	lblNewLabel_1.setBounds(21, 62, 123, 35);
	contentPane.add(lblNewLabel_1);

	JLabel lblNewLabel = new JLabel("First Name");
	lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 41));
	lblNewLabel.setBounds(21, 129, 211, 45);
	contentPane.add(lblNewLabel);

	JLabel lblNewLabel_2 = new JLabel("Salary");
	lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 41));
	lblNewLabel_2.setBounds(21, 215, 240, 45);
	contentPane.add(lblNewLabel_2);

	textField = new JTextField();
	textField.setFont(new Font("Tahoma", Font.PLAIN, 41));
	textField.setColumns(10);
	textField.setBounds(315, 52, 345, 45);
	contentPane.add(textField);

	textField_1 = new JTextField();
	textField_1.setFont(new Font("Tahoma", Font.PLAIN, 41));
	textField_1.setColumns(10);
	textField_1.setBounds(315, 129, 345, 45);
	contentPane.add(textField_1);

	textField_2 = new JTextField();
	textField_2.setFont(new Font("Tahoma", Font.PLAIN, 41));
	textField_2.setColumns(10);
	textField_2.setBounds(315, 215, 345, 45);
	contentPane.add(textField_2);

	JButton btnNewButton = new JButton("First");
	btnNewButton.addMouseListener(new MouseAdapter() {
	    @Override
	    public void mouseClicked(MouseEvent e) {
		number = 0;
		Function f = new Function();
		ResultSet rs = null;
		rs = f.find("0"); // finds the first employee in the list
		try {
		    if (rs.next()) { // puts the right info into the correct text box
			textField.setText(rs.getString("Emp_Id"));
			textField_1.setText(rs.getString("Emp_Name"));
			textField_2.setText(rs.getString("salary"));
		    }

		} catch (Exception ex) {
		    ex.printStackTrace();
		}

	    }
	});
	btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 41));
	btnNewButton.setBounds(0, 274, 222, 81);
	contentPane.add(btnNewButton);

	JButton btnNewButton_1 = new JButton("Next");
	btnNewButton_1.addMouseListener(new MouseAdapter() {
	    @Override
	    public void mouseClicked(MouseEvent e) {

		if (number != 9) { // won't let the counter go above 9
		    number++;
		}

		Function f = new Function();
		ResultSet rs = null;
		rs = f.find(Integer.toString(number));
		try {
		    if (rs.next()) {
			textField.setText(rs.getString("Emp_Id"));
			textField_1.setText(rs.getString("Emp_Name"));
			textField_2.setText(rs.getString("salary"));
		    }

		} catch (Exception ex) {
		    ex.printStackTrace();
		}

	    }
	});
	btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 41));
	btnNewButton_1.setBounds(243, 274, 222, 81);
	contentPane.add(btnNewButton_1);

	JButton btnNewButton_1_1 = new JButton("Previous");
	btnNewButton_1_1.addMouseListener(new MouseAdapter() {
	    @Override
	    public void mouseClicked(MouseEvent e) {

		if (number != 0) {
		    number--;
		}

		Function f = new Function();
		ResultSet rs = null;
		rs = f.find(Integer.toString(number));
		try {
		    if (rs.next()) {
			textField.setText(rs.getString("Emp_Id"));
			textField_1.setText(rs.getString("Emp_Name"));
			textField_2.setText(rs.getString("salary"));
		    }

		} catch (Exception ex) {
		    ex.printStackTrace();
		}

	    }
	});
	btnNewButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 41));
	btnNewButton_1_1.setBounds(486, 274, 222, 81);
	contentPane.add(btnNewButton_1_1);

	JButton btnNewButton_1_2 = new JButton("Last");
	btnNewButton_1_2.addMouseListener(new MouseAdapter() {
	    @Override
	    public void mouseClicked(MouseEvent e) {
		number = 9;
		Function f = new Function();
		ResultSet rs = null;
		rs = f.find(Integer.toString(number));
		try {
		    if (rs.next()) {
			textField.setText(rs.getString("Emp_Id"));
			textField_1.setText(rs.getString("Emp_Name"));
			textField_2.setText(rs.getString("salary"));
		    }

		} catch (Exception ex) {
		    ex.printStackTrace();
		}

	    }
	});
	btnNewButton_1_2.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent arg0) {
	    }
	});
	btnNewButton_1_2.setFont(new Font("Tahoma", Font.PLAIN, 41));
	btnNewButton_1_2.setBounds(739, 274, 222, 81);
	contentPane.add(btnNewButton_1_2);
    }

    /**
     * connects to the database and searches through the employee list
     * 
     * @return rs the data extracted from the database
     */
    public class Function {
	Connection con = null;
	ResultSet rs = null;
	PreparedStatement ps = null;

	public ResultSet find(String s) {
	    try {
		con = DriverManager.getConnection("jdbc:mysql://localhost/project?user=root&password=ics311");
		ps = con.prepareStatement("select * from Employee where Emp_Id = ?");
		ps.setString(1, s);
		rs = ps.executeQuery();

	    } catch (Exception ex) {
		JOptionPane.showMessageDialog(null, ex.getMessage());

	    }

	    return rs;
	}
    }

}
