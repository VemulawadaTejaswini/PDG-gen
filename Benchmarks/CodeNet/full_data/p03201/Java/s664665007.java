import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] sa = br.readLine().split(" ");
		TreeMap<Integer, Integer> map = new TreeMap<>();
		for (int i = 0; i < n; i++) {
			int a = Integer.parseInt(sa[i]);
			addCntMap(map, a);
		}
		br.close();

		int ans = 0;
		Integer[] arr = map.keySet().toArray(new Integer[0]);
		int t = 30;
		for (int r = arr.length - 1; r >= 0; r--) {
			if (!map.containsKey(arr[r])) {
				continue;
			}
			for ( ; t >= 0; t--) {
				if (arr[r] >= (1 << t)) {
					t++;
					break;
				}
			}
			int x = (1 << t) - arr[r];
			if (map.containsKey(x)) {
				delCntMap(map, arr[r]);
				delCntMap(map, x);
				ans++;
			}
		}
		System.out.println(ans);
	}

	static void addCntMap(Map<Integer, Integer> map, Integer key) {
		if (map.containsKey(key)) {
			map.put(key, map.get(key) + 1);
		} else {
			map.put(key, 1);
		}
	}

	static void delCntMap(Map<Integer, Integer> map, Integer key) {
		if (key != null && map.containsKey(key)) {
			int val = map.get(key);
			if (val == 1) {
				map.remove(key);
			} else {
				map.put(key, val - 1);
			}
		}
	}
}
