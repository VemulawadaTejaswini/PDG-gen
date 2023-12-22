import java.util.Arrays;
import java.util.Scanner;

final class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Scanner sc) {
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int[] P = new int[A];
		Arrays.setAll(P, $ -> sc.nextInt());
		int[] Q = new int[B];
		Arrays.setAll(Q, $ -> sc.nextInt());
		int[] R = new int[C];
		Arrays.setAll(R, $ -> sc.nextInt());
		Arrays.sort(P);
		Arrays.sort(Q);
		Arrays.sort(R);
		int pi = A - 1;
		int qi = B - 1;
		int ri = C - 1;
		long saturation = 0;
		for (int i = 0; i < X + Y; i++) {
			int ps = (A - (pi + 1)) >= X ? -1 : P[pi];
			int qs = (B - (qi + 1)) >= Y ? -1 : Q[qi];
			int rs = ri < 0 ? -1 : R[ri];
			if (ps > rs) {
				if (ps > qs) {
					saturation += ps;
					pi--;
				} else {
					saturation += qs;
					qi--;
				}
			} else {
				if (rs > qs) {
					saturation += rs;
					ri--;
				} else {
					saturation += qs;
					qi--;
				}
			}
		}
		System.out.println(saturation);
	}
}

class Main {
	public static void main(String... args) {
		Scanner in = new Scanner(System.in);

		Solver.INSTANCE.solve(in);

		in.close();
	}
}