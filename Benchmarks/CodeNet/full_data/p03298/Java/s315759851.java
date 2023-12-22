import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String s = br.readLine();
		br.close();

		String s1 = s.substring(0, n);
		String s2 = new StringBuilder(s.substring(n)).reverse().toString();
		Map<String, Integer> map1 = new HashMap<>();
		Map<String, Integer> map2 = new HashMap<>();

		int end = 1 << n;
		for (int i = 0; i < end; i++) {
			StringBuilder r1 = new StringBuilder();
			StringBuilder b1 = new StringBuilder();
			StringBuilder r2 = new StringBuilder();
			StringBuilder b2 = new StringBuilder();
			for (int j = 0; j < n; j++) {
				if ((i >> j & 1) == 1) {
					r1.append(s1.charAt(j));
					r2.append(s2.charAt(j));
				} else {
					b1.append(s1.charAt(j));
					b2.append(s2.charAt(j));
				}
			}
			addCntMap(map1, r1.append('-').append(b1).toString());
			addCntMap(map2, r2.append('-').append(b2).toString());
		}

		long ans = 0;
		for (String key : map1.keySet()) {
			if (map2.containsKey(key)) {
				ans += (long) map1.get(key) * map2.get(key);
			}
		}
		System.out.println(ans);
	}

	static void addCntMap(Map<String, Integer> map, String key) {
		if (map.containsKey(key)) {
			map.put(key, map.get(key) + 1);
		} else {
			map.put(key, 1);
		}
	}
}
