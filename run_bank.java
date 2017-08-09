import java.util.*;
{
	Scanner obj=new Scanner(System.in)
	class bank()
	{
		private int_no;
		private String name;
		private int balance;
		private int loan_balance;
		private int status=1;
		private account_type;
		private String phone_no;
		private int []transactions;
		private int account_no;
		private static int generate_account_no=1;
		
		public bank()
		{
			
	        System.out.println("which account type you want to create: 1=saving\n 2=current");
	        account_type=obj.nextInt();
			this.loan_balance=0
	        if(account_type=1)
	        {
		        int saving;
		        System.out.println("You have created your saving account");
		        account_type=saving;
				return;
	        }
	        else if(acount type=2)
			{
				int current;
				System.out.println("you have created your current account");
				account_type=current;
				return;
			}
			else
			{
				System.out.println("choose between 1 or 2");
				return;
			}
			
			System.out.println("enter your name");
			this.name=obj.next();
			System.out.println("enter opening balance");
			this.balance=obj.nextInt();
			this.account_no=generate_account_no;
			generate_account_no++;
			System.out.println("account was created & your account no. is :"+MyBank.OpenNewAccount(this.name,this.balance,this.loan_balance);
		}	
		public void deposit()
		{
			int deposit_amount;
			System.out.println("enter account number :");
			acno=obj.nextInt();
			
			System.out.println("enter amount to deposit");
			this.deposit_amount=obj.nextInt();
			this.balance=this.balance+this.deposit_amount;
			MyBank.depositTo(acno,deposit_amount)
		}
		public withdraw()
		{
			System.out.println("enter account no.");
			int acn=obj.nextInt();
			System.out.println("enter withdraw amount");
			int wa=obj.nextInt();
			if(wa<=balance)
			{
				System.out.println("you have sucessfully withdraw amount");
				this.balance=this.balance-this.wa;
			}
			else
			{
				System.out.println("Insufficient amount to withdraw....");
			    return;
			}
		}
		public mini_statement()
		{
			System.out.println("enter account number");
			int num=obj.nextInt();
			system.out.println("account number"+account_no+\n"name"+name\n "balance"+balance\n);
		}
		public issue_loan()
		{
			System.out.println("enter account number");
			int il=obj.nextInt();
			if(loan_balance=0)
			{
				System.out.println("enter amount to issue loan");
				int loan=obj.nextInt();
				if(account_type=1&&loan<=2*balance)
				{
					balance=balance-loan;
					loan=loan*0.1;
					loan_balance=loan_balance+loan;
					
				}
				else(account_type=2&&loan<2*balance)
				{
					balance=balance-loan;
					loan=loan*0.2;
					loan_balance=loan_balance+loan;
				}
			}
			else 
			{
				System.out.println("you've already taken loan")
			}
		}
		public deposit_loan()
		{
			System.out.println("enter account number");
			int al=obj.nextInt();
			{
				System.out.println("enter amount to deposit loan");
				int deposit_l=obj.nextInt();
				loan_balance=loan_balance-deposit_l;
			}
		}
		private display_all_member()
		{
			int i;
			for(i=0;i<obj.length;i++)
				if(status=1)
				{
					obj[i]mini_statement()
				}					
		}
		public delete account()
		{
			if(balance=0&&loan_balance=0)
			{
				System.out.println("are you sure? 1 =yes \n 2=no.");
				int sure=obj.nextInt
				if(sure=1)
				{
					System.out.println(status=0);
				}
				else if (sure=2)
				{
					return;
				}
				else 
				{
					System.out.println("enter 1 or 2.....");
				}
			}
		}
	}
	class run_bank
	{
		public static void main(Strin arg[])
		{
			bank obj=new bank();
			int choice=2,n,index=0;
			
			do
			{
				System.out.println("open a new bank account");
				System.out.println
				System.out.println
				System.out.println
				System.out.println
				System.out.println
				System.out.println
				System.out.println
				System.out.println
				System.out.println
				choice=obj.nextInt();
				
				switch(choice)
				{
					case 1:
					case 2:
					case 3:
					case 4:
					case 5:
					case 6:
					case
					case
					case
				
				

				
		
			
			
				
	        