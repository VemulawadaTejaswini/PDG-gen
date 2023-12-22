import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");

		int n = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);

		str = br.readLine().split(" ");
		int a[] = new int[n];

		int sum = 0;

		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(str[i]);
			sum += a[i];
		}

		double m4 = (double) 1 / (4 * m);
		int ans = 0;

		for (int i = 0; i < n; i++) {
			double x = (double) a[i] / sum;
			if (x >= m4) {
				ans++;
			}
			if (ans >= m) {
				System.out.println("Yes");
				return;
			}
		}
		System.out.println("No");
	}
}
