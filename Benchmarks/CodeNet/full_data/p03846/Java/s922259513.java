import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long[] A = new long[(int) N];
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		Map<Long, Long> map = new HashMap<Long, Long>();
		for (int i = 0; i < N; i++) {
			if (map.containsKey(A[i])) {
				map.put(A[i], map.get(A[i]) + 1);
			} else {
				map.put(A[i], (long) 1);
			}
		}
		long ret = 0;
		// gusu
		if (N % 2 == 0) {
			for (long i = 1; i < N; i += 2) {
				if (map.get(i) != 2) {
					System.out.println(ret);
					return;
				}
			}
		} else {
			if (map.get((long) 0) != 1) {
				System.out.println(ret);
				return;
			}
			for (long i = 2; i < N; i += 2) {
				if (map.get(i) != 2) {
					System.out.println(ret);
					return;
				}
			}
		}
		ret = (long) Math.pow(2, (long) N / 2);
		ret = (long) ret % 1000000007;
		System.out.println(ret);

	}
}