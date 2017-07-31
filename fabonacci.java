class fabonacci
{
	public static void main(String[] ar)
	{
		int a=1,b=2,c,d=10,i;
		System.out.println(a+"\n" +b);
		for(i=2;i<d;i++)
		{
			c=a+b;
			System.out.println(" "+c);
			a=b;
			b=c;
		}
		
	}
}