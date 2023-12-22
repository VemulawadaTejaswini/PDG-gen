import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long k = sc.nextLong();

		long[] a = new long[n];
		long[] s = new long[n + 1];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextLong() - 1;
			s[i + 1] = (s[i] + a[i]) % k;
		}

		long answer = 0;
		Queue<Long> q = new LinkedList<>();
		Map<Long, Long> h = new HashMap<>();

		for (int i = 0; i <= n; i++) {
			q.offer(s[i]);
			while (q.size() > k) {
				long x = q.poll();
				h.put(x, h.get(x) - 1);
			}

			if (!h.containsKey(s[i])) {
				h.put(s[i], 1L);
				continue;
			}

			answer += h.get(s[i]);
			h.put(s[i], h.get(s[i]) + 1);
		}

		System.out.println(answer);
	}
}
