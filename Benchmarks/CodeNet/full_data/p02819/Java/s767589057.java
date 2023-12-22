import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int x = Integer.parseInt(br.readLine());

		for (int i = x; i < 1000000; i++) {
			if (isPrime(i)) {
				System.out.println(i);
				return;
			}
		}
	}

	static boolean isPrime(int n) {
		if (n == 1)
			return false;

		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}
}
