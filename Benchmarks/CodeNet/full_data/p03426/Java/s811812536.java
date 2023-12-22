import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int d = sc.nextInt();
		Map<Integer, Pair> map = new HashMap<Integer, Pair>();

		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				int a = sc.nextInt();
				map.put(a, new Pair(i, j));
			}
		}

		int q = sc.nextInt();
		for (int i = 0; i < q; i++) {
			int l = sc.nextInt();
			int r = sc.nextInt();
			int totalmp = 0;
			while (l < r) {
				totalmp += mp(map.get(l), map.get(l + d));
				l += d;
			}
			System.out.println(totalmp);
		}
	}

	private static class Pair {
		int y;
		int x;
		Pair(int y, int x) {
			this.y = y;
			this.x = x;
		}
	}

	private static int mp(Pair p, Pair q) {
		return Math.abs(p.y - q.y) + Math.abs(p.x - q.x);
	}
}
