import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
	static Map<Integer, List<Integer>> map1 = new HashMap<>();
	static Map<Integer, List<Integer>> map2 = new HashMap<>();

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			String[] sa = br.readLine().split(" ");
			int x = Integer.parseInt(sa[0]);
			int y = Integer.parseInt(sa[1]);
			List<Integer> list1 = map1.get(x);
			if (list1 == null) {
				list1 = new ArrayList<>();
				map1.put(x, list1);
			}
			list1.add(y);
			List<Integer> list2 = map2.get(y);
			if (list2 == null) {
				list2 = new ArrayList<>();
				map2.put(y, list2);
			}
			list2.add(x);
		}
		br.close();

		long ans = 0;
		while (!map1.isEmpty() || !map2.isEmpty()) {
			ans += dfs(map1.keySet().iterator().next(), new HashSet<>(), 0, new HashSet<>());
		}
		System.out.println(ans - n);
	}

	static int dfs(int x, Set<Integer> set1, int y, Set<Integer> set2) {
		if (x > 0) {
			List<Integer> list = map1.get(x);
			if (list != null) {
				map1.remove(x);
				for (Integer next : list) {
					if (set2.add(next)) {
						dfs(0, set1, next, set2);
					}
				}
			}
		} else {
			List<Integer> list = map2.get(y);
			if (list != null) {
				map2.remove(y);
				for (Integer next : list) {
					if (set1.add(next)) {
						dfs(next, set1, 0, set2);
					}
				}
			}
		}
		return set1.size() * set2.size();
	}
}
