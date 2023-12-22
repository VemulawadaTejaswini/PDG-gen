import java.util.*;
import java.io.*;

public class Main
{
  final long mod = (long)1e9+7;
  int n, m;
  boolean[] a;
  int[] dp;
  
  Main(Scanner in, PrintWriter out)
  {
	n = in.nextInt();
    m = in.nextInt();
    a = new boolean[n+2];
    for (int i = 0; i < m; i++)
      a[in.nextInt()] = true;
    dp = new int[n];
    Arrays.fill(dp, -1);
    out.println(dp(0));
  }
  
  int dp(int at)
  {
    if (at == n) return 1;
    if (dp[at] != -1) return dp[at];
    int cnt = 0;
    if (!a[at+1]) cnt += dp(at+1);
    if (!a[at+2]) cnt += dp(at+2);
    return dp[at] = cnt;
  }

  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    PrintWriter out = new PrintWriter(System.out);
    new	Main(in, out);
    out.close();
  } 
}
