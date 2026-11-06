package templates;

public class Company {
	
	protected String name;
	protected String stockPrice;
	protected String ceo;
	protected String netPrice;
	
	//Default Constructor
	
	public Company() {
		
		this.name = "";
		this.stockPrice = "";
		this.ceo = "";
		this.netPrice = "";
		
	}
	
	
	//Parameterized constructor
	
	public Company(String n, String sp, String c, String np) {
		
		this.name = n;
		this.stockPrice = sp;
		this.ceo = c;
		this.netPrice = np;
		
	}
	
	//Get methods
	public String getName() {
		
		return this.name;
		
	}
	
	public String getStockPrice() {
		
		return this.stockPrice;
		
	}
	
	public String getCeo() {
		
		return this.ceo;
		
	}
	
	public String getNetPrice() {
		
		return this.netPrice;
		
	}
	
	//Set methods 
	public void setName(String n) {
		
		this.name = n;
		
	}
	
	public void setStockPrice(String sp) {
		
		this.stockPrice = sp;
		
	}
	
	public void setCeo(String c) {
		
		this.ceo = c;
		
	}
	
	public void setNetPrice(String np) {
		
		this.netPrice = np;
		
	}
	
	@Override
	
	public String toString() {
		
		return super.toString() + "." + this.name + "." + this.stockPrice + "."
				+ this.ceo + "." + this.netPrice;
 		
	}
	
}


