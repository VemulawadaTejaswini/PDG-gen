import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int P = sc.nextInt();
		String S = sc.next();
		sc.close();

		int[][] dp = new int[N + 1][N + 1];
		int ans = 0;

		for (int i = 0; i < N; i++) {
			for (int j = i + 1; j < N + 1; j++) {
				if (dp[i][j] == 0) {
					long part = Long.parseLong(S.substring(i, j));
					if (part % P == 0) {
						ans++;
					}
					dp[i][j] = 1;
				}
			}
		}

		System.out.println(ans);
	}

}
