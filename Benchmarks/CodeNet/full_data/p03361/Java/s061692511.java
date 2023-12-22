import java.util.Scanner;

public class Main {

	static char[][] c;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 文字列をchar型配列に
		int H = sc.nextInt();
		int W = sc.nextInt();
		c = new char[H][W];
		for (int i = 0; i < H; i++) {
			c[i] = sc.next().toCharArray();
		}
		String ans = "Yes";

		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				if (c[i][j] == '.') {
					continue;
				} else {
					if (i != 0) {
						if (c[i - 1][j] == '#') {
							continue;
						}
					}
					if (i != H - 1) {
						if (c[i + 1][j] == '#') {
							continue;
						}
					}
					if (j != 0) {
						if (c[i][j - 1] == '#') {
							continue;
						}
					}
					if (j != W - 1) {
						if (c[i][j + 1] == '#') {
							continue;
						}
					}
					ans = "No";
					break;
				}
			}
		}

		System.out.println(ans);
	}
}
