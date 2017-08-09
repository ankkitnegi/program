import java.util.*;
class Bank
{
public static void main(String[] args) 
	{
    Scanner obj = new Scanner(System.in);
    run_Bank myBank = new run_Bank();

    int choice = 2;

    do {
        
        System.out.println("1= Open a new bank account");
        System.out.println("2= Deposit to a bank account");
        System.out.println("3= Withdraw to bank account");
        System.out.println("4= Print mini statement");
		      System.out.println("5= Issue loan");
		      System.out.println("6= deposit_loan");
		      System.out.println("7= delete account");
        System.out.println("7= Exit");
        System.out.print("choose any one");
        choice = obj.nextInt();
        switch (choice) 
		{
            case 1: System.out.println("Enter a customer name");
                    String name = obj.next();
                    System.out.println("Enter a opening balance");
                    int d = obj.nextInt();
                    System.out.println("Account was created and it has the following number: " + myBank.openNewAccount(name, d));
                    break;
            case 2: System.out.println("Enter a account number");
                    int acc_no = obj.nextInt();
                    System.out.println("Enter a deposit amount");
                    int deposit_amount = obj.nextInt();
                    myBank.depositTo(acc_no, deposit_amount);
                    break;
            case 3: System.out.println("Enter a account number");
                    int acn = obj.nextInt();
                    System.out.println("Enter a withdraw amount");
                    int wa = obj.nextInt();
                    myBank.withdrawFrom(acn, wa);
                    break;
            case 4: System.out.println("Enter a account number");
                    int num = obj.nextInt();
                    myBank.printAccountInfo(num);
                    break;
            case 5: System.out.println("Enter Amount To issue Loan");
					int loan=obj.nextInt();
					myBank.issue_loan(loan);
					break;
			case 6: System.out.println("Enter Loan Deposit Amount");
					int deposit_loan=obj.nextInt();
					myBank.loan_deposit_amount(deposit_loan);
					break;
			case 7: System.out.println("Delete account");
					int status=obj.nextInt();
					myBank.delete_account(status);
			case 8: 		
        }
}
while (choice != '9');
}

static class run_Bank 
{
private BankAccount[] accounts;     // all the bank accounts at this bank
private int numOfAccounts;      // the number of bank accounts at this bank

// Constructor: A new run_Bank object initially doesn’t contain any accounts.
public run_Bank() 
	{
		accounts = new BankAccount[10];
		numOfAccounts = 0;
    }

// Creates a new bank account using the customer name and the opening balance given as parameters
// and returns the account number of this new account. It also adds this account into the account list
// of the run_Bank calling object.
public int openNewAccount(String customerName, int openingBalance) 
{

    BankAccount b = new BankAccount(customerName, openingBalance);
    accounts[numOfAccounts] = b;
    numOfAccounts++;
    return b.getAccountNum();
}

// Withdraws the given amount from the account whose account number is given. If the account is
// not available at the bank, it should print a message.
public void withdrawFrom(int accountNum, int amount) {
    for (int i =0; i<numOfAccounts; i++) {
        if (accountNum == accounts[i].getAccountNum()  ) {
            accounts[i].withdraw(amount);
            System.out.println("Amount withdrawn successfully");
            return;
        }
    }
    System.out.println("Account number not found.");
    }

// Deposits the given amount to the account whose account number is given. If the account is not
// available at the bank, it should print a message.
public void depositTo(int accountNum, int amount) 
{
    for (int i =0; i<numOfAccounts; i++) {
        if (accountNum == accounts[i].getAccountNum()  ) 
		{
            accounts[i].deposit(amount);
            System.out.println("Amount deposited successfully");
            
			return;
        }
    }
    System.out.println("Account number not found.");
}

// Prints the account number, the customer name and the balance of the bank account whose
// account number is given. If the account is not available at the bank, it should print a message.
public void printAccountInfo(int accountNum) {
    for (int i =0; i<numOfAccounts; i++) {
                if (accountNum == accounts[i].getAccountNum()  ) {
                    System.out.println(accounts[i].getAccountInfo());
                    return;
                }
            }
    System.out.println("Account number not found.");
}
}
static class BankAccount
	{

       private int accountNum;
       private String customerName;
       private int balance;
       private int[] transactions;
       private int numOfTransactions;
       private  static int noOfAccounts=0;

       public String getAccountInfo()
	   {
           return "Account number: " + accountNum + "\nCustomer Name: " + customerName + "\nBalance:" + balance +"\n";
       }

       public String getTransactionInfo(int n)
       {
            numOfTransactions = n;
            return Integer.toString(n);

        }

       public BankAccount(String abc, int xyz)
	   {
         customerName = abc;
         balance = xyz;
         noOfAccounts ++;
         accountNum = noOfAccounts;
         transactions = new int[10];
         transactions[0] = balance;
         numOfTransactions = 1;
       }

    public int getAccountNum(){
        return accountNum;
    }
    public void deposit(int amount)
	{

        if (amount<=0) 
		{
            System.out.println("Amount to be deposited should be positive");
        } 
		else 
		{
            balance = balance + amount;
            transactions[numOfTransactions] = amount;
            numOfTransactions++;
        }
    }
    public void withdraw(int amount)
    {
        if (amount<=0)
		{
             System.out.println("Amount to be withdrawn should be positive");
        }
        else
        {
            if (balance < amount) {
                System.out.println("Insufficient balance");
            } else {
                balance = balance - amount;
                transactions[numOfTransactions] = amount;
                numOfTransactions++;
            }
        }
    }
	public void issue_loan()
	{
		if (loan_balance=0)
		{
			System.out.println("Enter amount to issue Loan");
			if(loan_balance<2*balance)
			{
				System.out.println("You have successfully issued loan");
			}
			else
			{
				System.out.println("you have insufficient balance to issue loan");
			}	
		}
	}
	public void deposit loan()
	{
		if(loan_balance>0)
		{
			System.out.println("enter amount to deposit loan");
		}
		else
		{
			System.out.println("you dont have any loan balance");
		}
	}
	private void display_all_member(bank obj[])
	{
		int display i;
		for(i=o;i<obj.length;i++)
			
		
}
}

