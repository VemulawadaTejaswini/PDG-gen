import java.util.*;

public class Main {
	public static void printArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ", ");
		}
		System.out.println();
	}

	public static<T> void printArrayT(T[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ", ");
		}
		System.out.println();
	}

	public static class Triple implements Comparable<Triple> {
		public int S, T, X;
		Triple(int S, int T, int X) {
			this.S = S;
			this.T = T;
			this.X = X;
		}

		@Override
		public String toString() {
			return String.format("(%d, %d, %d)", S, T, X);
		}

		@Override
		public int compareTo(Triple o) {
			return this.X - o.X;
		}
	}

	public static class Pair implements Comparable<Pair> {
		public int D, index;
		Pair(int D, int index) {
			this.D = D;
			this.index = index;
		}

		@Override
		public String toString() {
			return String.format("(%d, %d)", D, index);
		}

		@Override
		public int compareTo(Pair o) {
			return this.D - o.D;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 2 * 10^5
		int Q = sc.nextInt(); // 2 * 10^5
		Triple[] STX = new Triple[N];
		TreeSet<Pair> DSET = new TreeSet<Pair>();
		int[] D = new int[Q];
		for (int i = 0; i < N; i++) {
			int s = sc.nextInt(); // 10^9
			int t = sc.nextInt(); // 10^9
			int x = sc.nextInt(); // 10^9
			STX[i] = new Triple(s, t, x);
		}
		for (int i = 0; i < Q; i++) {
			int d = sc.nextInt(); // 10^9
			DSET.add(new Pair(d, i));
			D[i] = -1;
		}

		Arrays.sort(STX, 0, N);
		for (Triple stx : STX) {
			int startTime = stx.S - stx.X;
			int endTime = stx.T - stx.X;
			Iterator<Pair> it = DSET.subSet(new Pair(startTime, -1), new Pair(endTime, -1)).iterator();
			while (it.hasNext()) {
				Pair pair = it.next();
				D[pair.index] = stx.X;
				it.remove();
			}
		}
		StringBuilder sb = new StringBuilder();
		for (int len : D) {
			sb.append(len);
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
