import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static int maxn = 300 + 10;

	public static void main(String[] args) 
	{
		Scanner cin = new Scanner(System.in);
		double a[]=new double [200000+100];
		int n=cin.nextInt();
		int k=cin.nextInt();
		for(int i=1;i<=n;i++)
		{
			double s=cin.nextDouble();
			a[i]=(s+1)/2;
			
		}
		double ans=0;
		for(int i=1;i<=n-k+1;i++)
		{
			double sum=0;
			for(int j=i;j<=i+k-1;j++)
			{
				sum+=a[j];
			}
			if(sum>ans)
				ans=sum;
		}
		System.out.println(ans);
	}

}