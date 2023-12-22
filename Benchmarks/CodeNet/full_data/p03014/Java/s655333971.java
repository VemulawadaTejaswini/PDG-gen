import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		String[] g = new String[h];
		char[][] grid = new char[h][w];
		for (int i = 0; i < h; i++) {
			g[i] = sc.next();
			for (int j = 0; j < w; j++) {
				grid[i][j] = g[i].charAt(j);
			}
		}
		sc.close();
		int[][] tate = new int[h][w];// 縦列の累積和もどき
		for (int i = 0; i < w; i++) {
			for (int j = 0; j < h; j++) {
				if (grid[j][i] == '.') {
					int tmp = j;
					while (true) {
						j++;
						if (j >= h || grid[j][i] == '#') {
							int ans = j - tmp;
							for (int k = tmp; k < j; k++) {
								tate[k][i] = ans;
							}
							break;
						}
					}
				}
			}
		}
		int[][] yoko = new int[h][w];// 横列の累積和もどき
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (grid[i][j] == '.') {
					int tmp = j;
					while (true) {
						j++;
						if (j >= w || grid[i][j] == '#') {
							int ans = j - tmp;
							for (int k = tmp; k < j; k++) {
								yoko[i][k] = ans;
							}
							break;
						}
					}
				}
			}
		}
		int ans = 0;
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				int tmp = tate[i][j] + yoko[i][j] - 1;
				if (ans < tmp) {
					ans = tmp;
				}
			}
		}
		System.out.println(ans);
	}
}
