import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	int N, M;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		N = sc.nextInt();
		M = sc.nextInt();

		List<List<Integer>> AB = new ArrayList<>();

		for (int i = 0; i <= 100000; i++) {
			AB.add(new ArrayList<>());
		}

		for (int i = 0; i < N; i++) {
			AB.get(sc.nextInt()).add(sc.nextInt());
		}

		sc.close();

		PriorityQueue<Integer> q = new PriorityQueue<>((a, b) -> Integer.compare(b, a));

		long ans = 0;

		for (int i = 1; i <= M; i++) {
			for (Integer x : AB.get(i)) {
				q.add(x);
			}
			if (!q.isEmpty()) {
				ans += q.poll();
			}
		}

		out.println(ans);

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
