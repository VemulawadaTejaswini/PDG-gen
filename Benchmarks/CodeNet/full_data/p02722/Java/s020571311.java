import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		sc.close();

		long ans = 0;
		BigInteger bn = BigInteger.valueOf(n);
		for (int i = 2; i <= 40; i++) {
			for (long j = 1; j * j <= n; j++) {
				BigInteger bj = BigInteger.valueOf(j).pow(i);
				if (bj.compareTo(bn) == 0) {
					ans++;
					break;
				} else if (bj.compareTo(bn) > 0) {
					break;
				}
			}
		}
		List<Long> list2 = divList(n - 1);
		ans += list2.size();
		System.out.println(ans + 1);
	}

	static List<Long> divList(long n) {
		List<Long> list = new ArrayList<>();
		long end = (long) Math.sqrt(n);
		for (int i = 1; i <= end; i++) {
			if (n % i == 0) {
				list.add((long) i);
			}
		}
		int i = end * end == n ? list.size() - 2 : list.size() - 1;
		for ( ; i >= 0; i--) {
			list.add(n / list.get(i));
		}
		return list;
	}
}
