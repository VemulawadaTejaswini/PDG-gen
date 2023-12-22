import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] tokens = in.nextLine().split(" ");
		int H = Integer.parseInt(tokens[0]);
		int W = Integer.parseInt(tokens[1]);
		char[][] s = new char[H][W];
		for (int i = 0; i < H; ++i) {
			String line = in.nextLine();
			for (int j = 0; j < W; ++j) {
				s[i][j] = line.charAt(j);
			}
		}

		boolean[][] flags = new boolean[H][W];
		for (int i = 0; i < H; ++i) {
			Arrays.fill(flags[i], false);
		}

		boolean result = true;
		for (int h = 0; h < H; ++h) {
			for (int w = 0; w < W; ++w) {
				if (s[h][w] == '#') {
					if (!check(s, flags, h, w, H, W)) {
						result = false;
						break;
					}
				}
			}
			if (!result) {
				break;
			}
		}
		if (result) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

		in.close();
	}

	private static boolean check(char[][] s, boolean[][] flags, int h, int w, int H, int W) {
		if (flags[h][w]) {
			return true;
		}

		if (h > 0) {
			if (s[h - 1][w] == '#') {
				flags[h - 1][w] = true;
				return true;
			}
		}
		if (w > 0) {
			if (s[h][w - 1] == '#') {
				flags[h][w - 1] = true;
				return true;
			}
		}
		if (h + 1 < H) {
			if (s[h + 1][w] == '#') {
				flags[h + 1][w] = true;
				return true;
			}
		}
		if (w + 1 < W) {
			if (s[h][w + 1] == '#') {
				flags[h][w + 1] = true;
				return true;
			}
		}
		return false;
	}
}