import java.util.Scanner;

public class Main {
	static int N;
	static int[][] cost;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = Integer.parseInt(sc.nextLine());
		cost = new int[N][3];
		for (int i = 0; i < N; i++) {
			String[] line = sc.nextLine().split(" ");
			cost[i][0] = Integer.parseInt(line[0]);
			cost[i][1] = Integer.parseInt(line[1]);
			cost[i][2] = Integer.parseInt(line[2]);
		}

		int[][] dp = new int[N + 1][3];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < 3; k++) {
					if (j == k)
						continue;
					dp[i + 1][k] = Math.max(dp[i + 1][k], dp[i][j] + cost[i][k]);
				}
			}
		}
		System.out.println(Math.max(dp[N][0], Math.max(dp[N][1], dp[N][2])));
	}
}