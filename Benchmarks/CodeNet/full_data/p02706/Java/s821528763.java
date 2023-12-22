import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");

		int n = Integer.parseInt(str[0]);
		int k = Integer.parseInt(str[1]);

		str = br.readLine().split(" ");

		long sum = 0;
		for (int i = 0; i < k; i++) {
			int a = Integer.parseInt(str[i]);

			sum += a;
		}
		if (n < sum) {
			System.out.println("-1");
		} else {
			System.out.println(n - sum);
		}
	}
}