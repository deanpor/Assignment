import java.util.ArrayList;
import java.util.Scanner;

public class StockManagement {
	
    static int opt;
	static ArrayList<Product> refrigerators = new ArrayList<Product>();
	static ArrayList<Product> tv = new ArrayList<Product>();
	
	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		
		refrigerators.add(new Refrigerator (333, "Daisen refrigerator", 20, 2000.00,"Acitve", "Nice", "Blue","Big"));
		refrigerators.add(new Refrigerator (322, "Polar refrigerator", 19, 2500.00, "Acitve","Bad", "Red"," Big"));
		tv.add(new TV (486, "Sharp TV", 38, 2600.00, "Active"， "Tesco", "HD","Big Display size"));
		tv.add(new TV (488, "Hitachi TV", 37, 2800.00, "Active", "Giant", "Non HD","small Display size"));
		
		//Call the view product function to print out all the elements in an array list
	
		System.out.println("The stock name that currently avaible in store are shown as below:");
		System.out.println();
	
		//Print out the product name
		
		for (int i=0;i<refrigerators.size();i++) {
			
			System.out.println(refrigerators.get(i).getproductName());
			
		}
		
		for (int i=0;i<tv.size();i++) {
			System.out.println(tv.get(i).getproductName());
			
			
		}
		
		System.out.println();
		
	//call the menu method to let the user choose the option
		menu(opt);
		
		switch (opt) {
		case 1:
			ViewProduct();
	
			break;
			
		case 2:
			
			//call add products function
			
			
			break;
			
		case 3:
			
			//call deduct product function
			
			break;
			
		case 4:
			
			//call set discontinued function
			
			break;
			
		case 0:
			
			//exit program
			
			break;
				
		}
		

		
	input.close();	
}
	
	
	public static void menu(int Option) {
		System.out.println("1.View Stock");
		System.out.println("2.Add Stock");
		System.out.println("3.Deduct Stock");
		System.out.println("4.Discontinue a product");
		System.out.println("0.Exit");
		System.out.println("Please enter a menu option:");		
	    Scanner input= new Scanner(System.in);
	    Option=input.nextInt();
	    opt=Option;		
		input.close();
	}
	
	//method that will shown out all the information of the stock
	public static void ViewProduct() {
		Scanner input= new Scanner(System.in);
		
		System.out.println("Please key in the number of element that you would like to print out: ");
		int element=input.nextInt();
		
		System.out.println("Please key in 'refrigerators' or 'tv' taht you would like to display");
		String choice=input.next();
		
		if(choice == "refrigerators")
		{
					for (int i=0;i<element;i++) {
					System.out.println(refrigerators.get(i));
					System.out.println();
		}
					
		}
		else
			if(choice=="tv")
			{		for (int i=0;i<element;i++) {
				    System.out.println(tv.get(i));
				   System.out.println();
				
			
			}
			}
		
		
	input.close();	
		
	}

	
	public static void AddStock() {
		
	}

	
	public static void DeductStock() {
		
	}

	
	public static void SetDiscontinued() {
		
	}

}
