import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	static int V;
	static int []match;
	static boolean []used;
	static Map<Integer, List<Integer>> G = new HashMap<Integer, List<Integer>>();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[]a = new int[N];
		int[]b = new int[N];
		int[]c = new int[N];
		int[]d = new int[N];
		for(int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}
		for(int i = 0; i < N; i++) {
			c[i] = sc.nextInt();
			d[i] = sc.nextInt();
		}
		sc.close();
		V = 2 * N;
		match = new int[V];
		used = new boolean[V];
		// 隣接リストを作成
		for(int i = 0; i < N; i++) {
			List<Integer> list1 = new ArrayList<Integer>();
			for(int j = 0; j < N; j++) {
				if(a[i] < c[j] && b[i] < d[j]) {
					list1.add(N + j);
					if(G.containsKey(N + j)) {
						G.get(N + j).add(i);
					}else {
						List<Integer> list2 = new ArrayList<Integer>();
						list2.add(i);
						G.put(N + j, list2);
					}
				}
			}
			G.put(i, list1);
		}
		int max = bipatricleMatching();
		System.out.println(max);
	}
	static boolean dfs(int v) {
		used[v] = true;
		if(!G.containsKey(v)) return false;
		for(int i = 0; i < G.get(v).size(); i++) {
			int u = G.get(v).get(i);
			int w = match[u];
			if(w < 0 || (!used[w] && dfs(w))) {
				match[v] = u;
				match[u] = v;
				return true;
			}
		}
		return false;
	}
	static int bipatricleMatching() {
		int res = 0;
		Arrays.fill(match, -1);
		for(int v = 0; v < V; v++) {
			if(match[v] < 0) {
				Arrays.fill(used, false);
				if(dfs(v)) res++;
			}
		}
		return res;
	}
}