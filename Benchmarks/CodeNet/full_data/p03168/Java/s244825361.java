import java.util.*;

public class Main
{
  static int n;
  static double[] p;
  static Double[][] memo;
  public static void main(String[] args)
  {
	Scanner in = new Scanner(System.in);
    n = in.nextInt();
    p = new double[n];
    for (int i = 0; i < n; i++)
      p[i] = in.nextDouble();
    memo = new Double[n][n];
    System.out.println(dp(0, 0));
    in.close();
  }
  
  public static double dp(int at, int cnt)
  {
	if (at == n)
      return cnt > n/2 ? 1.0 : 0.0;
    if (memo[at][cnt] != null)
      return memo[at][cnt];
    double ans = 0;
    ans = p[at]*dp(at+1, cnt+1)+(1-p[at])*dp(at+1, cnt);
    return memo[at][cnt] = ans;
 }
} 