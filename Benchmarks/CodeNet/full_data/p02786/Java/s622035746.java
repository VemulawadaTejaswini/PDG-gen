import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	static long n;

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		n = Long.parseLong(br.readLine());

		for (long i = 1;; i++) {
			long a = (long) Math.pow(2, i);

			if (n < a) {
				System.out.println((long) Math.pow(2, i) - 1);
				return;
			}
		}
	}
}
