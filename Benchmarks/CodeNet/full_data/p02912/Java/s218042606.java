import java.io.InputStream;
import java.io.PrintStream;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		final int N = sc.nextInt();
		final int M = sc.nextInt();

		PriorityQueue<Integer> que = new PriorityQueue<>((a, b) -> Integer.compare(b, a));
		for (int i = 0; i < N; i++) {
			que.add(sc.nextInt());
		}

		sc.close();

		for (int i = 0; i < M; i++) {
			int p = que.poll();
			que.add(p >> 1);
		}

		long ans = 0;
		while (!que.isEmpty()) {
			ans += que.poll();
		}

		out.println(ans);

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
