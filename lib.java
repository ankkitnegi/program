import java.util.*;
class library
{
	int book_id;
	String book_name;
	String author_name;
	int quantity;
		
		public void read_data()
		{
			Scanner obj=new Scanner(System.in);
			System.out.println("Enter book_id:");
			book_id=obj.nextInt();
		
			System.out.println("Enter book_name:");
			book_name=obj.nextLine();
		
			System.out.println("Enter author name:");
			author_name=obj.nextLine();
			
			System.out.println("Enter quantity:");
			quantity=obj.nextInt();
		}
		public void issued_book()
		{
			int issued_book;
			Scanner obj=new Scanner(System.in);
			System.out.println("issued_book");
			issued_book=obj.nextInt();
			quantity=quantity-issued_book;
		}
		public void return_book()
		{
			int return_book;
			Scanner obj=new Scanner(System.in);
			System.out.println("return_book");
			return_book=obj.nextInt();
			quantity=quantity+return_book;
		}
		public void display()
		{
			System.out.println("book_id"+book_id);
			System.out.println("book_name"+book_name);
			System.out.println("author_name"+author_name);
			System.out.println("quantity"+quantity);
		}
}
		class lib
		{
			public static void main(String arg[])
			{
				library obj1=new library();
				obj1.read_data();
				obj1.issued_book();
				obj1.return_book();
				obj1.display();
				
			}
		}
