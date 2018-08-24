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
import javax.swing.JButton;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class DbFrame6Items extends JFrame {
	
	// put phone filter in company object
	// put all the filters in the setters?
	// other than the type parse which should be in frame

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
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DbFrame6Items frame = new DbFrame6Items();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public DbFrame6Items() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setBounds(150,75,950,1300);
		//setBounds(150,75, 765, 990);
		// not fit size
		setBounds(150,75,780,850);
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
		txtCompanyName.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				
			}
		});
		//txtCompanyName.addFocusListener();
		
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
		txtStreet.setText("State");
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
		panel.setBounds(44, 208, 458, 38);
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
		txtStreet_1.setText("State");
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
		lblThankYouFor.setBounds(72, 760, 328, 29);
		contentPane.add(lblThankYouFor);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblTotal.setBounds(479, 761, 103, 22);
		contentPane.add(lblTotal);
		
		textField_3 = new JTextField();
		textField_3.setText("$100.00");
		textField_3.setBounds(653, 760, 86, 20);
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
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(44, 518, 345, 20);
		contentPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(399, 518, 70, 20);
		contentPane.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(479, 518, 70, 20);
		contentPane.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(559, 518, 70, 20);
		contentPane.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(639, 518, 100, 20);
		contentPane.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(44, 549, 345, 20);
		contentPane.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(399, 549, 70, 20);
		contentPane.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(479, 549, 70, 20);
		contentPane.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(559, 549, 70, 20);
		contentPane.add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(639, 549, 100, 20);
		contentPane.add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(44, 580, 345, 20);
		contentPane.add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(399, 580, 70, 20);
		contentPane.add(textField_17);
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(479, 580, 70, 20);
		contentPane.add(textField_18);
		
		textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBounds(559, 580, 70, 20);
		contentPane.add(textField_19);
		
		textField_20 = new JTextField();
		textField_20.setColumns(10);
		textField_20.setBounds(639, 580, 100, 20);
		contentPane.add(textField_20);
		
		textField_21 = new JTextField();
		textField_21.setColumns(10);
		textField_21.setBounds(44, 611, 345, 20);
		contentPane.add(textField_21);
		
		textField_22 = new JTextField();
		textField_22.setColumns(10);
		textField_22.setBounds(399, 611, 70, 20);
		contentPane.add(textField_22);
		
		textField_23 = new JTextField();
		textField_23.setColumns(10);
		textField_23.setBounds(479, 611, 70, 20);
		contentPane.add(textField_23);
		
		textField_24 = new JTextField();
		textField_24.setColumns(10);
		textField_24.setBounds(559, 611, 70, 20);
		contentPane.add(textField_24);
		
		textField_25 = new JTextField();
		textField_25.setColumns(10);
		textField_25.setBounds(639, 611, 100, 20);
		contentPane.add(textField_25);
		
		textField_26 = new JTextField();
		textField_26.setColumns(10);
		textField_26.setBounds(44, 642, 345, 20);
		contentPane.add(textField_26);
		
		textField_27 = new JTextField();
		textField_27.setColumns(10);
		textField_27.setBounds(399, 642, 70, 20);
		contentPane.add(textField_27);
		
		textField_28 = new JTextField();
		textField_28.setColumns(10);
		textField_28.setBounds(479, 642, 70, 20);
		contentPane.add(textField_28);
		
		textField_29 = new JTextField();
		textField_29.setColumns(10);
		textField_29.setBounds(559, 642, 70, 20);
		contentPane.add(textField_29);
		
		textField_30 = new JTextField();
		textField_30.setColumns(10);
		textField_30.setBounds(639, 642, 100, 20);
		contentPane.add(textField_30);
		setTitle("Joan's SQL PRO");
	}
	
	public class TestField implements FocusListener {

		public TestField() {};
		@Override
		public void focusGained(FocusEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void focusLost(FocusEvent arg0) {
			//if(!txtCompanyName.getText().equals(""))
			
			
		}

	}
}

