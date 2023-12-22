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

	public static class Triple implements Comparable<Triple> {
		public final int sum, pos;
		public final HashMap<Integer, Integer> visited;
		public final boolean inf;

		Triple(int A, int B, HashMap<Integer, Integer> C, boolean D) {
			this.sum = A;
			this.pos = B;
			this.visited = C;
			this.inf = D;
		}

		// @Override
		// public String toString() {
		// 	return String.format("(%d, %d, %d)", A, B, C);
		// }

		@Override
		public int compareTo(Triple o) {
			return this.sum - o.sum;
		}
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
		int P = sc.nextInt();
		HashMap<Integer, Integer>[] E = new HashMap[N + 1];
		for (int i = 0; i < M; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			int C = sc.nextInt();
			if (E[A] == null) {
				E[A] = new HashMap<Integer, Integer>();
			}
			E[A].put(B, C);
		}
		// sum, pos, visited, 
		PriorityQueue<Triple> q = new PriorityQueue<>();
		HashMap<Integer, Integer> h = new HashMap<>();
		h.put(1, 0);
		q.add(new Triple(0, 1, h, false));
		int max = Integer.MIN_VALUE;
		while (q.size() > 0) {
			Triple t = q.poll();
			int sum = t.sum;
			int node = t.pos;
			if (node == N) {
				max = Math.max(max, sum);
				if (t.inf) {
					System.out.println(-1);
					return;
				}
			}
			if (E[node] != null) {
				for (int nextNode : E[node].keySet()) {
					boolean inf = false;
					int coin = E[node].get(nextNode);

					int nextSum = sum + coin - P;
					if (t.visited.containsKey(nextNode)) {
						int prevSum = t.visited.get(nextNode);
						if (prevSum < nextSum && !t.inf) {
							// 無限ループ
							inf = true;
						} else {
							// ループすると減る
							continue;
						}
					}
					HashMap<Integer, Integer> copy = (HashMap<Integer, Integer>)t.visited.clone();
					copy.put(nextNode, nextSum);
					q.add(new Triple(nextSum, nextNode, copy, t.inf || inf));
				}
			}
		}

		System.out.println(Math.max(max, 0));
	}
}
