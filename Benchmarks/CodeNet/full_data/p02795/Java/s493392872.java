import java.util.Scanner;

class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Scanner sc) {
		int H = sc.nextInt();
		int W = sc.nextInt();
		int N = sc.nextInt();

		if (H > W) {
			int swap = H;
			H = W;
			W = swap;
		}

		int sum = 0;
		for (int i = 0; i < H; i++) {
			if (sum >= N){
				System.out.println(i);
				return;
			}
			sum += W;
		}
		System.out.println(H);
	}
}

class Main {
	public static void main(String... args) {
		Scanner in = new Scanner(System.in);

		Solver.INSTANCE.solve(in);

		in.close();
	}
}