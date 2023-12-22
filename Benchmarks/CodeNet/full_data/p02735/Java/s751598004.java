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
		char[][] s = new char[h][w];
		for (int i = 0; i < h; i++) {
			s[i] = br.readLine().toCharArray();
		}
		br.close();

		int[][] d = new int[h][w];
		for (int i = 0; i < h; i++) {
			Arrays.fill(d[i], 1000000);
		}

		Queue<Integer> que = new ArrayDeque<>();
		que.add(0);
		if (s[0][0] == '#') {
			d[0][0] = 1;
		} else {
			d[0][0] = 0;
		}
		while (!que.isEmpty()) {
			int cur = que.poll();
			int cx = cur / 1000;
			int cy = cur % 1000;
			if (cx < h - 1) {
				int nx = cx + 1;
				int ny = cy;
				int nd = d[cx][cy];
				if (s[cx][cy] != s[nx][ny]) {
					nd++;
				}
				d[nx][ny] = Math.min(d[nx][ny], nd);
				que.add(nx * 1000 + ny);
			}
			if (cy < w - 1) {
				int nx = cx;
				int ny = cy + 1;
				int nd = d[cx][cy];
				if (s[cx][cy] != s[nx][ny]) {
					nd++;
				}
				d[nx][ny] = Math.min(d[nx][ny], nd);
				que.add(nx * 1000 + ny);
			}
		}
		System.out.println((d[h - 1][w - 1] + 1) / 2);
	}
}
