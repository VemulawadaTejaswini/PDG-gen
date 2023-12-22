import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		String str[] = br.readLine().split(" ");
		long ans = 1;
		int c[] = new int[100100];
		c[0] = 3;

		for (int i = 0; i < n; i++) {
			int x = Integer.parseInt(str[i]);
			ans *= c[x] % 1000000007;
			c[x]--;
			c[x + 1]++;
		}

		System.out.println(ans % 1000000007);
	}
}
