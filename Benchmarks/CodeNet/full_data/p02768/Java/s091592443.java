import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();

		int nm = 1000000007;
		int pat = 0;

		for (int i = 1; i < n + 1; i++) {
			if (i == a || i == b) {
				continue;
			}
			pat = pat + div(n, i, i, n / i);
		}

		System.out.println(pat % nm);
	}

	private static int div(int n, int u, int i, int w) {
		if (i != 1) {
			return div(n - 1, u - 1, --i, n * (n - 1) / u * (u - 1));
		}
		return w;
	}

}