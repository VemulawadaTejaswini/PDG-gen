import java.util.Scanner;

class Main
{
	public static void main(String a[])
	{
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		if(x%y==0 || x==y)
		{
			System.out.println("-1");
			System.exit(0);
		}
		else if(y%x==0)
		{
			if((2*x)%y==0)
			{
				System.out.println(3*x);
			}
			else
			{
				System.out.println(2*x);
			}
		}
		else
		{
			System.out.println(2*x);
		}
	}
}