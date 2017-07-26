class Reverse
{
	public static void main(String arg[])
	{
		int num=123;
		int num1=0;
		while(num!=0)
		{
			num1=num1*10;
			num1=num1+num%10;
			num=num/10;
		}
		System.out.println("Reverse is:"+num1);
	
	}
}