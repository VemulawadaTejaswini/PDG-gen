import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a = new long[n];
		boolean allZero = true;
		Map<Long, Integer> counter = new HashMap<>();
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextLong();
			if (a[i] != 0) allZero = false;
			counter.put(a[i], counter.getOrDefault(a[i], 0) + 1);
		}

		if (allZero) {
			System.out.println("Yes");
			return;
		}

		if (counter.size() <= 1 || counter.size() > 3 || n % 3 != 0) {
			System.out.println("No");
			return;
		}

		if (counter.size() == 2) {
			if (counter.containsKey(0L) && counter.get(0L) == n / 3) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
			return;
		}

		long[] x = new long[3];
		int index = 0;
		for (Long i : counter.keySet()) {
			x[index++] = i;
		}

		if (((x[0] ^ x[1]) ^ x[2]) != 0) {
			System.out.println("No");
			return;
		}
		for (Integer i : counter.values()) {
			if (i != n / 3) {
				System.out.println("No");
				return;
			}
		}

		System.out.println("Yes");
	}
}
