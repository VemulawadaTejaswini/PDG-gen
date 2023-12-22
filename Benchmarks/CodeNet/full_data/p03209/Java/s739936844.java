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

	static long solve(int N, long X) {
		long[] h = new long[N+1];
		long[] b = new long[N+1];
		h[0] = 1;
		b[0] = 1;
		for (int i = 0; i < N; i++) {
			h[i+1] = h[i] * 2 + 3;
			b[i+1] = b[i] * 2 + 1;
		}
		long count = 0;
		long x = X;
		for (int n = N; n > 0; n--) {
			if (x >= h[n]) {
				count += b[n];
				break;
			}
			long half = h[n-1] + 1;
			if (x >= half + 1) {// 真ん中のパテ以上
				x -= half + 1;
				count += b[n-1] + 1;
			} else {
				x -= 1; // 一番下のパテを除く
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long X = sc.nextLong();
		long ans = solve(N, X);
		System.out.println(ans);
	}
}
