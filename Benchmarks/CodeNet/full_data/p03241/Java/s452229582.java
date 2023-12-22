import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.close();

		List<Integer> list = divList(m);
		Collections.reverse(list);
		for (long ans : list) {
			if (ans * n <= m) {
				System.out.println(ans);
				return;
			}
		}
	}

	static List<Integer> divList(int n) {
		List<Integer> list = new ArrayList<>();
		int end = (int) Math.sqrt(n);
		for (int i = 1; i <= end; i++) {
			if (n % i == 0) {
				list.add(i);
			}
		}
		int i = end * end == n ? list.size() - 2 : list.size() - 1;
		for ( ; i >= 0; i--) {
			list.add(n / list.get(i));
		}
		return list;
	}
}
