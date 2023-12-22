import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c = sc.nextInt();
		Obj[] arr = new Obj[n];
		for (int i = 0; i < n; i++) {
			Obj o = new Obj();
			o.s = sc.nextInt();
			o.t = sc.nextInt();
			o.c = sc.nextInt();
			arr[i] = o;
		}
		sc.close();

		Arrays.sort(arr, (o1, o2) -> o1.t - o2.t);
		TreeMap<Integer, Map<Integer, Obj>> map = new TreeMap<>();
		for (Obj o : arr) {
			Integer key = map.floorKey(o.s);
			if (key != null) {
				if (key == o.s && map.get(key).containsKey(o.c)) {
					map.get(key).remove(o.c);
					if (map.get(key).isEmpty()) {
						map.remove(key);
					}
					if (!map.containsKey(o.t)) {
						map.put(o.t, new HashMap<>());
					}
					map.get(o.t).put(o.c, o);
					continue;
				}
			}

			key = map.lowerKey(o.s);
			if (key != null) {
				Integer key2 = map.get(key).keySet().iterator().next();
				map.get(key).remove(key2);
				if (map.get(key).isEmpty()) {
					map.remove(key);
				}
			}
			if (!map.containsKey(o.t)) {
				map.put(o.t, new HashMap<>());
			}
			map.get(o.t).put(o.c, o);
		}

		int ans = 0;
		for (Map<Integer, Obj> map2 : map.values()) {
			ans += map2.size();
		}
		System.out.println(ans);
	}

	static class Obj {
		int s, t, c;
	}
}
