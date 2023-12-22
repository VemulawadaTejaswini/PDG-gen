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

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] P = nextIntArray(sc, N);
		ArrayList<Integer>[] edge = new ArrayList[N+1];
		for (int i = 0; i < M; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			add(edge, x, y);
			add(edge, y, x);
		}
		int[] revP = new int[N+1];
		for (int i = 0; i < N; i++) {
			revP[P[i]] = i;
		}

		int color = 0;
		int[] colors = new int[N];
		for (int i = 0; i < N; i++) {
			if (colors[i] == 0) {
				color++;
				fill(colors, color, i, edge);
			}
		}
		int count = 0;
		for (int i = 0; i < N; i++) {
			int color1 = colors[i];
			int color2 = colors[revP[i + 1]];
			if (color1 == color2) count++;
		}
		System.out.println(count);
	}

	static void add(ArrayList<Integer>[] edge, int src, int dst) {
		if (edge[src] == null) {
			edge[src] = new ArrayList<>();
		}
		edge[src].add(dst);
	}

	static void fill(int[] colors, int color, int index, ArrayList<Integer>[] edge) {
		if (colors[index] != 0) return;
		colors[index] = color;

		if (edge[index + 1] != null) {
			for (int next : edge[index+1]) {
				fill(colors, color, next - 1, edge);
			}
		}
	}
}
