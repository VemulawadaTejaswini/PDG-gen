import java.util.BitSet;
import java.util.Scanner;

final class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Scanner sc) {
		int H = sc.nextInt();
		int W = sc.nextInt();
		BitSet[] table = new BitSet[H];
		for (int i = 0; i < H; i++) {
			BitSet bits = table[i] = new BitSet(W);
			String S = sc.next();
			char[] chars = S.toCharArray();
			for (int j = 0; j < chars.length; j++) {
				bits.set(j, chars[j] == '.');
			}
		}

		int[][] cost = new int[H][W];
		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				boolean from = table[j].get(i);
				if (i == 0 && j == 0) {
					cost[j][i] = !from ? 1 : 0;
				} else if (i == 0) {
					cost[j][i] = cost[j - 1][i] + (from && !table[j - 1].get(i) ? 1 : 0);
				} else if (j == 0) {
					cost[j][i] = cost[j][i - 1] + (from && !table[j].get(i - 1) ? 1 : 0);
				} else {
					cost[j][i] = Math.min(cost[j - 1][i] + (from && !table[j - 1].get(i) ? 1 : 0),
							cost[j][i - 1] + (from && !table[j].get(i - 1) ? 1 : 0));
				}
			}
		}
		System.out.println(cost[H - 1][W - 1]);
	}
}

class Main {
	public static void main(String... args) {
		Scanner in = new Scanner(System.in);

		Solver.INSTANCE.solve(in);

		in.close();
	}
}