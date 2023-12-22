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
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < n; i++) {
			list.add(new ArrayList<Integer>());
			set.add(i);
		}
		for (int i = 0; i < m; i++) {
			sa = br.readLine().split(" ");
			int x = Integer.parseInt(sa[0]) - 1;
			int y = Integer.parseInt(sa[1]) - 1;
			list.get(x).add(y);
			set.remove(y);
		}
		br.close();

		int[] maxs = new int[n];
		int[] bases = new int[n];
		for (int i : set) {
			List<Integer> work = new ArrayList<Integer>();
			work.add(i);
			dfs(list, maxs, bases, work);
		}

		int ans = 0;
		for (int i = 0; i < n; i++) {
			ans = Math.max(ans, maxs[i]);
		}
		System.out.println(ans);
	}

	static void dfs(List<List<Integer>> list, int[] maxs, int[] bases, List<Integer> work) {
		int now = work.get(work.size() - 1);
		if (bases[now] >= work.size()) {
			int d = bases[now] - work.size();
			for (int i = 0; i < work.size() - 1; i++) {
				maxs[work.get(i)] = Math.max(maxs[work.get(i)], bases[now] - 1 - i);
				bases[work.get(i)] = Math.max(bases[work.get(i)], i + d);
			}
			return;
		}
		List<Integer> nexts = list.get(now);
		if (nexts.isEmpty()) {
			for (int i = 0; i < work.size(); i++) {
				maxs[work.get(i)] = Math.max(maxs[work.get(i)], work.size() - 1 - i);
				bases[work.get(i)] = Math.max(bases[work.get(i)], i + 1);
			}
			return;
		}

		for (int i : list.get(now)) {
			work.add(i);
			dfs(list, maxs, bases, work);
			work.remove(work.size() - 1);
		}
	}
}
