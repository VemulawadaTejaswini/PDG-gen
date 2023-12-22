import java.util.*;
import java.lang.*;


public class Main {
	static int h;
	static int w;
	static char[][] masu;
	static long black;
	static long white;
	static boolean[][] used;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		h = sc.nextInt();
		w = sc.nextInt();
		masu = new char[h + 2][w + 2];
		for (int i = 0; i < w + 2; i++) {
			masu[0][i] = 'n';
			masu[h + 1][i] = 'n';
		}
		for (int i = 0; i < h + 2; i++) {
			masu[i][0] = 'n';
			masu[i][w + 1] = 'n';
		}
		for (int i = 1; i <= h; i++) {
			String tmp = sc.next();
			for (int j = 1; j <= w; j++) {
				masu[i][j] = tmp.charAt(j - 1);
			}
		}
		used = new boolean[h + 2][w + 2];
		long count = 0;
		for (int i = 1; i <= h; i++) {
			for (int j = 1; j <= w; j++) {
				if (masu[i][j] == '#' && !used[i][j]) {
					black = 0;
					white = 0;
					dfs(i, j);
					count += black * white;
				}
			}
		}
		System.out.println(count);
	}
	static void dfs(int i, int j) {
		used[i][j] = true;
		if (masu[i][j] == '#') {
			black++;
		} else if (masu[i][j] == '.') {
			white++;
		} else {
			return;
		}
		int[] dih = {-1, 0, 1, 0};
		int[] diw = {0, -1, 0, 1};
		for (int k = 0; k < 4; k++) {
			if (masu[i + dih[k]][j + diw[k]] != masu[i][j] && !used[i + dih[k]][j + diw[k]]) {
				dfs(i + dih[k], j + diw[k]);
			}
		}
	}
}