import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			if (map.containsKey(a)) {
				map.put(a, map.get(a) + 1);
			} else {
				map.put(a, 1);
			}
		}
		sc.close();

		int ans = 0;
		for (int a : map.keySet()) {
			int cnt = map.get(a);
			if (a < cnt) {
				ans += cnt - a;
			}
			if (cnt < a) {
				ans += cnt;
			}
		}
		System.out.println(ans);
	}
}
