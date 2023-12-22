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

	static long sum(int[] P, int left, int right) {
		long sum = 0;
		for (int i = left; i < right; i++) {
			int max = P[i];
			int sec = 0;
			for (int j = i + 1; j <= right; j++) {
				if (max > P[j]) {
					if (P[j] > sec) {
						sec = P[j];
					}
				} else {
					sec = max;
					max = P[j];
				}
				sum += (long)sec;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] P = new int[N];
		int[] Q = new int[N + 1];
		for (int i = 0; i < N; i++) {
			int p = sc.nextInt();
			P[i] = p;
			Q[p] = i;
		}
		TreeSet<Integer> set = new TreeSet<>();
		set.add(-1);
		set.add(N);

		long sum = 0;
		for (int i = N; i > 0; i--) {
			int pos = Q[i];
			set.add(pos);
			int l1 = set.lower(pos);
			Integer l2 = set.lower(l1);
			int r1 = set.higher(pos);
			Integer r2 = set.higher(r1);
			int l1diff = pos - l1;
			int l2diff = l2 == null ? 0 : (l1 - l2);
			int r1diff = r1 - pos;
			int r2diff = r2 == null ? 0 : (r2 - r1);
			long pat = (long)l1diff * r2diff + (long)l2diff * r1diff;
			// System.out.println(pat + " * " + i);
			sum += pat * i;
		}
		// System.out.println(sum(P, 0, N - 1));
		System.out.println(sum);
	}
}
