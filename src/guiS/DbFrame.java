package guiS;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.SystemColor;
import javax.swing.JMenuBar;
import javax.swing.JTextArea;

public class DbFrame extends JFrame {

	private JPanel contentPane;
	private JTextField txtnumber;
	private JTextField txtDate;
	private JTextField textField;
	private JTextField txtCity;
	private JTextField txtStreet;
	private JTextField txtZip;
	private JTextField textField_1;
	private JLabel lblPhone;
	private JTextField textField_2;
	private JTextField txtname;
	private JTextField txtcompanyName;
	private JTextField txtStreetAddress;
	private JTextField txtcity;
	private JTextField txtStreet_1;
	private JTextField txtZip_1;
	private JTextField txtPhone;
	private JTextField txtemailAddress;
	private JPanel panel_1;
	private JPanel panel_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DbFrame frame = new DbFrame();
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
	public DbFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setBounds(150,75,950,1300);
		setBounds(150,75, 765, 990);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaptionBorder);
		contentPane.setForeground(Color.DARK_GRAY);
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblInvoice = new JLabel("INVOICE");
		lblInvoice.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblInvoice.setBounds(616, 11, 134, 29);
		contentPane.add(lblInvoice);
		
		txtnumber = new JTextField();
		txtnumber.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtnumber.setText("[number]");
		txtnumber.setBounds(579, 78, 86, 20);
		contentPane.add(txtnumber);
		txtnumber.setColumns(10);
		
		txtDate = new JTextField();
		txtDate.setText("1/1/2018");
		txtDate.setBounds(675, 78, 86, 20);
		contentPane.add(txtDate);
		txtDate.setColumns(10);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField.setBounds(64, 50, 146, 29);
		contentPane.add(textField);
		textField.setColumns(10);
		
		txtCity = new JTextField();
		txtCity.setText("City");
		txtCity.setBounds(64, 130, 86, 20);
		contentPane.add(txtCity);
		txtCity.setColumns(10);
		
		txtStreet = new JTextField();
		txtStreet.setText("Street");
		txtStreet.setBounds(160, 130, 86, 20);
		contentPane.add(txtStreet);
		txtStreet.setColumns(10);
		
		txtZip = new JTextField();
		txtZip.setText("Zip");
		txtZip.setBounds(256, 130, 86, 20);
		contentPane.add(txtZip);
		txtZip.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(64, 95, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		lblPhone = new JLabel("Phone");
		lblPhone.setBounds(64, 161, 52, 20);
		contentPane.add(lblPhone);
		
		textField_2 = new JTextField();
		textField_2.setBounds(126, 161, 124, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(64, 217, 458, 29);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("BILL TO");
		lblNewLabel_1.setBounds(10, 11, 92, 22);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		txtname = new JTextField();
		txtname.setText("[Name]");
		txtname.setBounds(64, 257, 86, 20);
		contentPane.add(txtname);
		txtname.setColumns(10);
		
		txtcompanyName = new JTextField();
		txtcompanyName.setText("[Company Name]");
		txtcompanyName.setBounds(64, 288, 157, 20);
		contentPane.add(txtcompanyName);
		txtcompanyName.setColumns(10);
		
		txtStreetAddress = new JTextField();
		txtStreetAddress.setText("Street Address");
		txtStreetAddress.setBounds(64, 319, 86, 20);
		contentPane.add(txtStreetAddress);
		txtStreetAddress.setColumns(10);
		
		txtcity = new JTextField();
		txtcity.setText("[City]");
		txtcity.setBounds(64, 354, 86, 20);
		contentPane.add(txtcity);
		txtcity.setColumns(10);
		
		txtStreet_1 = new JTextField();
		txtStreet_1.setText("Street");
		txtStreet_1.setBounds(164, 354, 86, 20);
		contentPane.add(txtStreet_1);
		txtStreet_1.setColumns(10);
		
		txtZip_1 = new JTextField();
		txtZip_1.setText("Zip");
		txtZip_1.setBounds(267, 354, 86, 20);
		contentPane.add(txtZip_1);
		txtZip_1.setColumns(10);
		
		txtPhone = new JTextField();
		txtPhone.setText("[Phone]");
		txtPhone.setBounds(64, 385, 86, 20);
		contentPane.add(txtPhone);
		txtPhone.setColumns(10);
		
		txtemailAddress = new JTextField();
		txtemailAddress.setText("[Email Address]");
		txtemailAddress.setBounds(64, 416, 86, 20);
		contentPane.add(txtemailAddress);
		txtemailAddress.setColumns(10);
		
		panel_1 = new JPanel();
		panel_1.setBounds(579, 51, 92, 20);
		contentPane.add(panel_1);
		
		JLabel lblInvoiceId = new JLabel("Invoice ID");
		panel_1.add(lblInvoiceId);
		lblInvoiceId.setBackground(SystemColor.menu);
		
		panel_2 = new JPanel();
		panel_2.setBounds(681, 51, 92, 20);
		contentPane.add(panel_2);
		
		JLabel lblNewLabel = new JLabel("Date");
		panel_2.add(lblNewLabel);
		lblNewLabel.setBackground(SystemColor.menu);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(44, 446, 695, 29);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Description");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(10, 11, 86, 14);
		panel_3.add(lblNewLabel_2);
		
		JLabel lblAmout = new JLabel("Amout");
		lblAmout.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAmout.setBounds(613, 12, 72, 14);
		panel_3.add(lblAmout);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(44, 480, 543, 266);
		contentPane.add(textArea);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(597, 480, 142, 266);
		contentPane.add(textArea_1);
		setTitle("Joan's SQL PRO");
	}
}
