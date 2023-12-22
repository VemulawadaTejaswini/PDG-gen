import java.util.*;

@SuppressWarnings("unchecked")
public class Main {
	public static class Pair implements Comparable<Pair> {
		public final int first;
		public final int second;
	
		public Pair(int first, int second) {
			this.first = first;
			this.second = second;
		}
	
		@Override
		public int compareTo(Pair o) {
			int ord = Integer.compare(this.first, o.first);
			if (ord != 0) return ord;
			ord = Integer.compare(this.second, o.second);
			return ord;
		}
	}
	
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
		int[] A = new int[M];
		int[] C = new int[M];
		for (int i = 0; i < M; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			A[i] = a;
			int bits = 0;
			for (int j = 0; j < b; j++) {
				int c = sc.nextInt();
				bits |= 1 << (c - 1);
			}
			C[i] = bits;
		}
		// int[] cost = new int[(1 << N)];
		// for (int i = 0; i < M; i++) {
		// 	int price = A[i];
		// 	int bits = C[i];
		// 	cost[bits] = Math.min(cost[bits], price);
		// 	for (int j = 1; j < cost.length; j++) {
		// 		if (j == bits) continue;
		// 	}
		// }
		int ans = -1;
		int ALL = (1 << N) - 1;
		boolean[] visited = new boolean[1 << N];
		PriorityQueue<Pair> que = new PriorityQueue<Pair>();
		que.add(new Pair(0, 0));
		// System.err.println("start");
		while (que.size() > 0) {
			Pair p = que.poll();
			int price0 = p.first;
			int bits0 = p.second;
			if (visited[bits0]) continue;
			visited[bits0] = true;
			if (bits0 == ALL) {
				ans = price0;
				break;
			}
			for (int i = 0; i < M; i++) {
				int price1 = A[i];
				int bits1 = C[i];
				if (visited[bits0 | bits1]) continue;
				que.add(new Pair(price0 + price1, bits0 | bits1));
			}
		}
		System.out.println(ans);
	}
}
