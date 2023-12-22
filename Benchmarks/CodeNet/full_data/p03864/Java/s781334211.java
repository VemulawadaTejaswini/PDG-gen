import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int x = sc.nextInt();
		int[] a = new int[N];
		for (int i = 0; i < N; ++i) {
			a[i] = sc.nextInt();
		}
		int c = 0;
		for (int i = 1; i < N; ++i) {
			if (a[i] + a[i - 1] > x) {
				c += a[i] + a[i - 1] - x;
				a[i] -= a[i] + a[i - 1] - x;
				if (a[i] < 0) {
					a[i - 1] += a[i];
					a[i] = 0;
				}
			}
		}

		System.out.println(c);
	}

	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}
