import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// 整数の入力
			int n = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();

			Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
			for (int i = 1; i <= n - 1; i++) {
				map.put(i, n - i);
			}
			for (int i = 1; i <= n; i++) {
				for (int j = i + 1; j <= n; j++) {
					int dist = j - i;
					int adist = Math.abs(i - x) + 1 + Math.abs(j - y);
					if (adist < dist) {
						map.put(dist, map.get(dist) - 1);
						map.put(adist, map.get(adist) + 1);
					}
					// System.out.println(i + " " + j + " " + dist + " " + adist);
				}
			}
			for (Integer string : map.values()) {
				System.out.println(string);
			}

		}
	}

	/**
	 * 最小公倍数
	 */
	static long lcm(long a, long b) {
		long temp;
		long c = a;
		c *= b;
		while ((temp = a % b) != 0) {
			a = b;
			b = temp;
		}
		return c / b;
	}

	/**
	 * 最大公約数
	 */
	static long gcd(long a, long b) {
		long temp;
		while ((temp = a % b) != 0) {
			a = b;
			b = temp;
		}
		return b;
	}
}