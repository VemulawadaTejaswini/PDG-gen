import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static int n;
	static int ans = 0;

	static int edge[][];
	static boolean used[];

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");

		n = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);

		edge = new int[n][n];
		used = new boolean[n];

		for (int i = 0; i < m; i++) {
			str = br.readLine().split(" ");
			int a = Integer.parseInt(str[0]) - 1;
			int b = Integer.parseInt(str[1]) - 1;

			edge[a][b] = 1;
			edge[b][a] = 1;
		}
		dfs(0, 0);
		System.out.println(ans);
	}

	static void dfs(int s, int add) {
		if (add == n - 1) {
			ans++;
		} else {
			for (int i = 0; i < n; i++) {
				if (edge[s][i] == 1 && !used[i]) {
					used[i] = true;
					dfs(i, add + 1);
				}
			}
		}
	}
}