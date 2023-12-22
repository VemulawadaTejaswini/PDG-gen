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

		List<Long> listA = divList(a);
		List<Long> listB = divList(b);
		Set<Long> set = new HashSet<>(listB);
		Set<Long> ans = new HashSet<>();
		for (long o : listA) {
			if (set.contains(o) && isSosuu(o)) {
				ans.add(o);
			}
		}
		System.out.println(ans.size());
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

	static boolean isSosuu(long n) {
		long end = (int) Math.sqrt(n);
		for (int i = 2; i <= end; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
