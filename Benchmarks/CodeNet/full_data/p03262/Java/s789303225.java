import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int x = sc.nextInt();

		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = Math.abs(x - sc.nextInt());
		}
		sc.close();

		int ans = a[0];
		for (int i = 1; i < n; i++) {
			ans = gcd(a[i], ans);
		}
		System.out.println(ans);
	}
	public static int gcd(int x, int y) {
		if (y == 0) {
			return x;
		}

		return gcd(y, x%y);
	}
}