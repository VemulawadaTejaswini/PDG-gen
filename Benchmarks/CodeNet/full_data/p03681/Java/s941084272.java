
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static long p(int n) throws IOException {
		long ans = 1;
		for (int i = 0; i < n; i++) {
			ans *= i + 1;
			ans %= 1000000007;
		}
		return ans;
	}

	public static void solve() throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.close();
		if (Math.abs(n - m) == 0) {
			long pn = p(n);
			long pm = p(m);
			long ans = 2 * pn * pm;
			ans %= 1000000007;
			System.out.println((int) ans);
		} else if (Math.abs(n - m) == 1) {
			long pn = p(n);
			long pm = p(m);
			long ans = pn * pm;
			ans %= 1000000007;
			System.out.println((int) ans);
		} else {
			System.out.println(0);
		}
	}

	public static void main(String[] args) {
		try {
			solve();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
