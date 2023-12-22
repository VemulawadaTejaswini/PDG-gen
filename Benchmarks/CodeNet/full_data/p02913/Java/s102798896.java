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
		char[] S = sc.next().toCharArray();
		int max = 0;
		for (int i = 0; i < S.length - 1; i++) {
			int[] lens = zalgo(S, i);
			for (int j = 1; j < lens.length; j++) {
				int v = Math.min(lens[j], j);
				if (v > max) {
					max = v;
				}
			}
		}
		System.out.println(max);
	}

	static int[] zalgo(char[] chars, int offset) {
		int n = chars.length - offset;
		int[] ret = new int[n];
		ret[0] = n;
		int i = 1, j = 0;
		while (i < n) {
			while (i + j < n && chars[j + offset] == chars[i + j + offset])
				++j;
			ret[i] = j;
			if (j == 0) {
				++i;
				continue;
			}
			int k = 1;
			while (i + k < n && k + ret[k] < j) {
				ret[i + k] = ret[k];
				++k;
			}
			i += k;
			j -= k;
		}
		return ret;
	}
}
