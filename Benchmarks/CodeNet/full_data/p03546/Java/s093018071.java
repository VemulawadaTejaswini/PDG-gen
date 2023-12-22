
import java.util.*;

public class Main{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int H, W;
		H = sc.nextInt();
		W = sc.nextInt();

		long dp[][] = new long[11][11];
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				dp[i][j] = sc.nextInt();
			}
		}
		int wa[][] = new int[H][W];
		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				wa[i][j] = sc.nextInt();
			}
		}
		for (int i= 0; i < 10; i++) {
			for (int j= 0; j < 10;j++) {
				for (int k= 0; k < 10; k++) {
					dp[i][j] = Math.min(dp[i][j], dp[i][k] + dp[k][j]);
				}
			}
		}
		long ans = 0;
		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
                                
				if (wa[i][j] > 1)
					ans += dp[wa[i][j]][1];
			}
		}
		System.out.println(ans);
	}

}
