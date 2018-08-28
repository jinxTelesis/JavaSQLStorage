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
	private JTextField tFNumber;
	private JTextField tFDate;
	private JTextField txtComNa;
	private JTextField txtCity;
	private JTextField txtStreet;
	private JTextField txtZip;
	private JTextField txtStreAdd;
	private JTextField txtPho;
	private JTextField txtBName;
	private JTextField txtBcompNa;
	private JTextField txtBStreAdd;
	private JTextField txtBCity;
	private JTextField txtBStre;
	private JTextField txtBZip;
	private JTextField txtBPho;
	private JTextField txtBEmailAdd;
	private JPanel panel_1;
	private JPanel panel_2;
	private JTextField tFTotalAmo;
	private JLabel lblQty;
	private JLabel lblUnit;
	private JLabel lblTaxed;
	private JTextField tFItem1;
	private JTextField tFQ1;
	private JTextField tFU1;
	private JTextField tFTax1;
	private JTextField tFA1;
	private JTextField tFitem2;
	private JTextField tFQ2;
	private JTextField tFU2;
	private JTextField tFTax2;
	private JTextField tFA2;
	private JTextField tFItem3;
	private JTextField tFQ3;
	private JTextField tFU3;
	private JTextField tFTax3;
	private JTextField tFA3;
	private JTextField tFItem4;
	private JTextField tFQ4;
	private JTextField tFU4;
	private JTextField tFTax4;
	private JTextField tFA4;
	private JTextField tFItem5;
	private JTextField tFQ5;
	private JTextField tFU5;
	private JTextField tFTax5;
	private JTextField tFA5;
	private JTextField tFItem6;
	private JTextField tFQ6;
	private JTextField tFU6;
	private JTextField tFTax6;
	private JTextField tFA6;

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
		
		tFNumber = new JTextField();
		tFNumber.setFont(new Font("Tahoma", Font.PLAIN, 11));
		tFNumber.setText("[number]");
		tFNumber.setBounds(529, 96, 86, 20);
		contentPane.add(tFNumber);
		tFNumber.setColumns(10);
		
		tFDate = new JTextField();
		tFDate.setText("1/1/2018");
		tFDate.setBounds(625, 96, 98, 20);
		contentPane.add(tFDate);
		tFDate.setColumns(10);
		
		txtComNa = new JTextField();
		txtComNa.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				
			}
		});
		//txtCompanyName.addFocusListener();
		
		txtComNa.setText("Company Name");
		txtComNa.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtComNa.setBounds(44, 51, 146, 29);
		contentPane.add(txtComNa);
		txtComNa.setColumns(10);
		
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
		
		txtStreAdd = new JTextField();
		txtStreAdd.setText("Street Address");
		txtStreAdd.setBounds(44, 96, 86, 20);
		contentPane.add(txtStreAdd);
		txtStreAdd.setColumns(10);
		
		txtPho = new JTextField();
		txtPho.setText("Phone");
		txtPho.setBounds(44, 162, 124, 20);
		contentPane.add(txtPho);
		txtPho.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(44, 208, 458, 38);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("BILL TO");
		lblNewLabel_1.setBounds(10, 11, 92, 22);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		txtBName = new JTextField();
		txtBName.setText("[Name]");
		txtBName.setBounds(44, 257, 86, 20);
		contentPane.add(txtBName);
		txtBName.setColumns(10);
		
		txtBcompNa = new JTextField();
		txtBcompNa.setText("[Company Name]");
		txtBcompNa.setBounds(44, 288, 157, 20);
		contentPane.add(txtBcompNa);
		txtBcompNa.setColumns(10);
		
		txtBStreAdd = new JTextField();
		txtBStreAdd.setText("Street Address");
		txtBStreAdd.setBounds(44, 319, 86, 20);
		contentPane.add(txtBStreAdd);
		txtBStreAdd.setColumns(10);
		
		txtBCity = new JTextField();
		txtBCity.setText("[City]");
		txtBCity.setBounds(44, 353, 86, 20);
		contentPane.add(txtBCity);
		txtBCity.setColumns(10);
		
		txtBStre = new JTextField();
		txtBStre.setText("State");
		txtBStre.setBounds(144, 353, 86, 20);
		contentPane.add(txtBStre);
		txtBStre.setColumns(10);
		
		txtBZip = new JTextField();
		txtBZip.setText("Zip");
		txtBZip.setBounds(247, 353, 86, 20);
		contentPane.add(txtBZip);
		txtBZip.setColumns(10);
		
		txtBPho = new JTextField();
		txtBPho.setText("[Phone]");
		txtBPho.setBounds(44, 384, 86, 20);
		contentPane.add(txtBPho);
		txtBPho.setColumns(10);
		
		txtBEmailAdd = new JTextField();
		txtBEmailAdd.setText("[Email Address]");
		txtBEmailAdd.setBounds(44, 415, 86, 20);
		contentPane.add(txtBEmailAdd);
		txtBEmailAdd.setColumns(10);
		
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
		
		JLabel labItemDesc = new JLabel("Item Description");
		labItemDesc.setFont(new Font("Tahoma", Font.PLAIN, 13));
		labItemDesc.setBounds(10, 10, 113, 15);
		panel_3.add(labItemDesc);
		
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
		
		tFTotalAmo = new JTextField();
		tFTotalAmo.setText("$100.00");
		tFTotalAmo.setBounds(653, 760, 86, 20);
		contentPane.add(tFTotalAmo);
		tFTotalAmo.setColumns(10);
		
		tFItem1 = new JTextField();
		tFItem1.setBounds(44, 486, 345, 20);
		contentPane.add(tFItem1);
		tFItem1.setColumns(10);
		
		tFQ1 = new JTextField();
		tFQ1.setBounds(399, 486, 70, 20);
		contentPane.add(tFQ1);
		tFQ1.setColumns(10);
		
		tFU1 = new JTextField();
		tFU1.setBounds(479, 486, 70, 20);
		contentPane.add(tFU1);
		tFU1.setColumns(10);
		
		tFTax1 = new JTextField();
		tFTax1.setBounds(559, 486, 70, 20);
		contentPane.add(tFTax1);
		tFTax1.setColumns(10);
		
		tFA1 = new JTextField();
		tFA1.setBounds(639, 486, 100, 20);
		contentPane.add(tFA1);
		tFA1.setColumns(10);
		
		tFitem2 = new JTextField();
		tFitem2.setColumns(10);
		tFitem2.setBounds(44, 518, 345, 20);
		contentPane.add(tFitem2);
		
		tFQ2 = new JTextField();
		tFQ2.setColumns(10);
		tFQ2.setBounds(399, 518, 70, 20);
		contentPane.add(tFQ2);
		
		tFU2 = new JTextField();
		tFU2.setColumns(10);
		tFU2.setBounds(479, 518, 70, 20);
		contentPane.add(tFU2);
		
		tFTax2 = new JTextField();
		tFTax2.setColumns(10);
		tFTax2.setBounds(559, 518, 70, 20);
		contentPane.add(tFTax2);
		
		tFA2 = new JTextField();
		tFA2.setColumns(10);
		tFA2.setBounds(639, 518, 100, 20);
		contentPane.add(tFA2);
		
		tFItem3 = new JTextField();
		tFItem3.setColumns(10);
		tFItem3.setBounds(44, 549, 345, 20);
		contentPane.add(tFItem3);
		
		tFQ3 = new JTextField();
		tFQ3.setColumns(10);
		tFQ3.setBounds(399, 549, 70, 20);
		contentPane.add(tFQ3);
		
		tFU3 = new JTextField();
		tFU3.setColumns(10);
		tFU3.setBounds(479, 549, 70, 20);
		contentPane.add(tFU3);
		
		tFTax3 = new JTextField();
		tFTax3.setColumns(10);
		tFTax3.setBounds(559, 549, 70, 20);
		contentPane.add(tFTax3);
		
		tFA3 = new JTextField();
		tFA3.setColumns(10);
		tFA3.setBounds(639, 549, 100, 20);
		contentPane.add(tFA3);
		
		tFItem4 = new JTextField();
		tFItem4.setColumns(10);
		tFItem4.setBounds(44, 580, 345, 20);
		contentPane.add(tFItem4);
		
		tFQ4 = new JTextField();
		tFQ4.setColumns(10);
		tFQ4.setBounds(399, 580, 70, 20);
		contentPane.add(tFQ4);
		
		tFU4 = new JTextField();
		tFU4.setColumns(10);
		tFU4.setBounds(479, 580, 70, 20);
		contentPane.add(tFU4);
		
		tFTax4 = new JTextField();
		tFTax4.setColumns(10);
		tFTax4.setBounds(559, 580, 70, 20);
		contentPane.add(tFTax4);
		
		tFA4 = new JTextField();
		tFA4.setColumns(10);
		tFA4.setBounds(639, 580, 100, 20);
		contentPane.add(tFA4);
		
		tFItem5 = new JTextField();
		tFItem5.setColumns(10);
		tFItem5.setBounds(44, 611, 345, 20);
		contentPane.add(tFItem5);
		
		tFQ5 = new JTextField();
		tFQ5.setColumns(10);
		tFQ5.setBounds(399, 611, 70, 20);
		contentPane.add(tFQ5);
		
		tFU5 = new JTextField();
		tFU5.setColumns(10);
		tFU5.setBounds(479, 611, 70, 20);
		contentPane.add(tFU5);
		
		tFTax5 = new JTextField();
		tFTax5.setColumns(10);
		tFTax5.setBounds(559, 611, 70, 20);
		contentPane.add(tFTax5);
		
		tFA5 = new JTextField();
		tFA5.setColumns(10);
		tFA5.setBounds(639, 611, 100, 20);
		contentPane.add(tFA5);
		
		tFItem6 = new JTextField();
		tFItem6.setColumns(10);
		tFItem6.setBounds(44, 642, 345, 20);
		contentPane.add(tFItem6);
		
		tFQ6 = new JTextField();
		tFQ6.setColumns(10);
		tFQ6.setBounds(399, 642, 70, 20);
		contentPane.add(tFQ6);
		
		tFU6 = new JTextField();
		tFU6.setColumns(10);
		tFU6.setBounds(479, 642, 70, 20);
		contentPane.add(tFU6);
		
		tFTax6 = new JTextField();
		tFTax6.setColumns(10);
		tFTax6.setBounds(559, 642, 70, 20);
		contentPane.add(tFTax6);
		
		tFA6 = new JTextField();
		tFA6.setColumns(10);
		tFA6.setBounds(639, 642, 100, 20);
		contentPane.add(tFA6);
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

