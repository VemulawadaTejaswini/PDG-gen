import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int m = Integer.parseInt(sa[1]);
		int[] x = new int[m];
		int[] y = new int[m];
		for (int i = 0; i < m; i++) {
			sa = br.readLine().split(" ");
			x[i] = Integer.parseInt(sa[0]);
			y[i] = Integer.parseInt(sa[1]);
		}
		br.close();

		int[] parent = new int[n + 1];
		for (int i = 1; i < parent.length; i++) {
			parent[i] = i;
		}

		for (int i = 0; i < m; i++) {
			union(parent, x[i], y[i]);
		}

		Set<Integer> set = new HashSet<Integer>();
		for (int i = 1; i < parent.length; i++) {
			set.add(find(parent, i));
		}
		System.out.println(set.size());
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
