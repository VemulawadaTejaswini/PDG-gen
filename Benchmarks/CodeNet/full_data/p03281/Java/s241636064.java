import java.util.Scanner;

public class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n;
		n=sc.nextInt();
		int res,count,temp;
		res=0;
		if(n<105)
			System.out.println(0);
		else if(n==105)
			System.out.println(1);
		else
		{
			for(int i=106;i<=n;i++)
			{
				count=0;
				temp=i;
				for(int j=2;j<=i/2;i++)
				{
					if(temp%j==0)
					{
						temp=temp/j;
						count++;
					}
					if(temp==1)
						break;
				}
				if(count==3)
					res++;
			}
			System.out.println(res);
		}		
	}
}
