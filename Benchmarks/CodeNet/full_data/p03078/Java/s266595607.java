import java.util.*;

public class Main {
	static class Tuple {
		int x, y, z, id;
		long value;

		public Tuple(int x, int y, int z) {
			this.x = x;
			this.y = y;
			this.z = z;
			this.id = (x * 1024 + y) * 1024 + z;
			this.value = A[x] + B[y] + C[z];
		}

		public static Tuple build(int x, int y, int z) {
			if (x >= 0 && y >= 0 && z >= 0) {
				return new Tuple(x, y, z);
			}
			return null;
		}
	}

	static int X, Y, Z, K;
	static long[] A, B, C;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		X = sc.nextInt();
		Y = sc.nextInt();
		Z = sc.nextInt();
		K = sc.nextInt();
		A = new long[X];
		for (int i = 0; i < X; i++) {
			A[i] = sc.nextLong();
		}
		B = new long[Y];
		for (int i = 0; i < Y; i++) {
			B[i] = sc.nextLong();
		}
		C = new long[Z];
		for (int i = 0; i < Z; i++) {
			C[i] = sc.nextLong();
		}

		Arrays.sort(A);
		Arrays.sort(B);
		Arrays.sort(C);

		Set<Integer> visited = new HashSet<Integer>();
		PriorityQueue<Tuple> q = new PriorityQueue<Tuple>(Comparator.comparingLong((Tuple t) -> t.value).reversed());
		{
			Tuple t = new Tuple(A.length - 1, B.length - 1, C.length - 1);
			visited.add(t.id);
			q.add(t);
		}
		Tuple[] ts = new Tuple[3];
		for (int i = 0; i < K; i++) {
			Tuple t = q.poll();
			System.out.println(t.value);
			ts[0] = Tuple.build(t.x - 1, t.y, t.z);
			ts[1] = Tuple.build(t.x, t.y - 1, t.z);
			ts[2] = Tuple.build(t.x, t.y, t.z - 1);
			for (Tuple newT : ts) {
				if (newT != null) {
					if (!visited.contains(newT.id)) {
						visited.add(newT.id);
						q.add(newT);
					}
				}
			}
		}
	}
}
