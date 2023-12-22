import java.util.*;

public class Main
{
  static int n, k;
  static int[] h;
  static Integer[] memo;
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    n = in.nextInt();
    k = in.nextInt();
    h = new int[n];
    for (int i = 0; i < n; i++)
      h[i] = in.nextInt();
    
    memo = new Integer[n];
    System.out.println(dp(0));
    in.close();
  }
  
  public static int dp(int at)
  {
	if (at == n-1)
      return 0;
    if (memo[at] != null)
      return memo[at];
    int ans = 0;
    for (int i = 1; i <= k; i++)
      if (at+i <= n-1)
        ans = (int)Math.min(ans, (int)Math.abs(h[at+i]-h[at])+dp(at+i));
    return memo[at] = ans;
  }
}
