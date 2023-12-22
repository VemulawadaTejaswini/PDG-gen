import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	long mo = 1_000_000_000 + 7;

	void run() {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		long n = s.length();
		int k = sc.nextInt();
		ArrayList<String> list = new ArrayList<>();
		for (int i = 0; i < n; ++i) {
			for (int d = 1; i + d <= n && d <= 5; ++d) {
				list.add(s.substring(i, i + d));
			}
		}
		Collections.sort(list, null);
		int p = 0;
		for (int i = 0; i < list.size(); ++i) {
			if (i + 1 < list.size() && list.get(i).equals(list.get(i + 1)))
				continue;
			++p;
			if (p == k) {
				System.out.println(list.get(i));
				return;
			}
		}
		throw new AssertionError();
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}

}
