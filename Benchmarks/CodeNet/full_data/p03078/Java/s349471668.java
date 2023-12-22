import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			int z = scanner.nextInt();
			int k = scanner.nextInt();
			scanner.nextLine();
			long[] a = new long[x];
			IntStream.range(0, x).forEach(i -> a[i] = scanner.nextLong());
			scanner.nextLine();
			Arrays.sort(a);

			long[] b = new long[y];
			IntStream.range(0, y).forEach(i -> b[i] = scanner.nextLong());
			scanner.nextLine();
			Arrays.sort(b);

			long[] c = new long[z];
			IntStream.range(0, z).forEach(i -> c[i] = scanner.nextLong());
			scanner.nextLine();
			Arrays.sort(c);

			long[] sum = new long[k];
			Queue<Sum> queue = new PriorityQueue<>((s1, s2) -> {
				if (s1.sum > s2.sum) {
					return -1;
				} else if (s1.sum == s2.sum) {
					return 0;
				} else {
					return 1;
				}
			});
			Set<Sum> set = new HashSet<>();
			Sum first = new Sum(a[x - 1] + b[y - 1] + c[z - 1], x - 1, y - 1, z - 1);
			queue.add(first);
			set.add(first);
			for (int j = 0; j < k; j++) {
				Sum now = queue.remove();
				sum[j] = now.sum;
				Sum sum1 = null, sum2 = null, sum3 = null;
				if (now.ia > 0) {
					sum1 = new Sum(a[now.ia - 1] + b[now.ib] + c[now.ic], now.ia - 1, now.ib, now.ic);
				}
				if (now.ib > 0) {
					sum2 = new Sum(a[now.ia] + b[now.ib - 1] + c[now.ic], now.ia, now.ib - 1, now.ic);
				}
				if (now.ic > 0) {
					sum3 = new Sum(a[now.ia] + b[now.ib] + c[now.ic - 1], now.ia, now.ib, now.ic - 1);
				}
				if ((null != sum1) && !queue.contains(sum1)) {
					queue.add(sum1);
					set.add(sum1);
				}
				if ((null != sum2) && !queue.contains(sum2)) {
					queue.add(sum2);
					set.add(sum2);
				}
				if ((null != sum3) && !queue.contains(sum3)) {
					queue.add(sum3);
					set.add(sum3);
				}
			}
			Arrays.stream(sum).forEach(System.out::println);
		}
	}

	private static class Sum {
		long sum;
		int ia;
		int ib;
		int ic;

		Sum(long sum, int ia, int ib, int ic) {
			super();
			this.sum = sum;
			this.ia = ia;
			this.ib = ib;
			this.ic = ic;
		}

		@Override
		public int hashCode() {
			return Objects.hash(sum, ia, ib, ic);
		}

		@Override
		public boolean equals(Object obj) {
			if (null == obj) {
				return false;
			} else if (obj instanceof Sum) {
				return (sum == ((Sum) obj).sum) && (ia == ((Sum) obj).ia) && (ib == ((Sum) obj).ib)
						&& (ic == ((Sum) obj).ic);
			}
			return false;
		}

		@Override
		public String toString() {
			return "sum=" + sum + ",ia=" + ia + ",ib=" + ib + ",ic=" + ic;
		}
	}
}
