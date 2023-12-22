import java.util.HashMap;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// int INF = 1000000007;
		int n = sc.nextInt();

		Vec[][] vec = new Vec[50][50];
		Vec[] ary = new Vec[50];

		//int[][] ary = new int[INF][INF];
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();

			// 50個保存
			ary[i] = new Vec();
			ary[i].x = x;
			ary[i].y = y;
		}

		HashMap<Integer, HashMap<Integer, Integer>> map = new HashMap<>();
		int max = 0;
		int maxx = 0;
		int maxy = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(i == j) continue;
				int x = ary[i].x - ary[j].x;
				int y = ary[i].y - ary[j].y;

				map.putIfAbsent(x, new HashMap<>());
				map.get(x).putIfAbsent(y, 0);

				int num = map.get(x).get(y) + 1;
				// System.out.println(num);

				if (num > max) {
					max = num;
					maxx = x;
					maxy = y;
				}

				map.get(x).put(y, num);

				// System.out.println(map);
				vec[i][j] = new Vec(x, y);
			}
		}
//
//		System.out.println(max);
//		System.out.println(maxx);
//		System.out.println(maxy);

		System.out.println(n - max);



	}

	public static class Vec {
		public int x;
		public int y;

		public Vec() {
			this.x = 0;

			this.y = 0;

		}
		public Vec(int x, int y) {
			this.x = x;

			this.y = y;

		}

		@Override
		public String toString() {
			return "Vec [x=" + x + ", y=" + y + "]";
		}

	}

}
