import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// nがあり、nの数だけの整数の入力
			long n = sc.nextLong();
			List<Long> an = new ArrayList<>();
			for (long i = 0; i < n; i++) {
				an.add(sc.nextLong());
			}
			long max = 0;
			Map<Long, Long> map = new HashMap<>();
			for (long l : an) {
				Long c = map.get(l);
				if (c == null) {
					c = 0l;
				}
				map.put(l, c + 1);
				if (max < c + 1) {
					max = c + 1;
				}
			}
			Map<Long, Long> countMap = new HashMap<>();
			for (Long l : map.values()) {
				Long c = countMap.get(l);
				if (c == null) {
					c = 0l;
				}
				countMap.put(l, c + 1);
			}
			Map<Long, Long> resultMap = new HashMap<>();
			for (long l = 0; l <= max; l++) {
				resultMap.put(l, (l * (l - 1) / 2));
			}
			Long result = 0l;
			for (Entry<Long, Long> e : countMap.entrySet()) {
				result = result + (e.getKey() * (e.getKey() - 1) / 2) * e.getValue();
			}
			for (long l : an) {
				System.out.println(result - (resultMap.get(map.get(l))) + (resultMap.get(map.get(l) - 1)));
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