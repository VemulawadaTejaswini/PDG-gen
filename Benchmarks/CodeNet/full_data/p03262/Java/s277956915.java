import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int s = sc.nextInt();
		int[] x = new int[n];
		for (int i = 0; i < n; i++) {
			x[i] = sc.nextInt() - s;
		}
		sc.close();

		int ans = 0;
		for (int i = 0; i < n; i++) {
			ans = gcd(ans, x[i]);
		}
		System.out.println(Math.abs(ans));
	}

	static int gcd(int a, int b) {
		return b == 0 ? a : gcd(b, a % b);
	}
}
