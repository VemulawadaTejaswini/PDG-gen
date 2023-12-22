import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] x = new int[n];
		int[] y = new int[n];
		int[] h = new int[n];
		int matchx = 0;
		int matchy = 0;
		int ansx = 0;
		int ansy = 0;
		int ansh = 0;
		List<Integer> xList = new ArrayList<>();
		List<Integer> yList = new ArrayList<>();
		List<Integer> xhList = new ArrayList<>();
		List<Integer> yhList = new ArrayList<>();

		if (n == 1) {
			x[0] = sc.nextInt();
			y[0] = sc.nextInt();
			h[0] = sc.nextInt();
			System.out.println(x[0] + " " + y[0] + " " + h[0]);
		} else if (n == 2) {
			int minx = 0;
			int miny = 0;
			int minh = 0;
			int maxh = 0;
			for (int i = 0; i < 2; i++) {
				x[i] = sc.nextInt();
				y[i] = sc.nextInt();
				h[i] = sc.nextInt();
				if (i == 0) {
					minx = x[i];
					miny = y[i];
					minh = h[i];
				} else {
					if (h[i] < minh) {
						minx = x[i];
						miny = y[i];
						minh = h[i];
					}
				}
			}
			for (int i = 0; i <= 100; i++) {
				if (Math.abs(h[0] - h[1]) >= Math.abs(minx - i)) {
					for (int j = 0; j <= 100; j++) {
						if ((Math.abs(minx - i) + Math.abs(miny - j)) == Math.abs(h[0] - h[1])) {
							maxh = minh + Math.abs(minx - i) + Math.abs(miny - j);
							System.out.println(i + " " + j + " " + maxh);
							return;
						}
					}
				}

			}
		} else if (n == 3) {
			for (int i = 0; i < 3; i++) {
				x[i] = sc.nextInt();
				y[i] = sc.nextInt();
				h[i] = sc.nextInt();
				if(i == 0) {
					matchx = x[i];
					matchy = y[i];
				} else if (i == 2) {
					if (x[i] == x[i-1] && x[i] != x[i-2]) {
						matchx = x[i];
					}
					if (y[i] == y[i-1] && y[i] != y[i-2]) {
						matchy = y[i];
					}
				}
			}
			for (int i = 0; i < 3; i++) {
				if (x[i] == matchx) {
					yList.add(y[i]);
					yhList.add(h[i]);
				}
				if (y[i] == matchy) {
					xList.add(x[i]);
					xhList.add(h[i]);
				}
			}
			for (int i = 0; i <= 100; i++) {
				if (xhList.get(0) + (Math.abs(xList.get(0) - i)) == xhList.get(1) + (Math.abs(xList.get(1) - i))) {
					ansx = i;
					break;
				}
			}
			for (int i = 0; i <= 100; i++) {
				if (yhList.get(0) + (Math.abs(yList.get(0) - i)) == yhList.get(1) + (Math.abs(yList.get(1) - i))) {
					ansy = i;
					break;
				}
			}
			ansh = h[0] + (Math.abs(x[0] - ansx)) + (Math.abs(y[0] - ansy));
			System.out.println(ansx + " " + ansy + " " + ansh);
			return;
		} else if (n >= 4) {
			Map<Integer, Integer> xmap = new HashMap<>();
			Map<Integer, Integer> ymap = new HashMap<>();
			for (int i = 0; i < n; i++) {
				x[i] = sc.nextInt();
				y[i] = sc.nextInt();
				h[i] = sc.nextInt();
				boolean xflag = true;
				boolean yflag = true;
				if (xmap.containsKey(x[i]) && xflag) {
					yList.add(y[xmap.get(x[i])]);
					yList.add(y[i]);
					yhList.add(h[xmap.get(x[i])]);
					yhList.add(h[i]);
					xflag = false;
				} else {
					xmap.put(x[i], i);
				}
				if (ymap.containsKey(y[i]) && yflag) {
					xList.add(x[ymap.get(y[i])]);
					xList.add(x[i]);
					xhList.add(h[ymap.get(y[i])]);
					xhList.add(h[i]);
					yflag = false;
				} else {
					ymap.put(y[i], i);
				}
			}
			for (int i = 0; i <= 100; i++) {
				if (xhList.get(0) + (Math.abs(xList.get(0) - i)) == xhList.get(1) + (Math.abs(xList.get(1) - i))) {
					ansx = i;
					break;
				}
			}
			for (int i = 0; i <= 100; i++) {
				if (yhList.get(0) + (Math.abs(yList.get(0) - i)) == yhList.get(1) + (Math.abs(yList.get(1) - i))) {
					ansy = i;
					break;
				}
			}
			ansh = h[0] + (Math.abs(x[0] - ansx)) + (Math.abs(y[0] - ansy));
			System.out.println(ansx + " " + ansy + " " + ansh);
			return;
		}
	}
}
