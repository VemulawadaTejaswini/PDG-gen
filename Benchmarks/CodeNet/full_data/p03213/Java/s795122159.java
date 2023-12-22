import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		Map<Integer, Integer> soinsu = new HashMap<Integer, Integer>();
		for (int i = 2; i <= n; i++) {
			bunkai(soinsu, i);
		}

		int ans = 0;
		Integer[] array = soinsu.keySet().toArray(new Integer[0]);

		int cnt3 = 0;
		int cnt5 = 0;
		int cnt15 = 0;
		int cnt25 = 0;
		int cnt75 = 0;
		for (int key : array) {
			int cnt = soinsu.get(key);
			if (cnt >= 2) cnt3++;
			if (cnt >= 4) cnt5++;
			if (cnt >= 14) cnt15++;
			if (cnt >= 24) cnt25++;
			if (cnt >= 74) cnt75++;
		}

		// 75*1
		ans += cnt75;

		// 25*3
		ans += Math.max(cnt25 * (cnt3 - 1), 0);

		// 15*5
		ans += Math.max(cnt15 * (cnt5 - 1), 0);

		// 5*5*3
		ans += Math.max(cnt5 * (cnt5 - 1) / 2 * (cnt3 - 2), 0);

		System.out.println(ans);
	}

	static void bunkai(Map<Integer, Integer> soinsu, int n) {
		int d = 2;
		while (n > 1) {
			if (n % d == 0) {
				n /= d;
				if (soinsu.containsKey(d)) {
					soinsu.put(d, soinsu.get(d) + 1);
				} else {
					soinsu.put(d, 1);
				}
			} else {
				d++;
			}
		}
	}
}
