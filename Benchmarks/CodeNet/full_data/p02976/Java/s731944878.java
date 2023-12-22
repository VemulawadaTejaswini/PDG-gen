import java.util.*;

public class Main {
	static HashSet<Integer>[] graph;
	static HashSet<Integer> visited = new HashSet<>();
	public static void main (String[] args)  {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		graph = new HashSet[n + 1];
		for (int i = 1; i <= n; i++) {
			graph[i] = new HashSet<Integer>();
		}
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			graph[a].add(b);
			graph[b].add(a);
		}
		if (!check(1)) {
			System.out.println(-1);
			return;
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= n; i++) {
			for (int x : graph[i]) {
				sb.append(i).append(" ").append(x).append("\n");
			}
		}
		System.out.print(sb);
	}
	
	static boolean check(int idx) {
		visited.add(idx);
		int removedIdx = 0;
		if (graph[idx].size() % 2 != 0) {
			for (int x : graph[idx]) {
				if (visited.contains(x)) {
					continue;
				}
				graph[idx].remove(x);
				removedIdx = x;
				break;
			}
			if (removedIdx == 0) {
				return false;
			}
		}
		for (int x : graph[idx]) {
			if (!visited.contains(x)) {
				graph[x].remove(idx);
			}
		}
		boolean ret = true;
		if (removedIdx != 0) {
			ret = check(removedIdx);
		}
		for (int x : graph[idx]) {
			if (!ret) {
				return false;
			}
			if (!visited.contains(x)) {
				ret = check(x);
			}
		}
		return ret;
	}
}
