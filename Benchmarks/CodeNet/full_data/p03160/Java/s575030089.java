import java.util.*;
import java.io.*;

public class Main {
	static long[][] memo;
	static int n,W;
	static int[] w;
	static long[] v;

	public static long knap(int i, int remW)
	{
		if (i==n)
			return 0;
		if (memo[i][remW]!=-1)
			return memo[i][remW];
		long leave = knap(i+1,remW);
		long take =0;
		if(remW>=w[i]) take = knap(i+1,remW-w[i])+v[i];
		return memo[i][remW]=Math.max(take,leave);

	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt(); 
		v = new long[n];
		w = new int[n];
		W = sc.nextInt();
	
		
		for (int i =0 ; i<n;i++)
		{
			w[i]=sc.nextInt();
			v[i]=sc.nextInt();
		}
		
		
		memo = new long[n][W+1];
		for (long [] a: memo)
		{
			Arrays.fill(a, -1);
		}
		System.out.println(knap(0,W));
		
	}

}
