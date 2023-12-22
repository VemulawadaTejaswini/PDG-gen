import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
	public static void main (String[] args) {
      Scanner in = new Scanner(System.in);
      int N = in.nextInt();
      int[] a = new int[N];
      for (int i = 0; i < N; i++) {
        a[i] = in.nextInt();
      }
      int[] dp = new int[N];
      dp[0] = 0;
      dp[1] = Math.abs(a[0] - a[1]);
      for(int i = 2; i< N ;i++){
        dp[i] = Math.min(dp[i-1] + Math.abs(a[i] - a[i-1]), dp[i-2] + Math.abs(a[i] - a[i-2]));
      }
      System.out.println(dp[N-1]);
	}
}
