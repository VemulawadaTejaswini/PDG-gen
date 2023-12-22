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
		final int COMPRESS = 400;
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int W = sc.nextInt();

		int[] ws = new int[N];
		int[] vs = new int[N];
		for (int i = 0; i < N; i++) {
			ws[i] = sc.nextInt();
			vs[i] = sc.nextInt();
		}
		// System.out.println("XXX");

		int[] value = new int[(COMPRESS + 4) * N];
		
		int compress = 0;
		if (ws[0] > COMPRESS) {
			compress = ws[0] - COMPRESS;
		}
		for (int i = 0; i < N; i++) {
			int w = ws[i] - compress;
			int v = vs[i];
			// System.out.println("(" + w + ", " + v + ")");
			for (int j = value.length - 1; j >= w ; j--) {
				value[j] = Math.max(value[j], value[j-w] + v);
			}
		}
		if (compress == 0) {
			System.out.println(value[W]);
		} else {
			int a = W / ws[0];
			int b = W % ws[0];
			int c = ws[0] - compress;
			// System.out.println("(" + a + ", " + b + ")");
			int W2 = a * c + Math.min(b, c-1);
			System.out.println(value[W2]);
		}
	}
}
