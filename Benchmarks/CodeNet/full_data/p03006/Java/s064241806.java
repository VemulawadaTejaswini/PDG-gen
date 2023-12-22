import java.util.*;
import java.lang.*;

public class Main {
	static int n;
	static long[] x;
	static long[] y;
	static boolean[] visited;
	static long p;
	static long q;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		x = new long[n];
		y = new long[n];
		for (int i = 0; i < n; i++) {
			x[i] = sc.nextLong();
			y[i] = sc.nextLong();
		}
		long cost = n;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i != j) {
					p = x[j] - x[i];
					q = y[j] - y[i];
					int tmp = 0;
					visited = new boolean[n];
					for (int k = 0; k < n; k++) {
						if (!visited[k]) {
							visited[k] = true;
							dfs(k);
							tmp++;
						}
					}
					cost = Math.min(cost, tmp);
				}
			}
		}
		System.out.println(cost);
	}
	static void dfs(int in) {
		long xt = x[in];
		long yt = y[in];
		for (int i = 0; i < n; i++) {
			if (!visited[i] && ((x[i] == xt + p && y[i] == yt + q) || (x[i] == xt - p && y[i] == yt - q))) {
				visited[i] = true;
				dfs(i);
			}
		}
	}
}

