import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	int n;
	int[] a;

	void run() {
		try (Scanner sc = new Scanner(System.in)) {
			n = sc.nextInt();
			// n = 200000;
			a = new int[n];

			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
				// a[i] = (int) (Math.random() * 1000000000);
			}

			System.out.println(fnc());
		}
	}

	String fnc() {

		List<Long> sums = new ArrayList<Long>();
		List<Long> cnts = new ArrayList<Long>();

		long[] s = new long[n + 1];
		for (int i = 0; i <= n; i++) {
			if (i > 0) {
				s[i] = a[i - 1] + s[i - 1];
			}

			int id = Collections.binarySearch(sums, s[i]);
			if (id >= 0) {
				cnts.set(id, cnts.get(id) + 1);
			} else {
				sums.add(-(id + 1), s[i]);
				cnts.add(-(id + 1), 1L);
			}
		}

		long cnt = 0;
		for (long tmp : cnts) {
			cnt += tmp * (tmp - 1) / 2;
		}

		return "" + cnt;
	}

	public static void main(String[] args) {
		new Main().run();
	}

}
