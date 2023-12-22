import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();
		int n = scanner.nextInt();
		
		long sum=0;
		
		long[] p = new long[m];
		long[] q = new long[n];
		for (int i=0;i<m;i++)
		{
			p[i] = scanner.nextInt();
			sum += p[i] * (n+1);
		}
		for (int i=0;i<n;i++)
		{
			q[i] = scanner.nextInt();
			sum += q[i] * (m+1);
		}
		
		//System.out.println(sum);
		
		Arrays.sort(p);
		Arrays.sort(q);
		int x=m-1, y=n-1;
		while (x!=-1 && y!=-1)
		{
			if (y==-1 || (x>=0 && p[x] >= q[y]))
			{
				sum -= p[x] * (y+1);
				x--;
			}
			else
			{
				sum -= q[y] * (x+1);
				y--;
			}
		}
		System.out.println(sum);
	}
}