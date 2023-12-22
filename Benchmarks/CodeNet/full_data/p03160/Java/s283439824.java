import java.util.*;

public class Main
{
  static Integer[] memo;
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[] h = new int[n];
    for (int i = 0; i < n; i++)
      h[i] = in.nextInt();
    
  	memo = new Integer[n];
    System.out.println(dp(0));
    in.close();
  }
  
  public static int dp(int at)
  {
    if (at > n)
      	return (int)1e9;
    if (at == n)
      	return 0;
   	if (memo[at] != null)
    	return memo[at];
    return memo[at] = Math.min(1+dp(at+1), 1+dp(at+2));
 }
}