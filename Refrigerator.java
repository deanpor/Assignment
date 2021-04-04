public class Refrigerator extends Product{
	
	private String doorDesign;//door design
	private String color;
	private String capacity;
	
	//define constructor
	public Refrigerator(int itemNo, String productName, int qtyAvlb, double price, String proSts, String doorDesign, String color, String capacity ) {
		super(itemNo, productName, qtyAvlb, price);
		this.doorDesign=doorDesign;
		this.color=color;
		this.capacity=capacity;
		
	}
	
	public String getDoorDesign() {
		
		return doorDesign;
	}
	
	public String getColor() {
		return color;
	}
	
	public String getCapacity() {
		return capacity;
	}
	
	public double getstckVal() {
		
		
		return super.getstckVal()+(super.getstckVal()*0.25);//add a 25% of the restocking fee to the stock value
		
	}
	public void setDoorDesign(String DoorDesign) {
		doorDesign=DoorDesign;
	}
	
	public void setColor(String Color) {
		color=Color;
	}
	
	public void setCapacity(String Capacity) {
		capacity=Capacity;
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
	str.append("\nDoor Design: "+doorDesign);
	str.append("\nColor: "+color);
	str.append("\nCapacity: "+capacity);
	return str.toString();
	
}


}
