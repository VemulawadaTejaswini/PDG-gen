import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int h = Integer.parseInt(sa[0]);
		int w = Integer.parseInt(sa[1]);
		int k = Integer.parseInt(sa[2]);
		char[][] a = new char[h][w];
		for (int i = 0; i < h; i++) {
			a[i] = br.readLine().toCharArray();
		}
		br.close();

		int s = 0;
		label:
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (a[i][j] == 'S') {
					s = i * 1000 + j;
					break label;
				}
			}
		}

		int ans = Integer.MAX_VALUE;
		int[][] d = new int[h][w];
		for (int i = 0; i < h; i++) {
			Arrays.fill(d[i], -1);
		}
		int[] dx = {-1, 1, 0, 0};
		int[] dy = {0, 0, -1, 1};
		Queue<Integer> que = new ArrayDeque<>();
		que.add(s);
		d[s / 1000][s % 1000] = 0;
		while (!que.isEmpty()) {
			int cur = que.poll();
			int cx = cur / 1000;
			int cy = cur % 1000;
			ans = Math.min(ans, (cx + k - 1) / k + 1);
			ans = Math.min(ans, (h - 1 - cx + k - 1) / k + 1);
			ans = Math.min(ans, (cy + k - 1) / k + 1);
			ans = Math.min(ans, (w - 1 - cy + k - 1) / k + 1);
			if (d[cx][cy] >= k) {
				continue;
			}
			for (int i = 0; i < 4; i++) {
				int nx = cx + dx[i];
				int ny = cy + dy[i];
				if (0 <= nx && nx < h && 0 <= ny && ny < w &&
						a[nx][ny] == '.' && d[nx][ny] == -1) {
					if (nx == 0 || nx == h - 1 || ny == 0 || ny == w - 1) {
						System.out.println(1);
						return;
					}
					que.add(nx * 1000 + ny);
					d[nx][ny] = d[cx][cy] + 1;
				}
			}
		}
		System.out.println(ans);
	}
}
