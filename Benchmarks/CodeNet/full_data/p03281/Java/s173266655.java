import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		int ans = 0;
		for (int i = 1; i <= n; i+=2) {
			if (divList(i).size() == 8) {
				ans++;
			}
		}
		System.out.println(ans);
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
