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

	static void reverseArray(int[] array) {
		for (int i = 0; i < array.length / 2; i++) {
			int tmp = array[i];
			array[i] = array[array.length - 1 - i];
			array[array.length - 1 - i] = tmp;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] S = nextIntArray(sc, 1 << N);
		Arrays.sort(S);
		TreeSet<Pair> set = new TreeSet<>();
		for (int i = 0; i < S.length - 1; i++) {
			set.add(new Pair(S[i], i));
		}
		assert set.size() == (1 << N) - 1;
		int[] oks = new int[1 << N];
		oks[0] = S[S.length - 1];

		boolean ok = true;
		outer: for (int i = 0; i < N; i++) {
			int lim = 1 << i;
			for (int j = 0; j < lim; j++) {
				int v = oks[j];
				// System.out.println("--" + v);
				Pair pop = set.lower(new Pair(v, 0));
				if (pop == null) {
					ok = false;
					break outer;
				}
				set.remove(pop);
				oks[j + lim] = pop.first;
			}
		}
		if (ok) {
			assert set.isEmpty();
		}

		System.out.println(ok ? "Yes" : "No");
	}
}
