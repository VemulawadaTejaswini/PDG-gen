import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

	static List<Set<Integer>> next = new ArrayList<Set<Integer>>();
	static int cnt = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		for (int i = 0; i < n + 1; i++) {
			next.add((Set<Integer>) Collections.newSetFromMap (new ConcurrentHashMap<Integer, Boolean>()));
		}
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			next.get(a).add(b);
			next.get(b).add(a);
		}

		int idx = 1;
		while (idx <= n) {
			Set<Integer> set = new HashSet<>();
			set.add(idx);
			dfs(set, idx, 0);
			idx++;
		}

		System.out.print(cnt);

	}

	static void dfs(Set<Integer> set, int first, int distance) {
		if (distance == 3) {
			if (set.size() != 0) {
				for (int value : set) {
					if (!next.get(first).contains(value) && first != value) {
						next.get(first).add(value);
						next.get(value).add(first);
						cnt ++;
					}
				}
			}
			return;
		} else {
			for (int value : set) {
				Set<Integer> nextSet = new HashSet<>();
				nextSet = next.get(value);
				if (nextSet.size() != 0) {
					dfs(nextSet, first, distance + 1);
				}
			}
			return;
		}
	}
}
