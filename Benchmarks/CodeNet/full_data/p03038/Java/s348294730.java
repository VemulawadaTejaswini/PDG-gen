import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt(), m = scanner.nextInt();
			Queue<Integer> queue = new PriorityQueue<>();
			IntStream.range(0, n).forEach(i -> queue.add(scanner.nextInt()));
			IntStream.range(0, m).forEach(i -> {
				int b = scanner.nextInt(), c = scanner.nextInt();
				int count = 0;
				while ((count < b) && (queue.peek() < c)) {
					queue.poll();
					count++;
				}
				IntStream.range(0, count).forEach(j -> queue.add(c));
			});
			System.out.println(queue.stream().mapToLong(i -> i).sum());
		}
	}
}
