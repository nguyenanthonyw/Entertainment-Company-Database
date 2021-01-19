import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;

/**
 * This program generates a menu and the user selects from the combo box The
 * user can select the "employee" to iterate through the employee list looking
 * through their names, ID and salary. The user can select the "Album" to
 * iterate through the album names and distributors The user can select the
 * "Search" to look up a distributor according to the Id Number associated with
 * it
 * 
 * 
 * @author Anthony Nguyen
 * @version 1.2.4
 * @since 2020.20.04
 */

public class Menu {

    private JFrame frame;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
	    public void run() {
		try {
		    Menu window = new Menu();
		    window.frame.setVisible(true);
		} catch (Exception e) {
		    e.printStackTrace();
		}
	    }
	});
    }

    /**
     * Create the application.
     */
    public Menu() {
	initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
	frame = new JFrame();
	frame.setBounds(100, 100, 357, 357);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.getContentPane().setLayout(null);

	JComboBox comboBox = new JComboBox();
	comboBox.setFont(new Font("Tahoma", Font.PLAIN, 41));
	comboBox.addItem("Employee");
	comboBox.addItem("Album");
	comboBox.addItem("Search");
	comboBox.setSelectedItem(null);
	comboBox.setMaximumRowCount(3);
	comboBox.setSelectedIndex(0);
	comboBox.setBounds(21, 21, 250, 51);
	frame.getContentPane().add(comboBox);

	JButton btnNewButton = new JButton("Select");
	btnNewButton.addMouseListener(new MouseAdapter() {
	    @Override
	    public void mouseClicked(MouseEvent e) {

		// get the value from the selected box
		String value = (String) comboBox.getSelectedItem();
		if (value == "Employee") { // takes the user to the Employee Information program
		    EmployeeInfo employee = new EmployeeInfo();
		    employee.setVisible(true);

		}

		else if (value == "Album") { // takes the user to the Album and Distributor program
		    AlbumDistributor album = new AlbumDistributor();
		    album.setVisible(true);

		}

		else if (value == "Search") { // takes user to search distributor program
		    DistributorSearch dist = new DistributorSearch();
		    dist.setVisible(true);
		}

	    }
	});
	btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 41));
	btnNewButton.setBounds(21, 107, 250, 62);
	frame.getContentPane().add(btnNewButton);

    }
}
