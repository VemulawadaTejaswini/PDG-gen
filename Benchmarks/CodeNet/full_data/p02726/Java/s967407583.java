import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int x = Integer.parseInt(sa[1]);
		int y = Integer.parseInt(sa[2]);
		br.close();

		int[] ans = new int[n];
		for (int i = 1; i < n; i++) {
			Queue<Integer> que = new ArrayDeque<>();
			que.add(i);
			int[] d = new int[n + 1];
			Arrays.fill(d, 10000);
			d[i] = 0;
			while (!que.isEmpty()) {
				int cur = que.poll();
				int alt = d[cur] + 1;
				if (cur == x && alt < d[y]) {
					que.add(y);
					d[y] = alt;
				}
				if (cur < n && alt < d[cur + 1]) {
					que.add(cur + 1);
					d[cur + 1] = alt;
				}
				if (cur > 0 && alt < d[cur - 1]) {
					que.add(cur - 1);
					d[cur - 1] = alt;
				}
			}
			for (int j = i + 1; j <= n; j++) {
				ans[d[j]]++;
			}
		}
		for (int i = 1; i < n; i++) {
			System.out.println(ans[i]);
		}
	}

	static void dfs(int c) {
		
	}
}
