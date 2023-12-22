import java.util.*;
class Main
{
	public static void main(String arg[])
	{
	    int sum=0;
		try
		{
			Scanner sc = new Scanner(System.in);
			int n=sc.nextInt();
			int k[]=new int[100];
			for(int j=0;j<n;j++)
			{
			    k[j]=sc.nextInt();
			}
			for(int j=0;j<n;j++)
			{
			    int s1=k[j]-n;
			    int s=s1*s1;
			    sum=s+sum;
			}
			System.out.println(sum);
		}
		catch(InputMismatchException e)
		{
		    System.out.println("enter numeric value ");
		}
	}
}