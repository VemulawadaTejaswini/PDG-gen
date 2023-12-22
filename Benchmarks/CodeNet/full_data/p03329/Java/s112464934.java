import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(0);
		ts.add(1);
		for (int i = 6; i <= 100000; i = i * 6) {
			ts.add(i);
		}
		for (int i = 9; i <= 100000; i = i * 9) {
			ts.add(i);
		}
		int[] money = new int[ts.size()];
		int cnt = 0;
		for (int i : ts) {
			money[cnt] = i;
			cnt++;
		}
		int n = sc.nextInt();
		int[][] dp = new int[ts.size() + 1][n + 1];
		Arrays.fill(dp[0], 100001);
		dp[0][0] = 0;
		int i = 1;
		for (; i < ts.size(); i++) {
			for (int j = 0; j <= n; j++) {
				if (money[i] > j) {
					dp[i][j] = dp[i - 1][j];
				} else {
					dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - money[i]] + 1);
				}
			}
			if (money[i + 1] > n) {
				break;
			}
		}
		System.out.println(dp[i][n]);
	}
}
