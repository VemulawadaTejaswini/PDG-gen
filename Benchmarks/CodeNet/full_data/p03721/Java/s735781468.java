import java.util.*;

final class Block {
	int value;
	int count;

	Block(int value, int count) {
		this.value = value;
		this.count = count;
	}
}

final class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Scanner sc) {
		int N = Integer.parseInt(sc.next());
		int K = Integer.parseInt(sc.next());
		Block[] blocks = new Block[N];
		for (int i = 0; i < N; i++) {
			blocks[i] = new Block(Integer.parseInt(sc.next()), Integer.parseInt(sc.next()));
		}
		Arrays.sort(blocks, Comparator.comparingInt(b -> b.value));
		long sum = 0;
		for (Block block : blocks) {
			sum += block.count;
			if (sum >= K) {
				System.out.println(block.value);
				return;
			}
		}
	}
}

class Main {
	public static void main(String... args) {
		Scanner in = new Scanner(System.in);

		Solver.INSTANCE.solve(in);

		in.close();
	}
}