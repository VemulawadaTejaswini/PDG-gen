import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		sc.close();

		List<Long> list = divList(a, b);
		list.add(a);
		list.add(b);
		List<Long> sosuuL = sosuuList(1000000);
		Set<Long> sosuu = new HashSet<>(sosuuL);

		Set<Long> ans = new HashSet<>();
		for (long o : list) {
			if (sosuu.contains(o)) {
				ans.add(o);
			}
		}
		System.out.println(ans.size() + 1);
	}

	static List<Long> divList(long a, long b) {
		List<Long> list = new ArrayList<>();
		for (long i = 1; i <= 1000000L; i++) {
			if (a % i == 0 && b % i == 0) {
				list.add(i);
			}
		}
		return list;
	}

	static List<Long> sosuuList(long n) {
		List<Long> sosuu = new ArrayList<>();
		for (long i = 2; i <= n; i++) {
			long r = (long) Math.sqrt(i);
			boolean flg = false;
			for (Long o : sosuu) {
				if (r < o) {
					break;
				}
				if (i % o == 0) {
					flg = true;
					break;
				}
			}
			if (!flg) {
				sosuu.add(i);
			}
		}
		return sosuu;
	}
}
