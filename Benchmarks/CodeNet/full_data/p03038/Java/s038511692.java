import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			final int N = Integer.parseInt(s.next());
			final int M = Integer.parseInt(s.next());

			PriorityQueue<Integer> queue = new PriorityQueue<Integer>(N);
			for (int i = 0; i < N; i++) {
				queue.add(Integer.valueOf(s.next()));
			}

			for (int i = 0; i < M; i++) {
				int b = Integer.parseInt(s.next());
				Integer c = Integer.valueOf(s.next());

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

			Integer[] ary = new Integer[queue.size()];
			queue.toArray(ary);
			long sum = 0;
			for (int i = 0; i < ary.length; i++) {
				sum += ary[i];
			}
			System.out.println(sum);
		}
	}
}
