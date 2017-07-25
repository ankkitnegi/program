import java.util.*;
class stock
{
	int stock_id;
	String name;
	int quantity;
	public void getdata()
	{
		Scanner obj=new Scanner(System.in);
		
		System.out.println("Enter stock_id:");
		stock_id=obj.nextInt();
		
		System.out.println("Enter name:");
		name=obj.nextLine();
		
		System.out.println("Enter quantity:");
		quantity=obj.nextInt();
	}
	public void purchase_stock()
	{
		int purchase;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter amount to purchase: ");
		purchase=obj.nextInt();
		quantity=quantity+purchase;
		
	}
	public void sale_stock()
	{
		int sale_stock;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter amount for sale: ");
		sale_stock=obj.nextInt();
		quantity=quantity-sale_stock;
	}
	public void display()
	{
		System.out.println("stock_id: "+stock_id);
		System.out.println("stock_name: "+name);
		System.out.println("quantity: "+quantity);
	}
}
class stockholder
{
	public static void main(String arg[])
	{
		stock obj1=new stock();
		obj1.getdata();
		obj1.purchase_stock();
		obj1.sale_stock();
		obj1.display();
	}
}
