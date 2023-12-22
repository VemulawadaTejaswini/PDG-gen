import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static int[] DR = { 1, 0, -1, 0 };
	static int[] DC = { 0, 1, 0, -1 };
	static int H, W;
	static char[][] S;

	public static void main(String[] args) {
		H = sc.nextInt();
		W = sc.nextInt();
		S = new char[H][];
		for (int i = 0; i < H; ++i) {
			S[i] = sc.next().toCharArray();
		}
		System.out.println(solve());
	}

	static int solve() {
		for (int i = 0; i < W; ++i) {
			if (S[0][i] == 'X' || S[H - 1][i] == 'X') return -1;
		}
		for (int i = 0; i < H; ++i) {
			if (S[i][0] == 'X' || S[i][W - 1] == 'X') return -1;
		}
		for (int i = 1; i < H - 1; ++i) {
			for (int j = 1; j < W - 1; ++j) {
				if (S[i][j] == 'X') {
					for (int k = 0; k < 4; ++k) {
						if (S[i + DR[k]][j + DC[k]] == '.') S[i + DR[k]][j + DC[k]] = 'F';
					}
				}
			}
		}
		char[][] ns = new char[H + 2][W + 2];
		for (char[] a : ns) {
			Arrays.fill(a, '.');
		}
		for (int i = 0; i < H; ++i) {
			for (int j = 0; j < W; ++j) {
				ns[i + 1][j + 1] = S[i][j];
			}
		}
		boolean[][] visited = new boolean[H + 2][W + 2];
		ArrayList<Integer> q = new ArrayList<>();
		q.add(0);
		visited[0][0] = true;
		int ans = 0;
		for (int i = 0; i < q.size(); ++i) {
			int cr = q.get(i) >> 16;
			int cc = q.get(i) & 0xFFFF;
			for (int j = 0; j < 4; ++j) {
				int nr = cr + DR[j];
				int nc = cc + DC[j];
				if (nr < 0 || H + 2 <= nr || nc < 0 || W + 2 <= nc) continue;
				if (visited[nr][nc]) continue;
				if (ns[nr][nc] == '.') {
					q.add((nr << 16) | nc);
					visited[nr][nc] = true;
				} else if (ns[nr][nc] == 'F') {
					++ans;
					ns[nr][nc] = 'G';
				}
			}
		}
		return ans;
	}
}
