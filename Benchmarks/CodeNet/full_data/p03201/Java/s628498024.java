import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	static long[] a = new long[200003];

	static Map<Long, Long> b = new HashMap<Long, Long>();

	public static void main(String[] args) throws IOException {

		// BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Scanner in = new Scanner(System.in);
		long n = in.nextLong();
		for (int i = 0; i < n; i++) {
			a[i] = in.nextLong();
			if (!b.containsKey(a[i])) {
				b.put(a[i], (long) 1);
			} else {
				b.put(a[i], b.get(a[i]) + 1);
			}
		}
		long ans = 0;
		for (int i = 0; i < n; i++) {
			long number = a[i];
			for (int j = 31; j >= 0; j--) {
				long another_number = (long) Math.pow(2, j) - number;
				if (number == another_number) {
					if (b.containsKey(another_number) && b.get(another_number) >= 2) {
						// System.out.println(number + " " + another_number);
						ans++;
						b.put(another_number, b.get(another_number) - 2);
					}
				} else {
					if (b.containsKey(another_number) && b.get(number) >= 1 && b.get(another_number) >= 1) {
						// System.out.println(number + " " + another_number);
						ans++;
						b.put(number, b.get(number) - 1);
						b.put(another_number, b.get(another_number) - 1);
					}
				}
			}
		}
		System.out.println(ans);
	}
}