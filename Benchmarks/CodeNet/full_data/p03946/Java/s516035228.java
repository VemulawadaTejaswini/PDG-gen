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
		int T = sc.nextInt();
		int[] A = nextIntArray(sc, N);

		int min = Integer.MAX_VALUE;
		int maxDiff = 0;
		int cntMax = 0;
		for (int a : A) {
			if (a < min) {
				min = a;
				continue;
			}
			int diff = a - min;
			if (diff > maxDiff) {
				maxDiff = diff; 
				cntMax = 1;
				// System.out.println("reset");
				// System.out.println(a);
				continue;
			}
			if (diff == maxDiff) {
				// System.out.println(a);
				cntMax++;
			}
		}

		System.out.println(cntMax);
	}
}
