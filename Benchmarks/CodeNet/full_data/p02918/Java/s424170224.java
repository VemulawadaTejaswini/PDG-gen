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
		int K = sc.nextInt();
		char[] S = sc.next().toCharArray();

		int happy = 0;
		for (int i = 1; i < S.length; i++) {
			if (S[i-1] == S[i]) happy++;
		}
		int unhappy = S.length - 1 - happy;
		// System.out.println("unhappy = " + unhappy);
		int flip1 = Math.min(K, unhappy / 2) * 2;
		int flip2 = Math.min(K, (unhappy + 1) / 2) * 2 - 1;
		int flip = Math.max(flip1, flip2);

		System.out.println(happy + flip);
	}
}
