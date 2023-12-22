import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), m = in.nextInt();
		System.out.println(ncr(m, 2) + ncr(n, 2));
	}
	static int ncr(int n, int r)
	{
		if(n < r)
			return 0;
		r = Math.min(n - r, r);
		int ans = 1;
		for(int i = 1; i <= r; ++i)
		{
			ans *= (n - r + i);
			ans /= i;
		}
		return ans;
	}
}
