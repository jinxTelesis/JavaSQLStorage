package guiS;

public class Company {
	
	private String name;
	private String streetAddress;
	private String city;
	private String state;
	private int zip;
	private String  phone;

	Company(){
		name ="";
		streetAddress ="";
		city ="";
		state ="";
		zip = 0;
		phone ="";
	}
	
	public void clearAll() {
		this.name = "";
		this.streetAddress = "";
		this.city = "";
		this.state = "";
		this.zip = 0;
		this.phone = "";
	}
	
	public void loadTestData() {
		this.name = "Big Company";
		this.streetAddress = "10 Baker st";
		this.city = "Melville";
		this.state = "NY";
		this.zip = 11747;
		this.phone = "1-603-567-7777";
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		if(zip < 0)
		{
			zip = 00000;
			System.out.println("issues with zip input");
		}
		
		this.zip = zip;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	// put phone filter in company object

}
