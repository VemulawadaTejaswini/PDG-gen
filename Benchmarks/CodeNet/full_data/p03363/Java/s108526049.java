import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		String str[] = br.readLine().split(" ");

		long a[] = new long[n];

		for (int i = 0; i < n; i++) {
			a[i] = Long.parseLong(str[i]);
		}

		long ans = 0;

		for (int left = 0; left < n; ++left) {
			long sum = 0;
			int right = left;

			while (right < n) {
				sum += a[right];
				if (sum == 0)
					ans++;
				++right;
			}
		}

		System.out.println(ans);
	}
}