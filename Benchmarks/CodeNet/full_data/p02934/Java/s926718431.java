import java.util.*;

public class Main
{
	public static void main(String [] Args)
	{
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		double ans=0.0;
		for(int i=0;i<n;i++)
		{
			double q=in.nextDouble();
			ans=ans+1.0/q;
		}
		ans=1.0/ans;
		System.out.println(ans);
	}
}
	