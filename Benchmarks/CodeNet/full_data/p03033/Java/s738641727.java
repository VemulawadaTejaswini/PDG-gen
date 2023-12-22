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

	public static<T> void printArrayLT(List<T> a) {
		for (T t : a) {
			System.out.print(t + ", ");
		}
		System.out.println();
	}

	public static final class Triple implements Comparable<Triple> {
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
			int x = this.X - o.X;
			if (x != 0) {
				return x;
			}
			return (this.S - this.X) - (o.S - o.X);
		}
	}

	public static final class Pair implements Comparable<Pair> {
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
			int d = this.D - o.D;
			if (d != 0) {
				return d;
			}
			return this.index - o.index;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 2 * 10^5
		int Q = sc.nextInt(); // 2 * 10^5
		Triple[] STX = new Triple[N];
		ArrayList<Pair> DLIST = new ArrayList<>();
		int[] D = new int[Q];
		for (int i = 0; i < N; i++) {
			int s = sc.nextInt(); // 10^9
			int t = sc.nextInt(); // 10^9
			int x = sc.nextInt(); // 10^9
			STX[i] = new Triple(s, t, x);
		}
		for (int i = 0; i < Q; i++) {
			int d = sc.nextInt(); // 10^9
			DLIST.add(new Pair(d, i));
			D[i] = -1;
		}

		Arrays.sort(STX, 0, N);
		Collections.sort(DLIST);
		// printArrayLT(DLIST);
		for (Triple stx : STX) {
			// System.out.println("---");
			int startTime = stx.S - stx.X;
			int endTime = stx.T - stx.X;
			int ixS = Collections.binarySearch(DLIST, new Pair(startTime, -1));
			int start = -ixS - 1;
			int cnt = 0;
			for (Pair p : DLIST.subList(start, DLIST.size())) {
				if (p.D < endTime) {
					D[p.index] = stx.X;
					cnt++;
				} else {
					break;
				}
			}
			DLIST.subList(start, start + cnt).clear();
		}
		for (int len : D) {
			System.out.println(len);
		}
	}
}
