package guiS;

public class InvoiceID {
	
	private String invoiceID ="";
	private String Date ="";
	
	public void clearAll(){
		this.invoiceID = "";
		this.Date = "";
	}
	
	public void loadTestData() {
		this.invoiceID = "z1000x";
		this.Date = "1/18/2019";
	}

	public String getInvoiceID() {
		return invoiceID;
	}
	public void setInvoiceID(String invoiceID) {
		this.invoiceID = invoiceID;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	
	

}
