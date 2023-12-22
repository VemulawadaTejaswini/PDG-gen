import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		sc.close();

		List<Long> list = new ArrayList<>();
		for (int i = 1; i <= 9; i++) {
			dfs(list, i);
		}
		Collections.sort(list);
		System.out.println(list.get(k - 1));
	}

	static void dfs(List<Long> list, long x) {
		if (x > 3234566667L) {
			return;
		}
		list.add(x);
		long s = Math.max(x % 10 - 1, 0);
		long e = Math.min(x % 10 + 1, 9);
		long y = x * 10;
		for (long i = s; i <= e; i++) {
			dfs(list, y + i);
		}
	}
}
