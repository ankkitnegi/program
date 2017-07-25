import java.util.*;
class Bank
{
	String Name;
	int account_no;
	float Balance;
	
		public void getdata()
		{
			Scanner obj=new Scanner(System.in);
			System.out.println("Enter Name : ");
			Name=obj.nextLine();
		
			System.out.println("Enter account_no : ");
			account_no=obj.nextInt();
		
			System.out.println("Enter Balance : ");
			Balance=obj.nextFloat();
		}
		public void Deposit_amount()
		{
			int Deposit;
			Scanner obj=new Scanner(System.in);
			System.out.println("Enter amount to deposit");
			Deposit=obj.nextInt();
			Balance=Balance+Deposit;
		}	
		public void Withdraw_amount()
		{
			int Withdraw;
			Scanner obj=new Scanner(System.in);
			System.out.println("Ener amout to withdraw");
			Withdraw=obj.nextInt();
			Balance=Balance-Withdraw;
		}
		
		public void Mini_Statement()
		{
			System.out.println("Name:"+Name);
			System.out.println("account_no.:"+account_no);
			System.out.println("Balance"+Balance);
		}
	
}
class Holder
{
public static void main(String arg[])
	{
		Bank obj1=new Bank();
		obj1.getdata();
		obj1.Deposit_amount();
		obj1.Withdraw_amount();
		obj1.Mini_Statement();
	}
}
	
