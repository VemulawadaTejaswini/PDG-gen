import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		boolean[][] mtx = new boolean[H][W];
		for (int i = 0; i < H; i++) {
			String s = sc.next();
			for (int j = 0; j < W; j++) {
				mtx[i][j] = (s.charAt(j) == '#');
			}
		}

		boolean[][] r = new boolean[H][W];
		boolean[][] b = new boolean[H][W];
		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				if (j == 0) {
					r[i][j] = true;
					b[i][j] = false;
				} else if (j == W - 1) {
					r[i][j] = false;
					b[i][j] = true;
				} else if (i == H - 1) {
					r[i][j] = false;
					b[i][j] = true;
				} else if (i % 2 == 0) {
					r[i][j] = true;
					b[i][j] = false;
				} else {
					r[i][j] = false;
					b[i][j] = true;
				}
				if (mtx[i][j]) {
					r[i][j] = true;
					b[i][j] = true;
				}
			}
		}

		StringBuffer buf = new StringBuffer();
		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				if (r[i][j]) {
					buf.append('#');
				} else {
					buf.append('.');
				}
			}
			buf.append('\n');
		}
		buf.append('\n');
		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				if (b[i][j]) {
					buf.append('#');
				} else {
					buf.append('.');
				}
			}
			buf.append('\n');
		}
		System.out.println(buf.toString());
	}
}
