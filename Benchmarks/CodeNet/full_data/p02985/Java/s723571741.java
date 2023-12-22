import java.util.*;
import java.io.*;

public class Main {
	static final long MOD = 1000000007;
	public static void main (String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] first = br.readLine().split(" ", 2);
		int n = Integer.parseInt(first[0]);
		long k = Integer.parseInt(first[1]);
		ArrayList<Integer>[] tree = new ArrayList[n];
		for (int i = 0; i < n; i++) {
			tree[i] = new ArrayList<Integer>();
		}
		for (int i = 0; i < n - 1; i++) {
			String[] line = br.readLine().split(" ", 2);
			int a = Integer.parseInt(line[0]) - 1;
			int b = Integer.parseInt(line[1]) - 1;
			tree[a].add(b);
			tree[b].add(a);
		}
		boolean[] visited = new boolean[n];
		ArrayList<Integer> now = new ArrayList<>();
		now.add(0);
		long ans = 1;
		while (true) {
			ArrayList<Integer> next = new ArrayList<>();
			for (int x : now) {
				int count = 0;
				for (int y : tree[x]) {
					if (visited[y]) {
						count++;
						for (int z : tree[y]) {
							if (visited[z]) {
								count++;
							}
						}
					}
				}
				ans *= Math.max(k - count, 0);
				ans %= MOD;
				visited[x] = true;
				for (int y : tree[x]) {
					if (!visited[y]) {
						next.add(y);
					}
				}
			}
			if (next.size() == 0) {
				break;
			}
			now = next;
		}
		System.out.println(ans);
	}
}
