import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		solve(s);
		s.close();
	}

	public static void solve(Scanner sc) {
		int n = sc.nextInt();
		int[] p = new int[n];

		for (int i = 0; i < n; i++) {
			p[i] = sc.nextInt();
		}

		int[] a = new int[n];
		int[] b = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = i * n + 1;
			b[n - i - 1] = i * n + 1;
		}

		for (int i = 0; i < n; i++) {
			a[p[i] - 1] += i;
		}

		show(a);
		show(b);
	}

	private static void show(int[] a) {
		for (int i : a) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}