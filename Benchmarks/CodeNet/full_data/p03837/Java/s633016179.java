import java.util.*;

public class Main {
	static ArrayList<Path>[] graph;
	static int[][] mins;
	static int n;
	public static void main (String[] args)  {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		graph = new ArrayList[n];
		for (int i = 0; i < n; i++) {
			graph[i] = new ArrayList<Path>();
		}
		mins = new int[n][n];
		int m = sc.nextInt();
		Path[] paths = new Path[m];
		for (int i = 0; i < m; i++) {
			int from = sc.nextInt() - 1;
			int to = sc.nextInt() - 1;
			int value = sc.nextInt();
			Path p = new Path(from, to, value);
			paths[i] = p;
			graph[from].add(p);
			graph[to].add(new Path(to, from, value));
		}
		for (int i = 0; i < n; i++) {
			mins[i][i] = 1;
			search(i, 0, mins[i]);
		}
		int count = 0;
		for (Path p : paths) {
			if (mins[p.from][p.to] < p.value) {
				count++;
			}
		}
		System.out.println(count);
	}
	
	static void search(int idx, int v, int[] arr) {
		if (arr[idx] != 0 && arr[idx] <= v) {
			return;
		}
		arr[idx] = v;
		for (Path p : graph[idx]) {
			search(p.to, v + p.value, arr);
		}
	}
	
	static class Path {
		int from;
		int to;
		int value;
		public Path(int from, int to, int value) {
			this.from = from;
			this.to = to;
			this.value = value;
		}
	}
}
