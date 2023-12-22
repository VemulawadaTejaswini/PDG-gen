import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		char[][] s = new char[n][n];
		for (int i = 0; i < n; i++) {
			s[i] = br.readLine().toCharArray();
		}
		br.close();

		int ans = 1;
		for (int k = 0; k < n; k++) {
			int[] dep = new int[n];
			Arrays.fill(dep, -1);
			Queue<Integer> que = new ArrayDeque<>();
			que.add(k);
			dep[k] = 1;
			while (!que.isEmpty()) {
				int cur = que.poll();
				for (int i = 0; i < n; i++) {
					if (s[cur][i] == '1') {
						if (dep[i] == -1) {
							dep[i] = dep[cur] + 1;
							ans = Math.max(ans, dep[i]);
							que.add(i);
						}
						if (dep[i] != dep[cur] - 1 && dep[i] != dep[cur] + 1) {
							System.out.println(-1);
							return;
						}
					}
				}
			}
		}
		System.out.println(ans);
	}
}
