import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[1 << n];

		for (int i = 0; i < a.length; i++) a[i] = sc.nextInt();
		Arrays.sort(a);

		int[] b = new int[1 << n];
		b[b.length - 1] = a[a.length - 1];
		a[a.length - 1] = Integer.MAX_VALUE;

		for (int i = 1; i <= n; i++) {
			int x = (1 << n) - 1;
			for (int j = 0, k = (1 << n) - 1; j < 1 << (i - 1); j++, k--) {
				while (0 <= x && b[k] <= a[x]) {
					x--;
				}

				if (x == -1 && Arrays.stream(a).anyMatch((y) -> y != Integer.MAX_VALUE)) {
					System.out.println("NO");
					return;
				}
				b[j] = a[x];
				a[x] = Integer.MAX_VALUE;
			}
			Arrays.sort(b);
		}

		System.out.println("YES");
	}
}