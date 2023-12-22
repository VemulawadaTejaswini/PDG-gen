import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		HashMap<Long, Integer> set = new HashMap<>();
		int n = sc.nextInt();
		for (int i = 0; i < n; ++i) {
			long d = sc.nextLong();
			if (set.containsKey(d)) {
				set.put(d, set.get(d) + 1);
			} else {
				set.put(d, 1);
			}
		}

		int m = sc.nextInt();
		boolean f = true;
		for (int i = 0; i < m; ++i) {
			long t = sc.nextLong();
			if (set.containsKey(t)) {
				if (set.get(t) > 1) {
					set.put(t, set.get(t) - 1);
				} else {
					set.remove(t);
				}
			} else {
				f = false;
			}
		}
		if (f) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}

}
