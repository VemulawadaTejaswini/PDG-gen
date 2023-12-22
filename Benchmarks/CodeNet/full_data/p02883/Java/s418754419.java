import java.io.*;
import java.util.*;
import java.util.function.*;

final class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Supplier<String> sc) {
		int N = Integer.parseInt(sc.get());
		long K = Long.parseLong(sc.get());
		int[] A = new int[N];
		Arrays.setAll(A, $ -> Integer.parseInt(sc.get()));
		int[] F = new int[N];
		Arrays.setAll(F, $ -> Integer.parseInt(sc.get()));
		Arrays.sort(A);
		Arrays.sort(F);

		long notrain = -1;
		for (int i = 0; i < A.length; i++) {
			long member = A[i];
			long food = F[F.length - 1 - i];
			if (notrain < member * food) {
				notrain = member * food;
			}
		}

		long ng = -1;
		long ok = notrain;
		while (Math.abs(ok - ng) > 1) {
			long mid = (ok + ng) / 2;
			if (canTrain(K, mid, A, F)) ok = mid;
			else ng = mid;
		}

		System.out.println(ok);
	}

	static long ceilDiv(long a, long div){
		return -Math.floorDiv(-a, div);
	}

	boolean canTrain(long K, long max, int[] A, int[] F){
		for (int i = 0; i < A.length; i++) {
			long member = A[i];
			long food = F[F.length - 1 - i];
			long time = member * food;
			if (max >= time) continue;
			K -= ceilDiv(time - max, food);
			if (K < 0) return false;
		}
		return K >= 0;
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