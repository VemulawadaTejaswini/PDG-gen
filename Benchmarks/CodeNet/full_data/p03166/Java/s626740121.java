import java.util.*;

public class Main
{
  static int n;
  static Integer[] memo;
  static ArrayList<Integer>[] G;
  public static void main(String[] args)
  {
	Scanner in = new Scanner(System.in);
    n = in.nextInt();
    int m = in.nextInt();
    G = new ArrayList[n];
    for (int i = 0; i < n; i++)
      G[i] = new ArrayList<>();
    for (int i = 0; i < m; i++)
      G[in.nextInt()-1].add(in.nextInt()-1);
    
    int max = 0;
    memo = new Integer[n];
    for (int i = 0; i < n; i++)
      if (memo[i] == null)
        max = Math.max(max, dp(i));
    System.out.println(max);
    in.close();
  }
  
  public static int dp(int at)
  {
    if (memo[at] != null)
      return memo[at];
    int ans = 0;
    for (int i : G[at])
      ans = Math.max(ans, 1+dp(i));
    return memo[at] = ans;
  }
}
