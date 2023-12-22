import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long a[] = new long[N];
		long b[] = new long[N];

		long ans = 0;
		HashMap<Long,Integer> map = new HashMap<>();
		long c[] = new long[N];
		for (int i = 0; i < N; i++) {
			a[i] = sc.nextLong();
			b[i] = sc.nextLong();
			c[i] = a[i] + b[i];
			map.put(c[i],i);
		}
		Arrays.sort(c);

		long tk =0;
		long ao = 0;

		for (int i = 1; i <= N; i++) {
			long num = c[N-i];
			if (i%2 != 0) {
				tk += a[map.get(num)];
			} else {
				ao += b[map.get(num)];
			}
		}
		System.out.println(tk - ao);
	}
}
