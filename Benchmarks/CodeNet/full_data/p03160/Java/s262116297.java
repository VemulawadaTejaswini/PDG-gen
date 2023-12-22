import java.util.Scanner;
public class Main
{
  public static void main (String args[])
  {
    Scanner in = new Scanner(System.in);
    int N = in.nextInt();
    
    int dp[] = new int[N+1];
    int H[] = new int[N+1];
    for (int i = 1; i <= N; i++)
    {
      H[i] = in.nextInt();
    }
    dp[1] = 0;
    dp[2] = Math.abs(H[1] - H[2]);
    for (int i = 3; i <= N; i++)
    {
      dp[i] = Math.min(dp[i-2] + Math.abs(H[i] - H[i-2]), 
                      dp[i-1] + Math.abs(H[i] - H[i-1]));
    }
    System.out.println(dp[N]);
  }
}