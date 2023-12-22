import java.util.*;

public class Main {
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

	// public static class Triple implements Comparable<Triple> {
	// 	public int A, B, C;
	// 	Triple(int A, int B, int C) {
	// 		this.A = A;
	// 		this.B = B;
	// 		this.C = C;
	// 	}

	// 	@Override
	// 	public String toString() {
	// 		return String.format("(%d, %d, %d)", A, B, C);
	// 	}

	// 	@Override
	// 	public int compareTo(Triple o) {
	// 		int a = this.A - o.A;
	// 		if (a != 0) return a;
	// 		int b = this.B - o.B;
	// 		if (b != 0) return b;
	// 		return this.C - o.C;
	// 	}
	// }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] arr = sc.next().toCharArray();
		int[] cnt = new int[arr.length];
		Arrays.fill(cnt, 1);
		// printArray(cnt);
		while (true) {
			boolean change = false;
			for (int i = 0; i < cnt.length; i++) {
				if (cnt[i] > 0) {
					if (arr[i] == 'R' && arr[i+1] == 'R') {
						cnt[i + 2] += cnt[i];
						cnt[i] = 0;
						change = true;
					}
					if (arr[i] == 'L' && arr[i-1] == 'L') {
						cnt[i - 2] += cnt[i];
						cnt[i] = 0;
						change = true;
					}
				}
			}
			// printArray(cnt);
			if (!change) {
				break;
			}
		}
		System.out.println(joinInt(cnt));
	}

	static String joinInt(int[] a) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < a.length; i++) {
			if (i > 0) {
				sb.append(' ');
			}
			sb.append(a[i]);
		}
		return sb.toString();		
	}
}
