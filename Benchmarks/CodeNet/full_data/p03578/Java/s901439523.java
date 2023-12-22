
import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Long> s1 = new ArrayList<>();
		List<Long> s2 = new ArrayList<>();

		long x = 0;
		for (int i = 0; i < n; i++) {
			long c = sc.nextLong();

			s1.add(c);
		}
		long y = 0;
		int m = sc.nextInt();
		for (int i = 0; i < m; i++) {
			long c = sc.nextLong();
			if (!s2.contains(c))
				y += c;
			s2.add(c);
		}
		for (Long l1 : s2) {
			if (s1.contains(l1)) {
				s1.remove(l1);
			} else {
				System.out.println("NO");
				return;
			}
		}

		System.out.println("YES");

	}

}
