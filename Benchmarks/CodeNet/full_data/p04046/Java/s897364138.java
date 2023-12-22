import java.util.Scanner;

public class Main{
	static int[][]  M = new int[10001][10001];
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int H, W, A, B;
		H = scanner.nextInt();
		W = scanner.nextInt();
		A = scanner.nextInt();
		B = scanner.nextInt();

		M[0][1] = 1;
		for (int i = 1; i < H + 1; i++) {
			for (int j = 1; j < W + 1; j++) {
				if (i > H - A && j < B + 1) {
					M[i][j] = 0;
					continue;
				}

				M[i][j] = (M[i - 1][j] + M[i][j - 1]) % 1000000007;
			}
		}
		System.out.println(M[H][W]);
	}
}