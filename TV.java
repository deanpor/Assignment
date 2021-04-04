public class TV extends Product {
	
	private String storeType;
	private String resolution;
	private String displaySize;
	
	//define constructor
	public TV(int itemNo, String productName, int qtyAvlb, double price, String proSts, String storeType, String resolution, String displaySize ) {
		super(itemNo, productName, qtyAvlb, price);
		this.storeType=storeType;
		this.resolution=resolution;
		this.displaySize=displaySize;
	
		
	}
	
	public String getStoreType() {
		
		return storeType;
	}
	
	public String getResolution() {
		return resolution;
	}
	
	public String getDisplaySize() {
		return displaySize;
	}
	
	public double getstckVal() {
	
		return super.getstckVal()+(super.getstckVal()*0.15);//add a 10 of the restocking fee to the stock value of TV
		
	}
	public void setStoreType(String StoreType) {
		storeType=StoreType;
	}
	
	public void setResolution(String Resolution) {
		resolution=Resolution;
	}
	
	public void setDisplaySize(String DisplaySize) {
		displaySize=DisplaySize;
	}
	
	/*public void setstckVal(Double StckVal) {
		super.setstckVal(StckVal);
		
	}
*/
	
	//Override the toString() method to return the information of the Product object as a String.
	
	
@Override
public String toString() {
	
	StringBuilder str = new StringBuilder();
	str.append("Item number : "+super.getitemNo());
	str.append("\nProduct name:"+super.getproductName());
	str.append("\nQuantity available:"+super.getqtyAvlb());
	str.append("\nPrice (RM):"+super.getprice());
	str.append("\nStock value (RM):"+super.getstckVal());
	str.append("\nProduct status:"+super.getproSts());
	str.append("\nStore Type: "+storeType);
	str.append("\nResolution: "+resolution);
	str.append("\nDisplay size: "+displaySize);
	return str.toString();
	
}


}
