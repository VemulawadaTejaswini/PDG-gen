import java.util.Arrays;
import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int x[] = new int[n];
		for (int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
		}

		int a[] = new int[n];
		int b[] = new int[n-1];

		for (int i = 0; i < n; i++) {
			System.arraycopy(x, 0, a, 0, a.length);
			for (int j = i; j < n - 1; j++) {
				a[j] = a[j + 1];
			}
			System.arraycopy(a, 0, b, 0, b.length);
			Arrays.sort(b);
			System.out.println(b[n/2 - 1]);
		}
	}
}