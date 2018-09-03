package guiS;

public class Items {
	
	// rewrite items to be singular and make an array if items class.
	// rewrite items to be singular and make an array of items classes
	
	private String itemD;
	private int qty;
	private double unit;
	private double taxed;
	private double amount;
	
	public void clearAll() {
		this.itemD = "";
		this.qty = 0;
		this.unit = 0.0;
		this.taxed = 0.0;
		this.amount = 0.0;
	}
	
	public String getItemD() {
		return itemD;
	}
	public void setItemD(String itemD) {
		this.itemD = itemD;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public double getUnit() {
		return unit;
	}
	public void setUnit(double unit) {
		this.unit = unit;
	}
	public double getTaxed() {
		return taxed;
	}
	public void setTaxed(double taxed) {
		this.taxed = taxed;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}


}
