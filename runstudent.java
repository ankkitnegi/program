import java.util.*;
class student
{
	String name;
	int roll_no;
	float marks;
	
	public void getdata()
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("enter name");
		name=obj.nextLine();
		
		System.out.println("enter Roll no");
		roll_no=obj.nextInt();
		
		System.out.println("enter marks");
		marks=obj.nextFloat();
	}
	public void display()
	{
		System.out.println("name "+name);
		System.out.println("roll_no "+roll_no);
		System.out.println("marks "+marks);
	}
}
class runstudent
{
	public static void main(String arg[])
	{
		student obj1=new student();
		obj1.getdata();
		obj1.display();
	}
	{
		student obj2=new student();
		obj2.getdata();
		obj2.display();
		
	}
}