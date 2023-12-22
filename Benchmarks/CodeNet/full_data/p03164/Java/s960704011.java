import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long W = sc.nextInt();
		final int vMax = 1000;
		final long wMax = 1000000000;
		long[][] dp = new long[N + 1][vMax + 1];
		long[] wList = new long[N];
		int[] vList = new int[N];
		for (int i = 0; i < N; i++) {
			wList[i] = sc.nextInt();
			vList[i] = sc.nextInt();
		}
		for (int i = 0; i < vMax + 1; i++) {
			dp[0][i] = wMax + 1;
		}

		int max = 0;

		for (int i = 1; i < N + 1; i++) {
			for (int j = 0; j < vMax + 1; j++) {
				if (j <= vList[i - 1]) {
					dp[i][j] = Math.min(dp[i - 1][j], wList[i - 1]);
				}else{
					dp[i][j] = Math.min(dp[i - 1][j], dp[i - 1][j - vList[i - 1]] + wList[i - 1]);
				}
				if(dp[i][j] >= wMax){
					dp[i][j] = wMax;
				}else if(dp[i][j] <= W && max < j){
					max = j;
				}
			}
		}
		System.out.println(max);
	}

}