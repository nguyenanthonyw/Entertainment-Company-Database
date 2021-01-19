import java.awt.EventQueue;
import java.awt.Font;
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
 * This program will allow the user to iterate through a list of Albums and the
 * distributors involved with the release of the albums
 * 
 * @author Anthony Nguyen
 *
 */
public class AlbumDistributor extends JFrame {

    public static int number;
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
		    AlbumDistributor frame = new AlbumDistributor();
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
    public AlbumDistributor() {
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(100, 100, 1205, 516);
	contentPane = new JPanel();
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(contentPane);
	contentPane.setLayout(null);

	JLabel lblNewLabel = new JLabel("Album Name");
	lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 41));
	lblNewLabel.setBounds(21, 21, 297, 47);
	contentPane.add(lblNewLabel);

	textField = new JTextField();
	textField.setFont(new Font("Tahoma", Font.PLAIN, 41));
	textField.setColumns(10);
	textField.setBounds(384, 21, 574, 47);
	contentPane.add(textField);

	JLabel lblDistributor = new JLabel("Distributor");
	lblDistributor.setFont(new Font("Tahoma", Font.PLAIN, 41));
	lblDistributor.setBounds(21, 104, 297, 47);
	contentPane.add(lblDistributor);

	JLabel lblDistributorAddress = new JLabel("Distributor Address");
	lblDistributorAddress.setFont(new Font("Tahoma", Font.PLAIN, 41));
	lblDistributorAddress.setBounds(21, 189, 347, 47);
	contentPane.add(lblDistributorAddress);

	textField_1 = new JTextField();
	textField_1.setFont(new Font("Tahoma", Font.PLAIN, 41));
	textField_1.setColumns(10);
	textField_1.setBounds(384, 104, 574, 47);
	contentPane.add(textField_1);

	textField_2 = new JTextField();
	textField_2.setFont(new Font("Tahoma", Font.PLAIN, 41));
	textField_2.setColumns(10);
	textField_2.setBounds(384, 189, 574, 47);
	contentPane.add(textField_2);

	JButton btnNewButton = new JButton("First");
	btnNewButton.addMouseListener(new MouseAdapter() {
	    @Override
	    public void mouseClicked(MouseEvent arg0) {
		number = 0;
		Function f = new Function();
		ResultSet rs = null;
		rs = f.find("0");
		try {
		    if (rs.next()) {
			textField.setText(rs.getString("Title"));
			textField_1.setText(rs.getString("comp_Name"));
			textField_2.setText(rs.getString("address"));
			textField_3.setText(rs.getString("phone"));
		    }

		} catch (Exception ex) {
		    ex.printStackTrace();
		}

	    }
	});
	btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 41));
	btnNewButton.setBounds(21, 367, 200, 63);
	contentPane.add(btnNewButton);

	JButton btnNext = new JButton("Next");
	btnNext.addMouseListener(new MouseAdapter() {
	    @Override
	    public void mouseClicked(MouseEvent e) {

		if (number != 6) {
		    number++;
		}

		Function f = new Function();
		ResultSet rs = null;
		rs = f.find(Integer.toString(number));
		try {
		    if (rs.next()) {
			textField.setText(rs.getString("Title"));
			textField_1.setText(rs.getString("comp_Name"));
			textField_2.setText(rs.getString("address"));
			textField_3.setText(rs.getString("phone"));
		    }

		} catch (Exception ex) {
		    ex.printStackTrace();
		}

	    }
	});
	btnNext.setFont(new Font("Tahoma", Font.PLAIN, 41));
	btnNext.setBounds(295, 367, 200, 63);
	contentPane.add(btnNext);

	JButton btnPrevious = new JButton("Previous");
	btnPrevious.addMouseListener(new MouseAdapter() {
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
			textField.setText(rs.getString("Title"));
			textField_1.setText(rs.getString("comp_Name"));
			textField_2.setText(rs.getString("address"));
			textField_3.setText(rs.getString("phone"));
		    }

		} catch (Exception ex) {
		    ex.printStackTrace();
		}

	    }
	});
	btnPrevious.setFont(new Font("Tahoma", Font.PLAIN, 41));
	btnPrevious.setBounds(571, 367, 200, 63);
	contentPane.add(btnPrevious);

	JLabel lblPhoneNumber = new JLabel("Phone Number");
	lblPhoneNumber.setFont(new Font("Tahoma", Font.PLAIN, 41));
	lblPhoneNumber.setBounds(21, 270, 297, 47);
	contentPane.add(lblPhoneNumber);

	textField_3 = new JTextField();
	textField_3.setFont(new Font("Tahoma", Font.PLAIN, 41));
	textField_3.setColumns(10);
	textField_3.setBounds(384, 270, 574, 47);
	contentPane.add(textField_3);

	JButton btnLast = new JButton("Last");
	btnLast.addMouseListener(new MouseAdapter() {
	    @Override
	    public void mouseClicked(MouseEvent e) {
		number = 6;
		Function f = new Function();
		ResultSet rs = null;
		rs = f.find("6");
		try {
		    if (rs.next()) {
			textField.setText(rs.getString("Title"));
			textField_1.setText(rs.getString("comp_Name"));
			textField_2.setText(rs.getString("address"));
			textField_3.setText(rs.getString("phone"));
		    }

		}

		catch (Exception ex) {
		    ex.printStackTrace();
		}

	    }
	});
	btnLast.setFont(new Font("Tahoma", Font.PLAIN, 41));
	btnLast.setBounds(898, 367, 200, 63);
	contentPane.add(btnLast);
    }

    public class Function {
	Connection con = null;
	ResultSet rs = null;
	PreparedStatement ps = null;

	public ResultSet find(String s) {
	    try {
		con = DriverManager.getConnection("jdbc:mysql://localhost/project?user=root&password=ics311");
		ps = con.prepareStatement(
			"select * from Album, Album_Dist where Album.Dist_Id = Album_Dist.Dist_Id and Album.Album_Id =?");
		ps.setString(1, s);
		rs = ps.executeQuery();

	    } catch (Exception ex) {
		JOptionPane.showMessageDialog(null, ex.getMessage());

	    }

	    return rs;
	}
    }

}
