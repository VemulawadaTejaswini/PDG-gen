import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		long c[] = new long[n];

		String str[] = br.readLine().split(" ");

		for (int i = 0; i < n; i++) {
			long a = Long.parseLong(str[i]);
			c[i] = a - (i + 1);
		}

		Arrays.sort(c);
		long b = c[n / 2];

		long ans = 0;

		for (int i = 0; i < n; i++) {
			ans += Math.max(b - c[i], -b + c[i]);
		}

		System.out.println(ans);
	}

}