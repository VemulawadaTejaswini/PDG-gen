import java.util.*;

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
		int[] v = {0, -1};
		int[] h = {-1, 0};
		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				if (i == 0 && j == 0) {
					cost[j][i] = !table[j].get(i) ? 1 : 0;
					continue;
				}
				int min = Integer.MAX_VALUE;
				for (int k = 0; k < 2; k++) {
					int x = i + h[k];
					int y = j + v[k];
					if (x < 0 || y < 0) continue;
					min = Math.min(cost[y][x] + (table[y].get(x) && !table[j].get(i) ? 1 : 0), min);
				}
				cost[j][i] = min;
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