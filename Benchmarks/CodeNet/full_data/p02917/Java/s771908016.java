import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int b[] = new int[n - 1];

		String str[] = br.readLine().split(" ");

		for (int i = 0; i < n - 1; i++) {
			b[i] = Integer.parseInt(str[i]);
		}

		long ans = b[0] + b[(n - 1) - 1];

		for (int i = 1; i < n - 1; i++) {
			ans += Math.min(b[i - 1], b[i]);
		}

		System.out.println(ans);
	}
}