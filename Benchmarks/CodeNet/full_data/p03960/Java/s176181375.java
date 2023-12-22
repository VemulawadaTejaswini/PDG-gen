import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();

		char[][] C = new char[H][];
		for (int i = 0; i < H; i++) {
			C[i] = sc.next().toCharArray();
		}
		sc.close();

		int[][] cost = new int[H + 1][H + 1];
		int[][] wk = new int[H + 1][H + 1];
		int ans = 0;
		for (int w = 0; w < W - 1; w++) {
			for (int d = -H; d <= H; d++) {
				for (int left = Math.max(1, 1 - d); left <= Math.min(H,
						H - d); left++) {
					cost[left][left + d] = cost[left - 1][left + d - 1]
							+ (C[left - 1][w] == C[left + d - 1][w + 1] ? 1
									: 0);
				}
			}
			for (int i = 1; i <= H; i++) {
				for (int j = 1; j <= H; j++) {
					wk[i][j] = Math.min(wk[i - 1][j], wk[i][j - 1])
							+ cost[i][j];
				}
			}
			ans += wk[H][H];
		}

		System.out.println(ans);
	}
}
