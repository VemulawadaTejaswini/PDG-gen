import java.io.*;
import java.util.*;
import java.util.function.*;

final class Vector3 {
	int x, y, z;

	Vector3(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Vector3 vector3 = (Vector3) o;

		if (x != vector3.x) return false;
		if (y != vector3.y) return false;
		return z == vector3.z;
	}

	public int hashCode() {
		int result = x;
		result = 31 * result + y;
		result = 31 * result + z;
		return result;
	}
}

final class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Supplier<String> sc) {
		int X = Integer.parseInt(sc.get());
		int Y = Integer.parseInt(sc.get());
		int Z = Integer.parseInt(sc.get());
		int K = Integer.parseInt(sc.get());
		long[] A = new long[X];
		Arrays.setAll(A, $ -> Long.parseLong(sc.get()));
		long[] B = new long[Y];
		Arrays.setAll(B, $ -> Long.parseLong(sc.get()));
		long[] C = new long[Z];
		Arrays.setAll(C, $ -> Long.parseLong(sc.get()));
		Arrays.sort(A);
		Arrays.sort(B);
		Arrays.sort(C);

		Set<Vector3> used = new HashSet<>();
		PriorityQueue<Vector3> queue = new PriorityQueue<>(Comparator.comparingLong((Vector3 v) -> A[v.x] + B[v.y] + C[v.z]).reversed());
		{
			Vector3 e = new Vector3(X - 1, Y - 1, Z - 1);
			queue.add(e);
			used.add(e);
		}
		for (int i = 0; i < K; i++) {
			Vector3 v = queue.remove();
			System.out.println(A[v.x] + B[v.y] + C[v.z]);
			if (v.x > 0) {
				Vector3 x = new Vector3(v.x - 1, v.y, v.z);
				if (!used.contains(x)) {
					queue.add(x);
					used.add(x);
				}
			}
			if (v.y > 0) {
				Vector3 y = new Vector3(v.x, v.y - 1, v.z);
				if (!used.contains(y)) {
					queue.add(y);
					used.add(y);
				}
			}
			if (v.z > 0) {
				Vector3 z = new Vector3(v.x, v.y, v.z - 1);
				if (!used.contains(z)) {
					queue.add(z);
					used.add(z);
				}
			}
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
				try {
					return (line = line != null && line.hasMoreTokens() ? line : new StringTokenizer(reader.readLine())).nextToken();
				} catch (IOException e) {
					throw new UncheckedIOException(e);
				}
			}
		});
		System.out.flush();
	}
}