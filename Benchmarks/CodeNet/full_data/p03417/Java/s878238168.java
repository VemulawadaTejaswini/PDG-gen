import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");

		int n = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);

		int ans = (n * m) - (n + (m - 1) + (n - 1) + (m - 2));
		if (ans < 0) {
			ans *= -1;
		}

		System.out.println(ans);
	}
}