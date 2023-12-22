import java.util.*;

public class Main
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] b = new int[n-1];
		for(int i=0;i<n-1;i++)
		{
			b[i]=scan.nextInt();
		}
		solve(n,b);
		scan.close();	
	}
	
	private static void solve(int n,int b[])
	{
		int a=b[0];
		for (int i = 0; i < n - 2; i++)
			if (b[i] <= b[i + 1])
				a += b[i];
			else
				a += b[i + 1];
		a += b[n - 2];
		System.out.println(a);
	}
}