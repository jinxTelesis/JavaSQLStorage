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
import javax.swing.SwingConstants;

public class DbFrame extends JFrame {

	private JPanel contentPane;
	private JTextField txtnumber;
	private JTextField txtDate;
	private JTextField txtCompanyName;
	private JTextField txtCity;
	private JTextField txtStreet;
	private JTextField txtZip;
	private JTextField txtStreetAddress_1;
	private JTextField txtPhone_1;
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
	private JTextField textField_3;
	private JLabel lblQty;
	private JLabel lblUnit;
	private JLabel lblTaxed;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_5;

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
		lblInvoice.setBounds(566, 29, 134, 29);
		contentPane.add(lblInvoice);
		
		txtnumber = new JTextField();
		txtnumber.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtnumber.setText("[number]");
		txtnumber.setBounds(529, 96, 86, 20);
		contentPane.add(txtnumber);
		txtnumber.setColumns(10);
		
		txtDate = new JTextField();
		txtDate.setText("1/1/2018");
		txtDate.setBounds(625, 96, 98, 20);
		contentPane.add(txtDate);
		txtDate.setColumns(10);
		
		txtCompanyName = new JTextField();
		txtCompanyName.setText("Company Name");
		txtCompanyName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtCompanyName.setBounds(44, 51, 146, 29);
		contentPane.add(txtCompanyName);
		txtCompanyName.setColumns(10);
		
		txtCity = new JTextField();
		txtCity.setText("City");
		txtCity.setBounds(44, 131, 86, 20);
		contentPane.add(txtCity);
		txtCity.setColumns(10);
		
		txtStreet = new JTextField();
		txtStreet.setText("Street");
		txtStreet.setBounds(140, 131, 86, 20);
		contentPane.add(txtStreet);
		txtStreet.setColumns(10);
		
		txtZip = new JTextField();
		txtZip.setText("Zip");
		txtZip.setBounds(236, 131, 86, 20);
		contentPane.add(txtZip);
		txtZip.setColumns(10);
		
		txtStreetAddress_1 = new JTextField();
		txtStreetAddress_1.setText("Street Address");
		txtStreetAddress_1.setBounds(44, 96, 86, 20);
		contentPane.add(txtStreetAddress_1);
		txtStreetAddress_1.setColumns(10);
		
		txtPhone_1 = new JTextField();
		txtPhone_1.setText("Phone");
		txtPhone_1.setBounds(44, 162, 124, 20);
		contentPane.add(txtPhone_1);
		txtPhone_1.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(44, 217, 458, 29);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("BILL TO");
		lblNewLabel_1.setBounds(10, 11, 92, 22);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		txtname = new JTextField();
		txtname.setText("[Name]");
		txtname.setBounds(44, 257, 86, 20);
		contentPane.add(txtname);
		txtname.setColumns(10);
		
		txtcompanyName = new JTextField();
		txtcompanyName.setText("[Company Name]");
		txtcompanyName.setBounds(44, 288, 157, 20);
		contentPane.add(txtcompanyName);
		txtcompanyName.setColumns(10);
		
		txtStreetAddress = new JTextField();
		txtStreetAddress.setText("Street Address");
		txtStreetAddress.setBounds(44, 319, 86, 20);
		contentPane.add(txtStreetAddress);
		txtStreetAddress.setColumns(10);
		
		txtcity = new JTextField();
		txtcity.setText("[City]");
		txtcity.setBounds(44, 353, 86, 20);
		contentPane.add(txtcity);
		txtcity.setColumns(10);
		
		txtStreet_1 = new JTextField();
		txtStreet_1.setText("Street");
		txtStreet_1.setBounds(144, 353, 86, 20);
		contentPane.add(txtStreet_1);
		txtStreet_1.setColumns(10);
		
		txtZip_1 = new JTextField();
		txtZip_1.setText("Zip");
		txtZip_1.setBounds(247, 353, 86, 20);
		contentPane.add(txtZip_1);
		txtZip_1.setColumns(10);
		
		txtPhone = new JTextField();
		txtPhone.setText("[Phone]");
		txtPhone.setBounds(44, 384, 86, 20);
		contentPane.add(txtPhone);
		txtPhone.setColumns(10);
		
		txtemailAddress = new JTextField();
		txtemailAddress.setText("[Email Address]");
		txtemailAddress.setBounds(44, 415, 86, 20);
		contentPane.add(txtemailAddress);
		txtemailAddress.setColumns(10);
		
		panel_1 = new JPanel();
		panel_1.setBounds(529, 69, 86, 20);
		contentPane.add(panel_1);
		
		JLabel lblInvoiceId = new JLabel("Invoice ID");
		lblInvoiceId.setHorizontalAlignment(SwingConstants.LEFT);
		panel_1.add(lblInvoiceId);
		lblInvoiceId.setBackground(SystemColor.menu);
		lblInvoiceId.setBounds(530,69,86,20);
		
		panel_2 = new JPanel();
		panel_2.setBounds(625, 69, 98, 20);
		contentPane.add(panel_2);
		
		JLabel lblNewLabel = new JLabel("Date");
		panel_2.add(lblNewLabel);
		lblNewLabel.setBackground(SystemColor.menu);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(44, 446, 695, 29);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Item Description");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(10, 10, 113, 15);
		panel_3.add(lblNewLabel_2);
		
		JLabel lblAmout = new JLabel(" Amount");
		lblAmout.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAmout.setBounds(596, 9, 89, 14);
		panel_3.add(lblAmout);
		
		lblQty = new JLabel(" Qty");
		lblQty.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblQty.setBounds(352, 10, 72, 15);
		panel_3.add(lblQty);
		
		lblUnit = new JLabel(" Unit $");
		lblUnit.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblUnit.setBounds(434, 10, 61, 15);
		panel_3.add(lblUnit);
		
		lblTaxed = new JLabel(" Taxed");
		lblTaxed.setBounds(515, 11, 46, 14);
		panel_3.add(lblTaxed);
		
		JLabel lblThankYouFor = new JLabel("Thank you for your purchase!");
		lblThankYouFor.setForeground(Color.BLACK);
		lblThankYouFor.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblThankYouFor.setBounds(74, 798, 328, 29);
		contentPane.add(lblThankYouFor);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblTotal.setBounds(484, 799, 103, 22);
		contentPane.add(lblTotal);
		
		textField_3 = new JTextField();
		textField_3.setText("$100.00");
		textField_3.setBounds(653, 804, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField = new JTextField();
		textField.setBounds(44, 486, 345, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(399, 486, 70, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(479, 486, 70, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(559, 486, 70, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(639, 486, 100, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		setTitle("Joan's SQL PRO");
	}
}
