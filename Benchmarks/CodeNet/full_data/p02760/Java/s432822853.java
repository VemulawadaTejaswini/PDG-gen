import java.util.BitSet;
import java.util.Scanner;

class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Scanner sc) {
		int[] A = new int[9];
		for (int i = 0; i < A.length; i++) {
			A[i] = sc.nextInt();
		}

		int N = sc.nextInt();
		int[] B = new int[N];
		for (int i = 0; i < N; i++) {
			B[i] = sc.nextInt();
		}

		BitSet bits = new BitSet(9);
		for (int i = 0; i < A.length; i++) {
			for (int value : B) {
				if (A[i] == value) bits.set(i);
			}
		}

		System.out.println(bingo(bits) ? "Yes" : "No");
	}

	boolean bingo(BitSet bits){
		if (bits.get(0)) {
			if (bits.get(3) && bits.get(6)) return true;
			if (bits.get(1) && bits.get(2)) return true;
			return bits.get(4) && bits.get(8);
		}
		if (bits.get(1)) return bits.get(4) && bits.get(7);
		if (bits.get(2)) return (bits.get(5) && bits.get(8)) || (bits.get(4) && bits.get(6));
		if (bits.get(3)) return bits.get(4) && bits.get(5);
		return bits.get(6) && bits.get(7) && bits.get(8);
	}
}

class Main {
	public static void main(String... args) {
		Scanner in = new Scanner(System.in);

		Solver.INSTANCE.solve(in);

		in.close();
	}
}