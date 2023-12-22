
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int H = scanner.nextInt();
		int W = scanner.nextInt();
		char[][] matrix = new char[H][W];
		boolean[][] f = new boolean[H][W];
		scanner.nextLine();
		for (int i = 0; i < H; i++) {
			String s = scanner.nextLine();
			for (int j = 0; j < W; j++) {
				matrix[i][j] = s.charAt(j);
				f[i][j] = matrix[i][j] == '#';
			}
		}
		int ch = 0, cw = 0;
		while (ch-1 != H && cw != W) {
			if (matrix[ch][cw] == '#') {
				f[ch][cw] = false;
				ch++;
			} else if (matrix[ch - 1][cw + 1] == '#') {
				ch--;
				cw++;
				f[ch][cw] = false;
				ch++;
			} else {
				System.out.println("Impossible");
				return;
			}
		}
		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				if (f[i][j]) {
					System.out.println("Impossible");
					return;
				}
			}
		}
		System.out.println("Possible");
	}
}