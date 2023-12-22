import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");

		int n = Integer.parseInt(str[0]);
		long k = Long.parseLong(str[1]);

		long a[] = new long[n];

		str = br.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			a[i] = Long.parseLong(str[i]);
		}

		long ans = 0;
		for (int i = 0; i < n; i++) {
			long migi = 0, zentai = 0;
			for (int j = i; j < n; j++)
				if (a[i] > a[j])
					migi++;
			for (int j = 0; j < n; j++)
				if (a[i] > a[j])
					zentai++;

			ans += migi * k % 1000000007;
			ans %= 1000000007;
			ans += (k - 1) * k / 2 % 1000000007 * zentai % 1000000007;
			ans %= 1000000007;
		}

		System.out.println(ans % 1000000007);
	}
}