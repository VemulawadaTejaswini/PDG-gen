import java.util.*;
import java.io.*;

public class Main
{
  	int n;
  	long k, tot = 0, mod = (long)1e9+7;
  	long[][] a, I, ans;
  
    Main(Scanner in, PrintWriter out)
    {    	
      n = in.nextInt();
      k = in.nextLong();
      a = new long[n][n];
      for (int i = 0; i < n; i++)
      	for (int j = 0; j < n; j++)
          a[i][j] = in.nextLong();
      I = new long[n][n];
      for (int i = 0; i < n; i++) I[i][i]++;
      ans = exp(a, k);
      for (int i = 0; i < n; i++)
        for (int j = 0; j < n; j++)
        {
          tot += ans[i][j];
          if (tot >= mod) tot -= mod;
        }
      out.println(tot);
    }
  
  	long[][] exp(long[][] a, long b)
    {
      if (b == 0) return I;
      if (b == 1) return a;
      long[][] ans = exp(a, b/2);
      ans = mult(ans, ans);
      if (b %2 == 0) return ans;
      return mult(ans, a);
    }
  
  	long[][] mult(long[][] a, long[][] b)
    {
      long[][] res = new long[n][n];
      for (int i = 0; i < n; i++)
        for (int j = 0; j < n; j++)
          for (int k = 0; k < n; k++)
          {
            res[i][j] += a[i][k]*b[k][j];
            if (res[i][j] >= mod) res[i][j] -= mod;
          }
      return res;
    }
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		new	Main(in, out);
		out.close();
	} 
}