import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		List<List<Integer>> list = new ArrayList<List<Integer>>(n);
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < n; i++) {
			list.add(new ArrayList<Integer>());
			set.add(i);
		}
		for (int i = 0; i < m; i++) {
			int x = sc.nextInt() - 1;
			int y = sc.nextInt() - 1;
			list.get(x).add(y);
			set.remove(y);
		}
		sc.close();

		int[] maxs = new int[n];
		for (int i : set) {
			List<Integer> work = new ArrayList<Integer>();
			work.add(i);
			dfs(list, maxs, work);
		}

		int ans = 0;
		for (int i = 0; i < n; i++) {
			ans = Math.max(ans, maxs[i]);
		}
		System.out.println(ans);
	}

	static void dfs(List<List<Integer>> list, int[] maxs, List<Integer> work) {
		int now = work.get(work.size() - 1);
		List<Integer> nexts = list.get(now);
		if (nexts.isEmpty()) {
			for (int i = 0; i < work.size(); i++) {
				maxs[work.get(i)] = Math.max(maxs[work.get(i)], work.size() - 1 - i);
			}
			return;
		}

		for (int i : list.get(now)) {
			work.add(i);
			dfs(list, maxs, work);
			work.remove(work.size() - 1);
		}
	}
}
