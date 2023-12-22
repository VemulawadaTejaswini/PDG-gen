import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		Integer a[] = new Integer[n];
		String str[] = br.readLine().split(" ");

		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(str[i]);
		}

		Arrays.sort(a);

		int ans = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				int k = ~Arrays.binarySearch(a, a[i] + a[j], (x, y) -> x.compareTo(y) >= 0 ? 1 : -1);

				ans += Math.max(k - (j + 1), 0);
			}
		}

		System.out.println(ans);

	}

}