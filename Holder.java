import java.util.*;
class bank
{
String name;
int acc_no;
int balance;
public void getdata()
{
Scanner obj=new Scanner(System.in)
System.out.println("Enter name");
name=obj.nextLine();
System.out.println("Enter acc_no.");
acc_no=obj.nextInt();
System.out.println("Enter balance");
balance=obj.nextInt();
}
public void deposit_amount()
