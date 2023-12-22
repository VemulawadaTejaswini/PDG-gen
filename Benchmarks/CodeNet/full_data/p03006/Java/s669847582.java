import java.util.*;

public class Main {
	// public static void printArray(int[] a) {
	// 	for (int i = 0; i < a.length; i++) {
	// 		System.out.print(a[i] + ", ");
	// 	}
	// 	System.out.println();
	// }

	public static<T> void printArrayT(T[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ", ");
		}
		System.out.println();
	}

	public static class Tuple implements Comparable<Tuple> {
		public int X, Y;
		Tuple(int X, int Y) {
			this.X = X;
			this.Y = Y;
		}

		@Override
		public String toString() {
			return String.format("(%d, %d)", X, Y);
		}

		@Override
		public int compareTo(Tuple o) {
			int a = this.X - o.X;
			if (a != 0) return a;
			int b = this.Y - o.Y;
			return b;
		}
	}

	static int count(int N, int[] x, int[] y, long flag, HashMap<Long, Integer> cache) {
		if (flag == (1 << N ) - 1) {
			return 0;
		}
		if (cache.containsKey(flag)) {
			return cache.get(flag);
		}
		boolean any = false;
		int min = N;
		for (int i = 0; i < N; i++) {
			long flagI = 1 << i;
			if ((flag & flagI) != 0) continue;
			for (int j = i + 1; j < N; j++) {
				long flagJ = 1 << j;
				if ((flag & flagJ) != 0) continue;

				any = true;
				int dx = x[i] - x[j];
				int dy = y[i] - y[j];

				long copy = flag | flagI | flagJ;

				for (int k = j + 1; k < N; k++) {
					int flagK = 1 << k;
					if ((flag & flagK) != 0) continue;
					int dx2 = x[k] - x[j];
					int dy2 = y[k] - y[j];
					if (dx * dy2 == dy * dx2) {
						copy |= flagK;
					}
				}
				min = Math.min(min, count(N, x, y, copy, cache));
			}
		}
		int ans;
		if (any) {
			ans = min + 1;
		} else {
			ans = 1;
		}
		cache.put(flag, ans);
		return ans;
	}

	static int solve(int N, Tuple[] xy) {
		int result = 0;
		int rest = N;

		long end = (1 << N) - 1;
		long flag = 0;
		while (rest > 0) {
			int max = 0;
			long maxFlag = 0;

			for (int i = 0; i < N; i++) {
				long flagI = 1 << i;
				if ((flag & flagI) != 0) continue;
				for (int j = i + 1; j < N; j++) {
					long flagJ = 1 << j;
					if ((flag & flagJ) != 0) continue;

					long p = ((long)xy[j].X) - ((long)xy[i].X);
					long q = ((long)xy[j].Y) - ((long)xy[i].Y);

					int cnt = 0;
					long copy = flagI | flagJ;
					long nextX = ((long)xy[j].X) + p;
					long nextY = ((long)xy[j].Y) + q;

					for (int k = j + 1; k < N; k++) {
						if (xy[k].X < nextX) continue;
						if (xy[k].X > nextX) break;
						long flagK = 1 << k;
						if ((flag & flagK) != 0) continue;
						if (xy[k].Y == nextY) {
							copy |= flagK;
							cnt++;
							nextX += p;
							nextY += q;
						}
					}
					if (max < cnt) {
						max = cnt;
						maxFlag = copy;
					}
				}
			}
			if (max > 0) {
				flag |= maxFlag;
				result += 1;
				rest -= (max + 2);
			} else {
				return result + (rest + 1) / 2;
			}
		}
		return result;
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Tuple[] xy = new Tuple[N];
		for (int i = 0; i < N; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			xy[i] = new Tuple(x, y);
		}
		Arrays.sort(xy);
		// printArrayT(xy);
		// int result = count(N, x, y, 0, new HashMap<>());
		int result = solve(N, xy);
		System.out.println(result);
	}
}
