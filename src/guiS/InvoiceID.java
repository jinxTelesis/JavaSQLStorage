package guiS;

public class InvoiceID {
	
	private int invoiceID =0;
	private String Date ="";
	
	
	public int getInvoiceID() {
		return invoiceID;
	}
	public void setInvoiceID(int invoiceID) {
		
		if(invoiceID < 0)
		{
			invoiceID =0;
			System.out.println("Error id shouldn't be negative");
		}
		this.invoiceID = invoiceID;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	
	

}
