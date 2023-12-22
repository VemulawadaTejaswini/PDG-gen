import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] s = new String[n];
		for (int i = 0; i < n; i++) {
			char[] c = sc.next().toCharArray();
			Arrays.sort(c);
			s[i] = String.valueOf(c);
		}
		sc.close();

		Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			addCntMap(map, s[i]);
		}

		long ans = 0;
		for (long val : map.values()) {
			ans += val * (val - 1) / 2;
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
