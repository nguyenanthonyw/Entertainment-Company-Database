import java.awt.EventQueue;
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
 * This program will allow the user to search through the list of distributors
 * 
 * @author Anthony
 *
 */
public class DistributorSearch extends JFrame {

    private JPanel contentPane;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
	    public void run() {
		try {
		    DistributorSearch frame = new DistributorSearch();
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
    public DistributorSearch() {
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(100, 100, 1056, 449);
	contentPane = new JPanel();
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(contentPane);
	contentPane.setLayout(null);

	JLabel lblNewLabel = new JLabel("Distributor ID");
	lblNewLabel.setBounds(0, 21, 188, 26);
	contentPane.add(lblNewLabel);

	textField = new JTextField();
	textField.setColumns(10);
	textField.setBounds(0, 51, 337, 32);
	contentPane.add(textField);

	JButton btnNewButton = new JButton("Submit");
	btnNewButton.addMouseListener(new MouseAdapter() {
	    @Override
	    public void mouseClicked(MouseEvent e) {

		Function f = new Function();
		ResultSet rs = null;
		rs = f.find(textField.getText());
		try {
		    if (rs.next()) {
			textField_1.setText(rs.getString("Comp_Name"));
			textField_2.setText(rs.getString("Address"));
			textField_3.setText(rs.getString("phone"));
		    }

		} catch (Exception ex) {
		    JOptionPane.showMessageDialog(null, "No Data");
		}

	    }
	});
	btnNewButton.setBounds(0, 104, 1009, 35);
	contentPane.add(btnNewButton);

	JLabel lblNewLabel_1 = new JLabel("Company Name");
	lblNewLabel_1.setBounds(0, 226, 159, 26);
	contentPane.add(lblNewLabel_1);

	JLabel lblNewLabel_2 = new JLabel("Vendor Address");
	lblNewLabel_2.setBounds(0, 273, 188, 26);
	contentPane.add(lblNewLabel_2);

	JLabel lblNewLabel_3 = new JLabel("Vendor Phone");
	lblNewLabel_3.setBounds(0, 320, 169, 26);
	contentPane.add(lblNewLabel_3);

	textField_1 = new JTextField();
	textField_1.setText("");
	textField_1.setColumns(10);
	textField_1.setBounds(823, 223, 186, 32);
	contentPane.add(textField_1);

	textField_2 = new JTextField();
	textField_2.setColumns(10);
	textField_2.setBounds(823, 270, 186, 32);
	contentPane.add(textField_2);

	textField_3 = new JTextField();
	textField_3.setText("");
	textField_3.setColumns(10);
	textField_3.setBounds(823, 317, 186, 32);
	contentPane.add(textField_3);
    }

    public class Function {
	Connection con = null;
	ResultSet rs = null;
	PreparedStatement ps = null;

	public ResultSet find(String s) {
	    try {
		con = DriverManager.getConnection("jdbc:mysql://localhost/project?user=root&password=ics311");
		ps = con.prepareStatement("select * from Album_Dist where Dist_Id = ?");
		ps.setString(1, s);
		rs = ps.executeQuery();

	    } catch (Exception ex) {
		JOptionPane.showMessageDialog(null, ex.getMessage());

	    }

	    return rs;
	}
    }

}
