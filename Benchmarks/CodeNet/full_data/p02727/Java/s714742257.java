import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// 整数の入力
			long x = sc.nextLong();
			long y = sc.nextLong();
			// nがあり、nの数だけの整数の入力
			long a = sc.nextLong();
			long b = sc.nextLong();
			long c = sc.nextLong();
			List<Long> pa = new ArrayList<>();
			List<Long> qb = new ArrayList<>();
			List<Long> rc = new ArrayList<>();
			for (long i = 0; i < a; i++) {
				pa.add(sc.nextLong());
			}
			for (long i = 0; i < b; i++) {
				qb.add(sc.nextLong());
			}
			for (long i = 0; i < c; i++) {
				rc.add(sc.nextLong());
			}
			// 降順ソート
			Collections.sort(pa, Comparator.reverseOrder());
			Collections.sort(qb, Comparator.reverseOrder());
			Collections.sort(rc, Comparator.reverseOrder());
			long result = 0;
			int aIndex = 0;
			int bIndex = 0;
			int cIndex = 0;
			for (int i = 0; i < x; i++) {
				long cand = pa.get(aIndex);
				if (cand < rc.get(cIndex)) {
					cand = rc.get(cIndex);
					cIndex++;
				} else {
					aIndex++;
				}
				result = result + cand;

			}
			for (int i = 0; i < y; i++) {
				long cand = qb.get(bIndex);
				if (cand < rc.get(cIndex)) {
					cand = rc.get(cIndex);
					cIndex++;
				} else {
					bIndex++;
				}
				result = result + cand;
			}
			// 出力(整数)
			System.out.println(result);
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