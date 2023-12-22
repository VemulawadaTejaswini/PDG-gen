import java.util.*;

public class Main {
	public static void printArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ", ");
		}
		System.out.println();
	}

	public static void printTuple(Tuple[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ", ");
		}
		System.out.println();
	}

	public static class Tuple implements Comparable<Tuple> {
		public final int b, c;

		public Tuple(int b, int c) {
			this.b = b;
			this.c = c;
		}

		@Override
		public int compareTo(Tuple that) {
			return this.c - that.c;
		}

		@Override
		public String toString() {
			return "(" + this.b + ", " + this.c + ")";
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] A = new int[N];
		Tuple[] BC = new Tuple[M];
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		for (int i = 0; i < M; i++) {
			int b = sc.nextInt();
			int c = sc.nextInt();
			BC[i] = new Tuple(b, c);
		}
		Arrays.sort(A);
		Arrays.sort(BC);
		// printArray(A);
		// printTuple(BC);

		int ixA = N - 1;
		int ixB = M - 1;
		int rest = N;
		long sum = 0;
		while (rest > 0) {
			// System.out.print("sum = " + sum + ", rest = " + rest + "\t");
			if (ixB >= 0 && A[ixA] < BC[ixB].c) {
				// System.out.println("select B " + BC[ixB]);
				if (rest > BC[ixB].b) {
					rest -= BC[ixB].b;
					sum += (long)BC[ixB].b * (long)BC[ixB].c;
					ixB--;
				} else {
					sum += (long)rest * (long)BC[ixB].c;
					rest = 0;
				}
			} else {
				// System.out.println("select A " + A[ixA]);
				rest -= 1;
				sum += A[ixA];
				ixA--;
			}
		}
		System.out.println(sum);
	}
}
