import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		long n = Long.parseLong(br.readLine());

		long a[] = new long[5];

		long min = Long.MAX_VALUE;
		for (int i = 0; i < 5; i++) {
			a[i] = Long.parseLong(br.readLine());
			min = Math.min(min, a[i]);
		}

		long ans = (n + min - 1) / min;

		System.out.println(ans);

	}
}