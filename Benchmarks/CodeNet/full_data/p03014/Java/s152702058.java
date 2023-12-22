import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int H = sc.nextInt();
		int W = sc.nextInt();

		boolean[][] s = new boolean[H][W]; // '#'->false '.'->true

		for (int i = 0; i < H; i++) {
			String str = sc.next();
			for (int j = 0; j < W; j++) {
				s[i][j] = str.charAt(j) == '.' ? true : false;
			}
		}

		int[][] yoko = new int[H][W];
		for (int i = 0; i < H; i++) {
			if (s[i][0]) {
				yoko[i][0] = 1;
			} else {
				yoko[i][0] = 0;
			}
			for (int j = 1; j < W; j++) {
				if (s[i][j]) {
					yoko[i][j] = yoko[i][j - 1] + 1;
				} else {
					yoko[i][j] = 0;
				}
			}

			for (int j = W - 1; j >= 0; j--) {
				if (yoko[i][j] != 0 && j != W - 1 && yoko[i][j + 1] != 0) {
					yoko[i][j] = yoko[i][j + 1];
				}
			}
		}

		int[][] tate = new int[H][W];

		for (int j = 0; j < W; j++) {
			if (s[0][j]) {
				tate[0][j] = 1;
			} else {
				tate[0][j] = 0;
			}
			for (int i = 1; i < H; i++) {
				if (s[i][j]) {
					tate[i][j] = tate[i - 1][j] + 1;
				} else {
					tate[i][j] = 0;
				}
			}

			for (int i = H - 1; i >= 0; i--) {
				if (tate[i][j] != 0 && i != H - 1 && tate[i + 1][j] != 0) {
					tate[i][j] = tate[i + 1][j];
				}
			}
		}

		int ans = Integer.MIN_VALUE;

		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				ans = Math.max(ans, yoko[i][j] + tate[i][j] - 1); //ランプを置いた場所を2重にカウントしてるので1引く
			}
		}

		out.println(ans);

		sc.close();

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

}
