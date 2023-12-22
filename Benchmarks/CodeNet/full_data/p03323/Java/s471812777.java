import java.util.*;

public class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		if(a+b<=16)
		{
			if(a<9 && b<9)
			{
				if(a%2==0 || b%2==1 && a%2==1 || b%2==0)
				{
					System.out.println("Yay!");
				}
				else
				{
					System.out.println(": (");
				}
			}
			else
			{
				System.out.println(": (");
			}
		}
		else
		{
			System.out.println(": (");
		}
	}
}