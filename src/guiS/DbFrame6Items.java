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
import javax.swing.JOptionPane;
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
	private Company compObj = new Company();
	private BillTo billtoObj = new BillTo();

	private JPanel contentPane;
	private JTextField tFNumber;
	private JTextField tFDate;
	private JTextField tFComNa;
	private JTextField tFCity;
	private JTextField tFState;
	private JTextField tFZip;
	private JTextField tFStreAdd;
	private JTextField tFPho;
	private JTextField tFBName;
	private JTextField tFBcompNa;
	private JTextField tFBStreAdd;
	private JTextField tFBCity;
	private JTextField tFBState;
	private JTextField tFBZip;
	private JTextField tFBPho;
	private JTextField tFBEmailAdd;
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
		
		tFComNa = new JTextField();
		
//		txtComNa.addFocusListener(new FocusAdapter() {
//			@Override
//			public void focusLost(FocusEvent arg0) {
//				
//			}
//		});
		
		tFComNa.setText("Company Name");
		tFComNa.setFont(new Font("Tahoma", Font.PLAIN, 16));
		tFComNa.setBounds(44, 51, 146, 29);
		contentPane.add(tFComNa);
		tFComNa.setColumns(10);
		
		tFCity = new JTextField();
		tFCity.setText("City");
		tFCity.setBounds(44, 131, 86, 20);
		contentPane.add(tFCity);
		tFCity.setColumns(10);
		
		tFState = new JTextField();
		tFState.setText("State");
		tFState.setBounds(140, 131, 86, 20);
		contentPane.add(tFState);
		tFState.setColumns(10);
		
		tFZip = new JTextField();
		tFZip.setText("Zip");
		tFZip.setBounds(236, 131, 86, 20);
		contentPane.add(tFZip);
		tFZip.setColumns(10);
		
		tFStreAdd = new JTextField();
		tFStreAdd.setText("Street Address");
		tFStreAdd.setBounds(44, 96, 86, 20);
		contentPane.add(tFStreAdd);
		tFStreAdd.setColumns(10);
		
		tFPho = new JTextField();
		tFPho.setText("Phone");
		tFPho.setBounds(44, 162, 124, 20);
		contentPane.add(tFPho);
		tFPho.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(44, 208, 458, 38);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("BILL TO");
		lblNewLabel_1.setBounds(10, 11, 92, 22);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		tFBName = new JTextField();
		tFBName.setText("[Name]");
		tFBName.setBounds(44, 257, 157, 20);
		contentPane.add(tFBName);
		tFBName.setColumns(10);
		
		tFBcompNa = new JTextField();
		tFBcompNa.setText("[Company Name]");
		tFBcompNa.setBounds(44, 288, 157, 20);
		contentPane.add(tFBcompNa);
		tFBcompNa.setColumns(10);
		
		tFBStreAdd = new JTextField();
		tFBStreAdd.setText("Street Address");
		tFBStreAdd.setBounds(44, 319, 157, 20);
		contentPane.add(tFBStreAdd);
		tFBStreAdd.setColumns(10);
		
		tFBCity = new JTextField();
		tFBCity.setText("[City]");
		tFBCity.setBounds(44, 350, 86, 20);
		contentPane.add(tFBCity);
		tFBCity.setColumns(10);
		
		tFBState = new JTextField();
		tFBState.setText("State");
		tFBState.setBounds(140, 350, 82, 20);
		contentPane.add(tFBState);
		tFBState.setColumns(10);
		
		tFBZip = new JTextField();
		tFBZip.setText("Zip");
		tFBZip.setBounds(233, 350, 86, 20);
		contentPane.add(tFBZip);
		tFBZip.setColumns(10);
		
		tFBPho = new JTextField();
		tFBPho.setText("[Phone]");
		tFBPho.setBounds(44, 384, 157, 20);
		contentPane.add(tFBPho);
		tFBPho.setColumns(10);
		
		tFBEmailAdd = new JTextField();
		tFBEmailAdd.setText("[Email Address]");
		tFBEmailAdd.setBounds(44, 415, 157, 20);
		contentPane.add(tFBEmailAdd);
		tFBEmailAdd.setColumns(10);
		
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
		tFitem2.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
			}
		});
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
		tFItem3.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
			}
		});
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
		tFItem4.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
			}
		});
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
		tFItem5.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
			}
		});
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
		tFItem6.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
			}
		});
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
		
		// focus listeners (lost)
		tFComNa.addFocusListener(new FocusLChar50(tFComNa, "tFComNa")); // need to
		tFCity.addFocusListener(new FocusLChar50(tFCity, "tFCity")); // this might cause a threading issue???
		tFState.addFocusListener(new FocusLChar50(tFState, "tFState")); 
		tFStreAdd.addFocusListener(new FocusLChar50(tFStreAdd, "tFStreAdd")); 
		tFBName.addFocusListener(new FocusLChar50(tFBName,"tFBName")); 
		tFBState.addFocusListener(new FocusLChar50(tFBState,"tFBState"));
		tFBcompNa.addFocusListener(new FocusLChar50(tFBcompNa,"tFBcompNa")); 
		tFBStreAdd.addFocusListener(new FocusLChar50(tFBStreAdd,"tFBStreAdd")); 
		tFBCity.addFocusListener(new FocusLChar50(tFBCity,"tFBCity")); 
		tFBEmailAdd.addFocusListener(new FocusLChar50(tFBEmailAdd,"tFBEmailAdd"));
		
		// focust listeners (lost)
		// these have are for zip code limit size 5 digits, enforce only digits
		
		tFZip.addFocusListener(new FocusLInt5Digits(tFZip, "tFZip"));
		tFBZip.addFocusListener(new FocusLInt5Digits(tFBZip, "tBFZip"));
		
	}
	
	public class FocusLChar250 implements FocusListener {
		
		private JTextField tFRef;
		private String caller;
		
		FocusLChar250(JTextField passedtF, String caller){
			this.tFRef = passedtF;
			this.caller = caller;
		}	

		@Override
		public void focusGained(FocusEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void focusLost(FocusEvent arg0) {
			if(!this.tFRef.getText().equals(""))
			{
				if(this.tFRef.getText().length() <= 250)
				{
					
				}
			}
		}
		
	}
	
	public class FocusLInt5Digits implements FocusListener {
		
		private JTextField tFRef;
		private String caller;
		
		FocusLInt5Digits(JTextField passedtF, String caller){
			this.tFRef = passedtF;
			this.caller = caller;
		}

		@Override
		public void focusGained(FocusEvent e) {
			
			
		}

		@Override
		public void focusLost(FocusEvent e) {
			if(!this.tFRef.getText().equals(""))
			{
				int result =0;
				try {
					result = Integer.parseInt(this.tFRef.getText());
				}
				catch (NumberFormatException ex)
				{
					result = 0;
					JOptionPane.showMessageDialog(null, "You entered invalid characters \n Please enter again");
					this.tFRef.setText("");
				}
				
				if(result > 99999) {
					result = 0;
					JOptionPane.showMessageDialog(null, "Invalid zip max 5 digits", "error", result);
					this.tFRef.setText("");
				}
				
				if(this.caller.equals("tFZip") && result != 0)
				{
					compObj.setZip(result);
				}
				
				if(this.caller.equals("tBFZip") && result != 0)
				{
					billtoObj.setbZip(result);
				}
			}
		}
	}
	// write comments for this 
	// write comments for this 
	
	public class FocusLChar50 implements FocusListener {
		
		private String caller;
		private JTextField tFRef;
		// use to string the check object?
		
		FocusLChar50(JTextField passedtF, String caller){
			this.tFRef = passedtF;
			this.caller = caller;
		}

		public FocusLChar50() {};
		@Override
		public void focusGained(FocusEvent arg0) {
		}				//private Company compObj = new Company();
						//private BillTo billtoObj = new BillTo();

		@Override
		public void focusLost(FocusEvent arg0) { // this should be written with get component
			if(!this.tFRef.getText().equals(""))
			{
				if(this.tFRef.getText().length() <= 50)
				{
					if(this.caller.equals("tFComNa")) {
						compObj.setName(this.tFRef.getText());} //System.out.println("this is test of get name " + compObj.getName());}
					if(this.caller.equals("tFCity")){
						compObj.setCity(this.tFRef.getText());}//System.out.println("this is a test of get city " + compObj.getCity());}
					if(this.caller.equals("tFState")){
						compObj.setState(this.tFRef.getText());}//System.out.println("this is a test of get state " + compObj.getState());}
					if(this.caller.equals("tFStreAdd")) {
						compObj.setStreetAddress(this.tFRef.getText());}//System.out.println("this is a test of get address " + compObj.getStreetAddress());}
					if(this.caller.equals("tFBName")) {
						billtoObj.setbName(this.tFRef.getText());//System.out.println("BName text!" + billtoObj.getbName());
					}
					if(this.caller.equals("tFBcompNa")) {
						billtoObj.setbComp(this.tFRef.getText());
						//System.out.println("BCompNa text!" + billtoObj.getbComp());
					}
					if(this.caller.equals("tFBState")) {
						billtoObj.setbState(this.tFRef.getText());
						//System.out.println("BState text!" + billtoObj.getbState());
					}
					if(this.caller.equals("tFBStreAdd"))
					{
						billtoObj.setbSAdd(this.tFRef.getText());
						//System.out.println("BStreetAdd text!" + billtoObj.getbSAdd());
					}
					if(this.caller.equals("tFBCity")) {
						billtoObj.setbCity(this.tFRef.getText());
						//System.out.println("BCity text!" + billtoObj.getbCity());
					}
					if(this.caller.equals("tFBEmailAdd"))
					{
						billtoObj.setbEmail(this.tFRef.getText());
						//System.out.println("BEmail text!" + billtoObj.getbEmail());
					}
						
				}
				else
				{
					this.tFRef.setText("");
					JOptionPane.showMessageDialog(null, "Data entry too long! Please abbreviate in some way");
				}
			}			
		}
	}
}

