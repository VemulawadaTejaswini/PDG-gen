import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		Long a[] = new Long[n];

		String str[] = br.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			a[i] = Long.parseLong(str[i]);
		}

		long ans = Long.MAX_VALUE;
		for (int i = 0; i <= 100; i++) {
			long cost = 0;

			for (int j = 0; j < n; j++) {
				cost += Math.pow(a[j] - i, 2);
			}
			ans = Math.min(ans, cost);
		}

		System.out.println(ans);
	}
}