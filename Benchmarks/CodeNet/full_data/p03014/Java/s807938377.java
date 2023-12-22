import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String[] line = sc.nextLine().split(" ");
			int H = Integer.parseInt(line[0]);
			int W = Integer.parseInt(line[1]);
			int[][] grid = new int[H][W];
			int[][] L = new int[H][W];
			int[][] R = new int[H][W];
			int[][] D = new int[H][W];
			int[][] U = new int[H][W];
			for (int i = 0; i < H; i++) {
				line = sc.nextLine().split("");
				for (int j = 0; j < W; j++) {
					if ("#".equals(line[j])) {
						grid[i][j] = -1;
						continue;
					}
					L[i][j] = j == 0 ? 1 : L[i][j - 1] + 1;
					U[i][j] = i == 0 ? 1 : U[i - 1][j] + 1;
				}
			}
			for (int i = H - 1; i >= 0; i--) {
				for (int j = W - 1; j >= 0; j--) {
					if (grid[i][j] < 0) continue;
					R[i][j] = j == W - 1 ? 1 : R[i][j + 1] + 1;
					D[i][j] = i == H - 1 ? 1 : D[i + 1][j] + 1;
				}
			}
			int max = 0;
			for (int i = 0; i < H; i++) {
				for (int j = 0; j < W; j++) {
					max = Math.max(max, L[i][j] + R[i][j] + U[i][j] + D[i][j] - 3);
				}
			}
			System.out.println(max);
		}
	}
}