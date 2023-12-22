import java.io.*;
import java.util.*;

class Main {

	public static void main(String[] args) throws Exception {
		final Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] a = new long[(3 * N)];
		for (int i = 0; i < 3 * N; i++) {
			a[i] = sc.nextLong();
		}
		solve(N, a);
	}

	static void solve(int N, long[] a) {
		PriorityQueue<Long> first = new PriorityQueue<>();
		PriorityQueue<Long> second = new PriorityQueue<>(Comparator.reverseOrder());
		long fsum = 0;
		long ssum = 0;
		for (int i = 0; i < N; i++) {
			first.offer(a[i]);
			fsum += a[i];
			second.offer(a[3 * N - i - 1]);
			ssum += a[3 * N - i - 1];
		}

		int l = N, r = 2 * N - 1;
		while (N-- > 0) {
			long f = first.peek();
			long s = second.peek();

			if (a[r] >= s) {
				r--;
				continue;
			}

			if (a[l] <= f) {
				l++;
				continue;
			}

			if (a[l] - f > s - a[r]) {
				first.poll();
				fsum -= f;
				first.offer(a[l]);
				fsum += a[l++];
			} else {
				second.poll();
				ssum -= s;
				second.offer(a[r]);
				ssum += a[r--];
			}
		}

		System.out.println(fsum - ssum);
	}
}
