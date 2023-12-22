import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			final int X = s.nextInt();
			final int Y = s.nextInt();
			final int Z = s.nextInt();
			final int K = s.nextInt();
			final List<Long> A = new ArrayList<>(X);
			final List<Long> B = new ArrayList<>(Y);
			final List<Long> C = new ArrayList<>(Z);

			for (int i = 0; i < X; i++) {
				A.add(s.nextLong());
			}
			Collections.sort(A, Comparator.reverseOrder());

			for (int i = 0; i < Y; i++) {
				B.add(s.nextLong());
			}
			Collections.sort(B, Comparator.reverseOrder());

			for (int i = 0; i < Z; i++) {
				C.add(s.nextLong());
			}
			Collections.sort(C, Comparator.reverseOrder());

			PriorityQueue<Value> pq = new PriorityQueue<>(K * 3,
					Comparator.comparingLong(Value::getP).reversed());
			pq.add(new Value(A.get(0) + B.get(0) + C.get(0), 0, 0, 0));
			for (int i = 0; i < K; i++) {
				Value v = pq.poll();
				System.out.println(v.p);
				if (v.x + 1 < X) {
					Value n = new Value(A.get(v.x + 1) + B.get(v.y) + C.get(v.z), v.x + 1, v.y, v.z);
					if (!pq.contains(n))
						pq.add(n);
				}
				if (v.y + 1 < Y) {
					Value n = new Value(A.get(v.x) + B.get(v.y + 1) + C.get(v.z), v.x, v.y + 1, v.z);
					if (!pq.contains(n))
						pq.add(n);
				}
				if (v.z + 1 < Z) {
					Value n = new Value(A.get(v.x) + B.get(v.y) + C.get(v.z + 1), v.x, v.y, v.z + 1);
					if (!pq.contains(n))
						pq.add(n);
				}
			}
		}
	}

	static class Value {
		@Override
		public int hashCode() {
			return Objects.hash(x, y, z);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (!(obj instanceof Value))
				return false;
			Value other = (Value) obj;
			return x == other.x && y == other.y && z == other.z;
		}

		final long p;
		final int x;
		final int y;
		final int z;

		public Value(long p, int x, int y, int z) {
			this.p = p;
			this.x = x;
			this.y = y;
			this.z = z;
		}

		long getP() {
			return p;
		}
	}
}
