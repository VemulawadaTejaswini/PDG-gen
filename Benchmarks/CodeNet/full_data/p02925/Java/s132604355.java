import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int N = sc.nextInt();

		int[][] A = new int[N][N - 1];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N - 1; j++) {
				A[i][j] = sc.nextInt() - 1;
			}
		}

		sc.close();

		int ans = 0;

		Queue<Integer> que = new ArrayDeque<>();
		for (int i = 0; i < N; i++) {
			que.add(i);
		}

		int[] idx = new int[N];
		for (;;) {
			boolean b = false;
			boolean[] z = new boolean[N];

			Queue<Integer> newQue = new ArrayDeque<>();
			while (!que.isEmpty()) {
				int p = que.poll();

				if (idx[p] >= N - 1 || idx[A[p][idx[p]]] >= N - 1 || z[p] || z[A[p][idx[p]]]) {
					continue;
				}
				int aite = A[p][idx[p]];
				if (p == A[aite][idx[aite]]) {
					b = true;
					idx[p]++;
					idx[aite]++;
					z[p] = true;
					z[aite] = true;
					newQue.add(p);
					newQue.add(aite);

				}
			}
			que = newQue;
			if (b) {
				ans++;
			} else {
				break;
			}
		}

		for (int i = 0; i < N; i++) {
			if (idx[i] < N - 1) {
				ans = -1;
			}
		}

		out.println(ans);

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
