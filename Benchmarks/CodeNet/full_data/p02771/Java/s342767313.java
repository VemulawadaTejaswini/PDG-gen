import java.util.*;

public class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		if(a==b && b==c)
		{
			System.out.println("No");
			System.exit(0);
		}
		
		else if(a==b)
		{
			System.out.println("Yes");
		}
		else if(c==b)
		{
			System.out.println("Yes");
		}
		else if(a==c)
		{
			System.out.println("Yes");
		}
		
		else
		{
			System.out.println("No");
		}
	}
}