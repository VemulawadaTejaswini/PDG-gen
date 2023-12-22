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
		for (int i = 0; i < q; i++) {
			l = sc.nextInt();
			r = sc.nextInt();
			sum = 0;
			while (r > l) {
				Position pos1 = hm.get(l);
				Position pos2 = hm.get(l + d);
				sum += Math.abs(pos1.geth() - pos2.geth())
						+ Math.abs(pos1.getw() - pos2.getw());
				l += d;
			}
			System.out.println(sum);
		}
	}
}

class Position {
	private int h;
	private int w;

	public Position(int h, int w) {
		this.h = h;
		this.w = w;
	}

	public int geth() {
		return h;
	}

	public int getw() {
		return w;
	}
}