import java.util.*;
import java.lang.*;

public class Main {
	static int n;
	static int m;
	static int[] a;
	static int[] b;
	static boolean[] visited;
	static int col;
	static int count;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		a = new int[m];
		b = new int[m];
		for (int i = 0; i < m; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}
		for (int i = 1; i <= m; i++) {
			visited = new boolean[n + 1];
			col = i;
			ArrayList<Integer> list = new ArrayList<>();
			for (int j = 1; j <= n; j++) {
				if (!visited[j]) {
					count = 1;
					dfs(j);
					list.add(count);
				}
			}
			long ans = 0;
			for (int j = 0; j < list.size(); j++) {
				for (int k = j + 1; k < list.size(); k++) {
					ans += (long) list.get(j) * list.get(k);
				}
			}
			System.out.println(ans);
		}
 	}
 	static void dfs(int island) {
		visited[island] = true;
		for (int i = col; i < m; i++) {
			if (a[i] == island && !visited[b[i]]) {
				count++;
				dfs(b[i]);
			}
		}
		for (int i = col; i < m; i++) {
			if (b[i] == island && !visited[a[i]]) {
				count++;
				dfs(a[i]);
			}
		}
		return;
	}

}