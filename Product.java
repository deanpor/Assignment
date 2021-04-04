public abstract class Product {//superclass
	
	private int itemNo;
	private String productName;
	private int qtyAvlb;//quantity available
	private double price;
	private double stckVal;//stock value
	private String proSts = "Active";//product status
	
	//default constructor

	public Product() {
		//empty body
	}
	
	//create a constructor that requires an integers arguments representing the item number
	public Product(int itemNo, String productName, int qtyAvlb, double price) {
		
		this.itemNo = itemNo;
		this.productName = productName;
		this.qtyAvlb= qtyAvlb;
		this.price=price;
				
		
		
	}
	//get method
	
	public int getitemNo() {
		return itemNo;
	}
	
	public String getproductName() {
		return productName;
	}
	
	public int getqtyAvlb() {
		return qtyAvlb;
	}
	
	public double getprice() {
		return price;
	}
	
	public double getstckVal() {
	
		stckVal=qtyAvlb*price;
		
		return stckVal;
	}
	
	public String getproSts() {
		return proSts;
	}
	
	//Set methods
	
	public void setitemNo(int itemNo) {
		this.itemNo=itemNo;
		
	}
	
	public void setproductName(String productName) {
		this.productName=productName;
	}
	
	public void setqtyAvlb(int qtyAvlb) {
		this.qtyAvlb=qtyAvlb;
	}
	
	public void setprice(double price) {
		this.price=price;
	}
	

	
	public void setproSts(String proSts) {
		this.proSts=proSts;
	}
	//Override the toString() method to return the information of the Product object as a String.
	

	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append("Item number : "+itemNo);
		str.append("\nProduct name:"+productName);
		str.append("\nQuantity available:"+qtyAvlb);
		str.append("\nPrice (RM):"+price);
		str.append("\nStock value (RM):"+stckVal);
		str.append("\nProduct status:"+proSts);
		return str.toString();
		
	}
	
}
