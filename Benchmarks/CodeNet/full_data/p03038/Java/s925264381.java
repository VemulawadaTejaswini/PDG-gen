import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			final int N = s.nextInt();
			final int M = s.nextInt();

			PriorityQueue<int[]> queue = new PriorityQueue<int[]>(N,
					(ary1, ary2) -> ary1[0] - ary2[0]);
			long sum = 0;
			for (int i = 0; i < N; i++) {
				int a = s.nextInt();
				sum += a;
				queue.add(new int[] { a });
			}

			for (int i = 0; i < M; i++) {
				int b = s.nextInt();
				int c = s.nextInt();

				for (int j = 0; j < b; j++) {
					int[] w = queue.poll();
					int min = w[0];
					if (min < c) {
						queue.add(new int[] { c });
						sum += c - min;
					} else {
						queue.add(w);
						break;
					}
				}
			}

			System.out.println(sum);
		}
	}
}
