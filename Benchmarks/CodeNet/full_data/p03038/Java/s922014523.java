import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			final int N = s.nextInt();
			final int M = s.nextInt();

			long sum = 0;
			PriorityQueue<Integer> queue = new PriorityQueue<Integer>(N);
			for (int i = 0; i < N; i++) {
				int a = s.nextInt();
				sum += a;
				queue.add(a);
			}

			for (int i = 0; i < M; i++) {
				int b = s.nextInt();
				Integer c = s.nextInt();

				for (int j = 0; j < b; j++) {
					Integer min = queue.poll();
					if (min.compareTo(c) < 0) {
						queue.add(c);
						sum += c - min;
					} else {
						queue.add(min);
						break;
					}
				}
			}

			System.out.println(sum);
		}
	}
}
