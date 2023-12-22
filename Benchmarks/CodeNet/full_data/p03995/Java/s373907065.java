import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	int w, h;
	TreeMap<Integer, List<C>> mapX, mapY;
	TreeMap<Pair, C> map;

	class C implements Comparable<C> {
		Pair p;
		long value;

		C(int x, int y, long value) {
			this.p = new Pair(x, y);
			this.value = value;
		}

		@Override
		public int compareTo(C o) {
			return this.p.compareTo(o.p);
		}
	}

	class Pair implements Comparable<Pair> {
		int x, y;

		Pair(int x, int y) {
			this.x = x;
			this.y = y;
		}

		@Override
		public int compareTo(Pair o) {
			if (this.x != o.x) {
				return this.x - o.x;
			}
			return this.y - o.y;
		}
	}

	void run() {
		Scanner sc = new Scanner(System.in);

		w = sc.nextInt();
		h = sc.nextInt();
		int n = sc.nextInt();
		C[] c = new C[n];
		mapX = new TreeMap<Integer, List<C>>();
		mapY = new TreeMap<Integer, List<C>>();
		map = new TreeMap<Pair, C>();
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int v = sc.nextInt();
			C tmp = new C(x, y, v);
			c[i] = tmp;
			if (mapX.containsKey(x)) {
				mapX.get(x).add(tmp);
			} else {
				List<C> xlist = new LinkedList<C>();
				xlist.add(tmp);
				mapX.put(x, xlist);
			}
			if (mapY.containsKey(y)) {
				mapY.get(y).add(tmp);
			} else {
				List<C> ylist = new LinkedList<C>();
				ylist.add(tmp);
				mapY.put(y, ylist);
			}
			map.put(new Pair(x, y), new C(x, y, v));
		}

		for (int i = 0; i < n; i++) {
			int x = c[i].p.x;
			int y = c[i].p.y;
			List<C> listX = mapX.get(x);
			List<C> listY = mapY.get(y);
			if (listX == null || listY == null) {
				continue;
			}
			for (C tmpX : listX) {
				for (C tmpY : listY) {
					int nx = tmpY.p.x;
					int ny = tmpX.p.y;
					long k = tmpX.value + tmpY.value - c[i].value;
					C tmpC = map.get(new Pair(nx, ny));
					if ((tmpC != null && tmpC.value != k) || (k < 0)) {
						System.out.println("No");
						return;
					}
				}
			}
		}
		System.out.println("Yes");
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
