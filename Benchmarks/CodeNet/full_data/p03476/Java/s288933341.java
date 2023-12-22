import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {
			String str[] = br.readLine().split(" ");
			int l = Integer.parseInt(str[0]);
			int r = Integer.parseInt(str[1]);

			int ans = 0;
			for (int j = l; j <= r; j++) {
				if (j % 2 != 0) {
					if (isPrime(j) && isPrime((j + 1) / 2)) {
						ans++;
					}
				}
			}

			System.out.println(ans);
		}

	}

	static boolean isPrime(int n) {
		if (n == 1) {
			return false;
		}

		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}
}