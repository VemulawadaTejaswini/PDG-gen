import java.util.HashMap;
import java.util.Scanner;

public class Main {
	static char[][] map;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int h = sc.nextInt();
		int w = sc.nextInt();
		int d = sc.nextInt();
		HashMap<Integer, Position> hm = new HashMap<>();
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				hm.put(sc.nextInt(), new Position(i, j));
			}
		}
		int q = sc.nextInt();
		int l, r, sum;
		int[] ans = new int[h * w + 1];

		for (int i = 1; i <= h * w; i++) {
			if (i <= d) {
				ans[i] = 0;
			} else {
				Position pos1 = hm.get(i);
				Position pos2 = hm.get(i - d);
				ans[i] = ans[i - d] + Math.abs(pos1.geth() - pos2.geth())
						+ Math.abs(pos1.getw() - pos2.getw());
			}
		}
		for (int i = 0; i < q; i++) {
			l = sc.nextInt();
			r = sc.nextInt();
			sb.append(ans[r] - ans[l] + "\n");
		}

		System.out.print(sb);
	}
}

class Position {
	private int h;
	private int w;

	public Position(int h, int w) {
		this.h = h;
		this.w = w;
	}

	public Position(Position pos) {
		this.h = pos.geth();
		this.w = pos.getw();
	}

	public int geth() {
		return h;
	}

	public int getw() {
		return w;
	}
}