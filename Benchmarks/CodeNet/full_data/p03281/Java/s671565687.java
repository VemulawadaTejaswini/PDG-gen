import java.util.Scanner;

public class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n;
		n=sc.nextInt();
		int res,count,temp;
		res=1;
		if(n<105)
			System.out.println(0);
		else if(n==105)
			System.out.println(1);
		else
		{
			for(int i=107;i<=n;i=i+2)
			{
				count=0;
				temp=i;
				for(int j=2;j<=i/2;j=j+2)
				{
					if(temp%j==0)
					{
						count++;
					}
				}
				if(count==6)
					res++;
			}
			System.out.println(res);
		}		
	}
}
