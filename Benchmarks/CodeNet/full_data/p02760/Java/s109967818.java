import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int[][] a = new int[3][3];
		boolean[][] f = new boolean[3][3];

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				a[i][j] = scanner.nextInt();
			}
		}

		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			int b = scanner.nextInt();
			find(a, f, b);
		}

		boolean result = check(f);
		System.out.println((result) ? "Yes" : "No");
	}

	private static void find(int[][] a, boolean[][] f, int b) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (b == a[i][j]) {
					f[i][j] = true;
					return;
				}
			}
		}
	}

	private static boolean check(boolean[][] f) {
		boolean diagonalUpFlag = true;
		boolean diagonalDownFlag = true;
		for (int i = 0; i < 3; i++) {
			boolean horizontalFlag = true;
			boolean verticalFlag = true;
			for (int j = 0; j < 3; j++) {
				horizontalFlag &= f[i][j];
				verticalFlag &= f[j][i];
			}
			if (horizontalFlag || verticalFlag) {
				return true;
			}
			diagonalUpFlag &= f[i][2 - i];
			diagonalDownFlag &= f[i][i];
		}
		if (diagonalUpFlag || diagonalDownFlag) {
			return true;
		}
		return false;
	}

}
