import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			final int N = s.nextInt();
			final int M = s.nextInt();

			PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
			for (int i = 0; i < N; i++) {
				queue.add(s.nextInt());
			}

			for (int i = 0; i < M; i++) {
				int b = s.nextInt();
				Integer c = s.nextInt();

				for (int j = 0; j < b; j++) {
					Integer min = queue.poll();
					if (min.compareTo(c) < 0) {
						queue.add(c);
					} else {
						queue.add(min);
						break;
					}
				}
			}

			long sum = 0;
			while (!queue.isEmpty()) {
				sum += queue.poll();
			}
			System.out.println(sum);
		}
	}
}
