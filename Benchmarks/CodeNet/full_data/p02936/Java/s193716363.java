import java.util.*;

public class Main {
	static ArrayList<Integer>[] graph;
	static HashMap<Integer, Integer> map = new HashMap<>();
	static int[] ans;
	public static void main (String[] args)  {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		graph = new ArrayList[n + 1];
		for (int i = 1; i <= n; i++) {
			graph[i] = new ArrayList<Integer>();
		}
		int q = sc.nextInt();
		for (int i = 0; i < n - 1; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			graph[a].add(b);
			graph[b].add(a);
		}
		for (int i = 0; i < q; i++) {
			int idx = sc.nextInt();
			int value = sc.nextInt();
			if (map.containsKey(idx)) {
				map.put(idx, map.get(idx) + value);
			} else {
				map.put(idx, value);
			}
		}
		ans = new int[n + 1];
		set(1, 0, -1);
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= n; i++) {
			if (i != 1) {
				sb.append(" ");
			}
			sb.append(ans[i]);
		}
		System.out.println(sb);
	}
	
	static void set(int idx, int value, int from) {
		if (map.containsKey(idx)) {
			value += map.get(idx);
		}
		ans[idx] = value;
		for (int next : graph[idx]) {
			if (next == from) {
				continue;
			}
			set(next, value, idx);
		}
	}
}
