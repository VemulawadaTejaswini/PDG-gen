
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			long[] a = new long[n];
			long[] b = new long[n];
			long[] c = new long[n];
			long count = 0;

			for (int i = 0; i < n; i++) {
				a[i] = sc.nextLong();
			}
			for (int i = 0; i < n; i++) {
				b[i] = sc.nextLong();
			}
			for (int i = 0; i < n; i++) {
				c[i] = sc.nextLong();
			}

			Arrays.sort(a);
			Arrays.sort(b);
			Arrays.sort(c);

			for (int i = 0; i < n; i++) {
				long aCount = 0;
				long cCount = 0;
				for (int j = 0; j < n; j++) {
					if (b[i] <= a[j]) {
						break;
					}
					aCount = j + 1;
				}
				for (int k = n - 1; 0 <= k; k--) {
					if (c[k] <= b[i]) {
						break;
					}
					cCount = n - k;
				}
				count += aCount * cCount;
			}
			System.out.println(count);
		}
	}
}
