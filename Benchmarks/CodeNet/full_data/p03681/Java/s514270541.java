import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);

		if (Math.abs(n - m) >= 2) {
			System.out.println("0");
		} else if (Math.abs(n - m) == 1) {
			System.out.println((factorial(n) * factorial(m)) % 1000000007);
		} else {
			System.out.println((2 * factorial(n) * factorial(m)) % 1000000007);
		}
	}

	static long factorial(int n) {
		long a = 1;

		for (int i = 1; i <= n; i++) {
			a *= i;
			a %= 1000000007;
		}
		return a;
	}
}