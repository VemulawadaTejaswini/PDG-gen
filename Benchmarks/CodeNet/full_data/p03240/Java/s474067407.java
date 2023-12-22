import java.util.*;

@SuppressWarnings("unchecked")
public class Main {
	// public static void printArray(int[] a) {
	// 	for (int i = 0; i < a.length; i++) {
	// 		System.out.print(a[i] + ", ");
	// 	}
	// 	System.out.println();
	// }

	// public static<T> void printArrayT(T[] a) {
	// 	for (int i = 0; i < a.length; i++) {
	// 		System.out.print(a[i] + ", ");
	// 	}
	// 	System.out.println();
	// }

	public static String joinInt(int[] a, String separator) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < a.length; i++) {
			if (i > 0) {
				sb.append(separator);
			}
			sb.append(a[i]);
		}
		return sb.toString();		
	}

	static int[] nextIntArray(Scanner sc, int N) {
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		return arr;
	}

	static final int W = 101;

	static void fill(int x0, int y0, int h0, int[][] P) {
		for (int y = 0; y < W; y++) {
			int diffY = Math.abs(y - y0);
			for (int x = 0; x < W; x++) {
				int diffX = Math.abs(x - x0);
				int h = h0 + diffX + diffY;
				P[y][x] = h;
			}
		}
	}

	static void update(int x0, int y0, int h0, int[][] P) {
		if (h0 == 0) update2(x0, y0, P);
		for (int y = 0; y < W; y++) {
			int diffY = Math.abs(y - y0);
			for (int x = 0; x < W; x++) {
				int p = P[y][x];
				if (p != 0) {
					int diffX = Math.abs(x - x0);
					int h = h0 + diffX + diffY;
					if (p != h) {
						P[y][x] = 0;
					}
				}
			}
		}
	}
	static void update2(int x0, int y0, int[][] P) {
		for (int y = 0; y < W; y++) {
			int diffY = Math.abs(y - y0);
			for (int x = 0; x < W; x++) {
				int p = P[y][x];
				if (p != 0) {
					int diffX = Math.abs(x - x0);
					int maxH = diffX + diffY;
					if (p > maxH) {
						P[y][x] = 0;
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] X = new int[N];
		int[] Y = new int[N];
		int[] H = new int[N];
		for (int i = 0; i < N; i++) {
			X[i] = sc.nextInt();
			Y[i] = sc.nextInt();
			H[i] = sc.nextInt();
		}
		int[][] P = new int[W][W];
		for (int i = 1; i < N; i++) {
			if (H[i] != 0) {
				fill(X[0], Y[0], H[0], P);
				break;
			}
		}
		for (int i = 0; i < N; i++) {
			update(X[i], Y[i], H[i], P);
		}

		for (int y = 0; y < W; y++) {
			for (int x = 0; x < W; x++) {
				if (P[y][x] != 0) {
					System.out.printf("%d %d %d%n", x, y, P[y][x]);
					break;
				}
			}
		}
	}
}
