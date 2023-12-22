import java.util.*;

@SuppressWarnings("unchecked")
public class Main {
	public static void printArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ", ");
		}
		System.out.println();
	}

	static class Node {
		Node prev;
		int value;
		public Node(int value, Node prev) {
			this.value = value;
			this.prev = prev;
		}
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
		int T = sc.nextInt();
		int[] A = new int[N];
		int[] B = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
			B[i] = sc.nextInt();
		}
		// System.out.println("start");

		int[] dp = new int[T];
		Node[] prev = new Node[T];
		for (int j = 0; j < N; j++) {
			final int a = A[j];
			final int b = B[j];
			for (int k = T - 1; k >= a; k--) {
				int add = dp[k-a] + b;
				if (dp[k] < add) {
					dp[k] = add;
					prev[k] = new Node(j, prev[k-a]);
				}
			}
		}
		// System.out.println("finish");
		// printArray(dp);
		HashSet<Integer> set = new HashSet<>();
		Node curr = prev[T-1];
		while (curr != null) {
			set.add(curr.value);
			curr = curr.prev;
		}
		int max = 0;
		for (int i = 0; i < N; i++) {
			if (set.contains(i)) continue;
			max = Math.max(max, B[i]);
		}
		// System.out.println(dp[T-1] + ", " + max);
		int ans = dp[T-1] + max;
		System.out.println(ans);
	}
}
