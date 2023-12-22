import java.io.*;
import java.util.*;
import java.util.function.*;

final class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Supplier<String> sc) {
		int N = Integer.parseInt(sc.get());
		int M = Integer.parseInt(sc.get());
		int L = Integer.parseInt(sc.get());
		long INF = 100000000000000000L;


		long[][] map = new long[N][N];
		for (long[] ints : map) {
			Arrays.fill(ints, INF);
		}
		for (int i = 0; i < M; i++) {
			int A = Integer.parseInt(sc.get()) - 1;
			int B = Integer.parseInt(sc.get()) - 1;
			int C = Integer.parseInt(sc.get());
			map[A][B] = C;
			map[B][A] = C;
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				for (int k = 0; k < N; k++) {
					map[j][k] = Math.min(map[j][k], map[j][i] + map[i][k]);
				}
			}
		}


		long[][] count = new long[N][N];
		for (long[] ints : count) {
			Arrays.fill(ints, INF);
		}
		for (int i = 0; i < map.length; i++) {
			long[] city = map[i];
			for (int j = 0; j < city.length; j++) {
				if (city[j] <= L) {
					count[i][j] = 1;
				}
			}
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				for (int k = 0; k < N; k++) {
					count[j][k] = Math.min(count[j][k], count[j][i] + count[i][k]);
				}
			}
		}


		int Q = Integer.parseInt(sc.get());
		for (int i = 0; i < Q; i++) {
			int S = Integer.parseInt(sc.get()) - 1;
			int T = Integer.parseInt(sc.get()) - 1;
			if (count[S][T] >= INF) System.out.println(-1);
			else System.out.println(count[S][T] - 1);
		}
	}
}

class Main {
	public static void main(String... args) {
		System.setOut(new PrintStream(new BufferedOutputStream(System.out)));
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Solver.INSTANCE.solve(new Supplier<String>() {
			StringTokenizer line;

			public String get() {
				while (line == null || !line.hasMoreTokens()) try {
					line = new StringTokenizer(reader.readLine());
				} catch (IOException e) {
					throw new UncheckedIOException(e);
				}
				return line.nextToken();
			}
		});
		System.out.flush();
	}
}