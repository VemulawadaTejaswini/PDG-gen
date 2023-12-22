import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int k = Integer.parseInt(sa[1]);
		sa = br.readLine().split(" ");
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(sa[i]) - 1;
			a[i] %= k;
		}
		br.close();

		int[] b = new int[n + 1];
		for (int i = 0; i < n; i++) {
			b[i + 1] = b[i] + a[i];
			b[i + 1] %= k;
		}

		long ans = 0;
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < b.length; i++) {
			addCntMap(map, b[i]);
			if (i >= k) {
				delCntMap(map, b[i - k]);
			}
			ans += map.get(b[i]) - 1;
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
