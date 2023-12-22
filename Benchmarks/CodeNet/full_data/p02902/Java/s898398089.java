import java.util.*;

@SuppressWarnings("unchecked")
public class Main {
	static class Node {
		int value;
		Node next;
	}

	public static void printArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ", ");
		}
		System.out.println();
	}

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
		ArrayList<Integer>[] edge = new ArrayList[N];
		for (int i = 0; i < M; i++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			append(edge, a, b);
		}
		int min = Integer.MAX_VALUE;
		int start = 0;
		for (int i = 0; i < N; i++) {
			int m = minLoop(i, edge);
			// System.out.println("min = " + m);
			if (m < min) {
				min = m;
				start = i;
			}
		}
		if (min == Integer.MAX_VALUE) {
			System.out.println(-1);
			return;
		}
		int[] prev = new int[N];
		Arrays.fill(prev, -1);
		Queue<Integer> q = new ArrayDeque<>();
		q.add(start);
		while (q.size() > 0 && prev[start] == -1) {
			int val = q.poll();
			if (edge[val] != null) {
				for (int next : edge[val]) {
					if (prev[next] == -1) {
						prev[next] = val;
						q.add(next);
					}
				}
			}
		}
		// System.out.println("start = " + start);
		// printArray(prev);
		int pos = start;
		int[] routes = new int[min];
		for (int i = min - 1; i >= 0; i--) {
			int p = prev[pos];
			routes[i] = p;
			pos = p;
		}
		System.out.println(min);
		for (int x : routes) {
			System.out.println(x + 1);
		}
	}

	static int minLoop(int start, ArrayList<Integer>[] edge) {
		int[] depth = new int[edge.length];
		depth[start] = 1;
		Queue<Integer> q = new ArrayDeque<>();
		q.add(start);
		while (q.size() > 0) {
			int val = q.poll();
			if (edge[val] != null) {
				int d2 = depth[val] + 1;
				for (int next : edge[val]) {
					if (next == start) {
						return d2 - 1;
					}
					if (depth[next] == 0) {
						depth[next] = d2;
						q.add(next);	
					}
				}
			}
		}
		return Integer.MAX_VALUE;
	}

	static void append(ArrayList<Integer>[] edge, int a, int b) {
		if (edge[a] == null) {
			edge[a] = new ArrayList<>();
		}
		edge[a].add(b);
	}
}
