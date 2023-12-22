import java.util.*;

public class Main
{
  static int n, k;
  static int[] a;
  static Boolean[][] memo;
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
   	n = in.nextInt();
    k = in.nextInt();
    a = new int[n];
    for (int i = 0; i < n; i++)
      a[i] = in.nextInt();
    memo = new Boolean[2][k+1];
    System.out.println(dp(0, k) ? "First" : "Second");
    in.close();
  }
  
  public static boolean dp(int who, int left)
  {
	if (left < a[0])
      return false;
    if (memo[who][left] != null)
      return memo[who][left];
    boolean lose = true;
    for (int i = 0; i < n; i++)
      if (a[i] <= left)
        lose &= dp(1-who, left-a[i]);
    return memo[who][left] = !lose;
  }
}