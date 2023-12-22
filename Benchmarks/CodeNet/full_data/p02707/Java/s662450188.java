import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// nがあり、nの数だけの整数の入力
			long n = sc.nextLong();
			List<Long> an = new ArrayList<>();
			for (long i = 0; i < n - 1; i++) {
				an.add(sc.nextLong());
			}
			LinkedHashMap<Long, Long> map = new LinkedHashMap<>();
			for (long i = 1; i <= n; i++) {
				map.put(i, 0L);
			}
			for (int i = 0; i < n - 1; i++) {
				map.put(an.get(i), map.get(an.get(i)) + 1);
			}
			for (Long val : map.values()) {
				System.out.println(val);
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