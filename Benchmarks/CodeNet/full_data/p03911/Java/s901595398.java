import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int m = Integer.parseInt(sa[1]);
		List<List<Integer>> list = new ArrayList<List<Integer>>(n);
		for (int i = 0; i < n; i++) {
			sa = br.readLine().split(" ");
			int k = Integer.parseInt(sa[0]);
			List<Integer> list2 = new ArrayList<Integer>(k);
			for (int j = 1; j <= k; j++) {
				list2.add(Integer.parseInt(sa[j]));
			}
			list.add(list2);
		}
		br.close();

		int[] parent = new int[m + 1];
		for (int i = 0; i < parent.length; i++) {
			parent[i] = i;
		}

		Set<Integer> lang = new HashSet<Integer>();
		for (int i = 0; i < n; i++) {
			List<Integer> list2 = list.get(i);
			lang.add(list2.get(0));
			for (int j = 1; j < list2.size(); j++) {
				union(parent, list2.get(0), list2.get(j));
				lang.add(list2.get(j));
			}
		}

		int a = lang.iterator().next();
		for (int i : lang) {
			if (find(parent, a) != find(parent, i)) {
				System.out.println("NO");
				return;
			}
		}
		System.out.println("YES");
	}

	static void union(int[] parent, int x, int y) {
		int px = find(parent, x);
		int py = find(parent, y);
		if (px != py) {
			parent[px] = py;
		}
	}

	static int find(int[] parent, int x) {
		if (parent[x] == x) {
			return x;
		}
		parent[x] = find(parent, parent[x]);
		return parent[x];
	}
}
