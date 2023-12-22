import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int limit = in.nextInt();

		int weight[] = new int[num + 1];
		int value[] = new int[num + 1];
		for ( int i = 1; i <= num; i++ ) {
			weight[i] = in.nextInt();
			value[i] = in.nextInt();
		}

		long dp[][] = new long[num + 1][limit + 1];
		for ( int w = 1; w <= limit; w++ ) {
			for ( int n = 1; n <= num; n++ ) {
				if ( w - weight[n] < 0 ) {
					dp[n][w] = dp[n - 1][w];
				} else {
					dp[n][w] = Math.max(dp[n - 1][w - weight[n]] + value[n], dp[n - 1][w]);
				}
			}
		}

		System.out.println(dp[num][limit]);
		in.close();
	}
}