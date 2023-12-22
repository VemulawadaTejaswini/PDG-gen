import java.util.HashMap;
import java.util.Map;
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

		Map<Long, Integer> map = new HashMap<Long, Integer>();

		long sumIn = 0L;
		long cnt = 0;
		for (int i = 0; i <= n; i++) {
			if (i > 0) {
				sumIn += a[i - 1];
			}

			map.merge(sumIn, 1, Integer::sum);
			cnt += map.get(sumIn) - 1;
		}

		return "" + cnt;
	}

	public static void main(String[] args) {
		new Main().run();
	}

}
