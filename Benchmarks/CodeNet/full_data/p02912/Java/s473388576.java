import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		if (n == 0) {
			System.out.println(0);
			return;
		}

		PriorityQueue<Long> q = new PriorityQueue<>((a, b) -> Long.compare(b, a));
		for (int i = 0; i < n; i++) {
			q.offer(sc.nextLong());
		}

		while (m-- > 0) {
			q.offer(q.poll() / 2);
		}

		long answer = 0;
		while (!q.isEmpty()) {
			answer += q.poll();
		}

		System.out.println(answer);
	}
}
