import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		while (in.hasNext()) {
			int N = in.nextInt();
			int[] L = new int[N];

			for (int i = 0; i < L.length; ++i) {
				L[i] = in.nextInt();
			}

			Arrays.sort(L);

			int count = 0;
			for (int i = 0; i < L.length; ++i) {
				for (int j = i + 1; j < L.length; ++j) {
					int sum = L[i] + L[j];

					int k = lowerBound(L, 0, L.length, sum);
					k = Math.max(k, -(k + 1));
					
				    count += Math.max(0, k - j - 1);
					
					//System.err.println(k);
				}
			}

			System.out.println(count);
		}
	}

	private static int lowerBound(int[] a, int fromIdx, int toIdx, int key) {
		while (fromIdx < toIdx) {
			int mid = fromIdx + (toIdx - fromIdx) / 2;

			if (a[mid] < key) {
				fromIdx = mid + 1;
			} else { // key <= a[mid]
				toIdx = mid;
			}
		}

		if ( 0 <= fromIdx && fromIdx < a.length && a[fromIdx] == key) {
			return fromIdx;
		} else {
			return -fromIdx - 1;
		}
	}

}
