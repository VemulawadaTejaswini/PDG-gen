import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	static int h, w, k;

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		h = sc.nextInt();
		w = sc.nextInt();
		k = sc.nextInt();
		int[][] c = new int[h][w];
		for (int i = 0; i < h; i++) {
			char[] line = sc.next().toCharArray();
			for (int j = 0; j < w; j++) {
				c[i][j] = line[j] - '0';
			}
		}
		sc.close();

		int ans = 0;
		for (int x = 0; x < h; x++) {
			for (int y = 0; y < w; y++) {
				int[][] c2 = new int[h][w];
				for (int i = 0; i < h; i++) {
					System.arraycopy(c[i], 0, c2[i], 0, w);
				}
				c2[x][y] = 0;
				drop(c2);
				int val = simulate(c2);
				ans = Math.max(ans, val);
			}
		}
		System.out.println(ans);
	}

	static int simulate(int[][] c) {
		int ret = 0;
		int rensa = 0;
		while (true) {
			boolean[][] used = new boolean[h][w];
			int val = 0;
			for (int i = 0; i < h; i++) {
				int cnt = 0;
				if (c[i][0] != 0) {
					cnt++;
				}
				for (int j = 1; j < w; j++) {
					if (c[i][j] == 0) {
						cnt = 0;
					} else {
						if (c[i][j - 1] == c[i][j]) {
							cnt++;
							if (cnt == k) {
								val += cnt * c[i][j];
								for (int j2 = j - cnt + 1; j2 <= j; j2++) {
									used[i][j2] = true;
								}
							} else if (cnt > k) {
								val += c[i][j];
								used[i][j] = true;
							}
						} else {
							cnt = 1;
						}
					}
				}
			}
			if (val == 0) {
				return ret;
			}
			ret += val * 1 << rensa;
			rensa++;
			drop(c, used);
		}
	}

	static void drop(int[][] c, boolean[][] used) {
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (used[i][j]) {
					c[i][j] = 0;
				}
			}
		}
		drop(c);
	}

	static void drop(int[][] c) {
		for (int j = 0; j < w; j++) {
			List<Integer> list = new ArrayList<>();
			for (int i = h - 1; i >= 0; i--) {
				if (c[i][j] != 0) {
					list.add(c[i][j]);
					c[i][j] = 0;
				}
			}
			for (int i = 0; i < list.size(); i++) {
				c[h - 1 - i][j] = list.get(i);
			}
		}
	}
}
