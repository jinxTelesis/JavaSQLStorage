package guiS;

public class BillTo {
	
	private String bName;
	private String bComp;
	private String bSAdd;
	private String bCity;
	private String bState;
	private int bZip;
	private String bPhone;
	private String bEmail;
	
	public void clearAll() {
		this.bName = "";
		this.bComp = "";
		this.bSAdd = "";
		this.bCity = "";
		this.bState = "";
		this.bZip = 0;
		this.bPhone = "";
		this.bEmail = "";
	}
	
	public void loadTestData() {
		this.bName = "Jimmy P";
		this.bComp = "Munford and Sons";
		this.bSAdd = "20 Water Street";
		this.bCity = "Melville";
		this.bState = "NM";
		this.bZip = 17881;
		this.bPhone = "1-999-999-999";
		this.bEmail = "George.com@busyst";
	}
	
	public String getbName() {
		return bName;
	}
	public void setbName(String bName) {
		this.bName = bName;
	}
	public String getbComp() {
		return bComp;
	}
	public void setbComp(String bComp) {
		this.bComp = bComp;
	}
	public String getbSAdd() {
		return bSAdd;
	}
	public void setbSAdd(String bSAdd) {
		this.bSAdd = bSAdd;
	}
	public String getbCity() {
		return bCity;
	}
	public void setbCity(String bCity) {
		this.bCity = bCity;
	}
	public String getbState() {
		return bState;
	}
	public void setbState(String bState) {
		this.bState = bState;
	}
	public int getbZip() {
		return bZip;
	}
	public void setbZip(int bZip) {
		
		if(bZip < 0)
		{
			bZip = 00000;
			System.out.println("Issue setting bZip!!! fix");
		}
		this.bZip = bZip;
	}
	public String getpPhone() {
		return bPhone;
	}
	public void setpPhone(String pPhone) {
		this.bPhone = pPhone;
	}
	public String getbEmail() {
		return bEmail;
	}
	public void setbEmail(String bEmail) {
		this.bEmail = bEmail;
	}
	
	
	

}
