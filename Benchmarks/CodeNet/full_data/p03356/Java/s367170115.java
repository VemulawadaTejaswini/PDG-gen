import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] p = new int[n];
		for (int i = 0; i < n; i++) {
			p[i] = sc.nextInt() - 1;
		}
		Map<Integer, Set<Integer>> map = new HashMap<Integer, Set<Integer>>();
		for (int i = 0; i < m; i++) {
			int x = sc.nextInt() - 1;
			int y = sc.nextInt() - 1;
			if (map.containsKey(x)) {
				if (map.containsKey(y)) {
					if (x != y) {
						Set<Integer> setX = map.get(x);
						Set<Integer> setY = map.get(y);
						if (setX.size() > setY.size()) {
							setX.addAll(setY);
							for (Integer o : setY) {
								map.put(o, setX);
							}
						} else {
							setY.addAll(setX);
							for (Integer o : setX) {
								map.put(o, setY);
							}
						}
					}
				} else {
					map.get(x).add(y);
					map.put(y, map.get(x));
				}
			} else {
				if (map.containsKey(y)) {
					map.get(y).add(x);
					map.put(x, map.get(y));
				} else {
					Set<Integer> set = new HashSet<Integer>();
					set.add(x);
					set.add(y);
					map.put(x, set);
					map.put(y, set);
				}
			}
		}
		sc.close();

		int ans = 0;
		for (int i = 0; i < n; i++) {
			if (p[i] == i) {
				ans++;
			} else if (map.get(i) == map.get(p[i])) {
				ans++;
			}
		}
		System.out.println(ans);
	}
}
