import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] l = new int[n];
		for (int i = 0; i < n; i++) {
			l[i] = sc.nextInt();
		}

		Arrays.sort(l);
		int count = 0;
		for (int i = 0; i < n - 2; i++) {
			for (int j = i + 1; j < n - 1; j++) {
				int ab = l[i] + l[j];
				int idx = lowerBound(l, ab);
				count += (idx - j - 1);
			}
		}

		System.out.println(count);
	}

	private static int lowerBound(int[] a, int x) {
		int l = 0;
		int r = a.length;
		while (r - l > 1) {
			int m = (l + r) / 2;
			if (a[m] < x) {
				l = m;
			} else {
				r = m;
			}
		}
		return r;
	}
}
