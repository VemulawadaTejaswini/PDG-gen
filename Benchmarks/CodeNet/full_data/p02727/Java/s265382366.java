import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// 整数の入力
			int x = sc.nextInt();
			int y = sc.nextInt();
			// nがあり、nの数だけの整数の入力
			long a = sc.nextLong();
			long b = sc.nextLong();
			long c = sc.nextLong();
			List<Long> pa = new ArrayList<>();
			List<Long> qb = new ArrayList<>();
			List<Long> rc = new ArrayList<>();
			for (long i = 0; i < a; i++) {
				pa.add(sc.nextLong());
				pa.add(0l);
			}
			for (long i = 0; i < b; i++) {
				qb.add(sc.nextLong());
				qb.add(0l);
			}
			for (long i = 0; i < c; i++) {
				rc.add(sc.nextLong());
				rc.add(0l);
			}
			// 降順ソート
			Collections.sort(pa, Comparator.reverseOrder());
			Collections.sort(qb, Comparator.reverseOrder());
			Collections.sort(rc, Comparator.reverseOrder());
			long result = 0;
			for (int i = 0; i < x; i++) {
				result = result + pa.get(i);
			}
			for (int i = 0; i < y; i++) {
				result = result + qb.get(i);
			}
			int aAD = 0;
			int bAD = 0;
			int cIndex = 0;
			while (true) {
				if (rc.size() <= cIndex) {
					break;
				}
				if (rc.get(cIndex) > pa.get(x - 1 - aAD) || rc.get(cIndex) > qb.get(y - 1 - bAD)) {
					if (rc.get(cIndex) > pa.get(x - 1 - aAD)) {
						result = result + rc.get(cIndex) - pa.get(x - 1 - aAD);
						aAD++;
						cIndex++;
					} else {
						result = result + rc.get(cIndex) - qb.get(y - 1 - bAD);
						bAD++;
						cIndex++;
					}
				} else {
					break;
				}
			}

//			while (x > 0 || y > 0) {
//				if ((pa.get(aIndex) >= qb.get(bIndex) && pa.get(aIndex) >= rc.get(cIndex))) {
//					x--;
//					if (x >= 0) {
//						result = result + pa.get(aIndex);
//					}
//					aIndex++;
//				} else if ((qb.get(bIndex) >= pa.get(aIndex) && qb.get(bIndex) >= rc.get(cIndex))) {
//					y--;
//					if (y >= 0) {
//						result = result + qb.get(bIndex);
//					}
//					bIndex++;
//				} else if (rc.get(cIndex) >= pa.get(aIndex) && rc.get(cIndex) >= qb.get(bIndex)) {
//					if ((qb.get(aIndex) >= pa.get(bIndex)) || x == 0) {
//						y--;
//						if (y >= 0) {
//							result = result + rc.get(cIndex);
//						}
//					} else {
//						x--;
//						if (x >= 0) {
//							result = result + rc.get(cIndex);
//						}
//					}
//					cIndex++;
//				}
//			}
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