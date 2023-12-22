import java.util.*;
public class Main {
   private static int h[];
   private static int dp[];


  public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
        h = new int[n];
        dp = new int[n];

        for (int i = 0; i < n; i++) {
          h[i] = sc.nextInt();
        }

		// 30 10 60 10 60 50  
		dp[0] = 0;
		dp[1] = Math.abs(h[0] - h[1]);	//20
		for (int i=2; i < n; i++) {
			dp[i]=aaaa(i);
		}
		System.out.println(dp[n-1]);
	}

	private static int aaaa(int i) {
		int a = Math.abs(h[i] - h[i-1]); //i = 2  50
		int b = Math.abs(h[i] - h[i-2]); //       30

		return Math.min(dp[i-2] + b, dp[i-1] + a);
	}
}



