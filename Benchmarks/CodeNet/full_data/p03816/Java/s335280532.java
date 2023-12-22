import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		int ans = 1;
		for (int i = 0; i < n - 1; i++) {
			if (a[i] != a[i + 1]) {
				ans++;
			}

		}


		int x[] = new int[n];
		Renzoku(a, x);

		for (int i = 0; i < n; i++) {
			if (x[i] != 0) {
				x[i] = (x[i] + 1) % 2;
			}

		}
		if (sum(x) % 2 == 0) {

	System.out.println(ans);
		} else {
System.out.println(ans-1);
		}
	}

	public static int Renzoku(int c[], int x[]) {

		int mode = 0;
		int val = 0;

		for (int i = 0; i <= c.length - 2; i++) {
			if ((c[i] == c[i + 1]) && i != c.length - 2) {
				val++;
			} else {
				if ((c[i] == c[i + 1]) && i == c.length - 2) {
					val++;
				}
				val++;
				x[mode] = val;
				mode++;

				if ((c[i] != c[i + 1]) && i == c.length - 2) {
					x[mode] = 1;
					mode++;
				}

				val = 0;
			}

		}
		return mode;

	}

	static int sum(int a[]) {
		int n = a.length;
		int ans = 0;
		for (int i = 0; i <= n - 1; i++) {
			ans += a[i];
		}
		return ans;
	}

}