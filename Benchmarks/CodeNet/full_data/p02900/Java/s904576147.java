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

		List<Long> list = divList(Math.max(a, b), Math.min(a, b));
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
		long end = (long) Math.sqrt(a);
		end = Math.max(end, 7);
		for (int i = 1; i <= end; i++) {
			if (a % i == 0 && b % i == 0) {
				list.add((long) i);
			}
		}
		return list;
	}

	static List<Long> sosuuList(int n) {
		List<Long> sosuu = new ArrayList<>();
		for (long i = 2; i <= n; i++) {
			int r = (int) Math.sqrt(i);
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
