import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Map;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		long n = Long.parseLong(br.readLine());

		ArrayList<Long> list = divisor(n);

		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < list.size(); i += 2) {
			long a = 0;
			long b = 0;
			if (i == list.size() - 1) {
				a = list.get(i);
				b = list.get(i);
			} else {
				a = list.get(i);
				b = list.get(i + 1);
			}

			String A = String.valueOf(a);
			String B = String.valueOf(b);

			int max = Math.max(A.length(), B.length());

			ans = Math.min(ans, max);
		}

		System.out.println(ans);
	}

	public static final ArrayList<Long> divisor(final long n) {
		final ArrayList<Long> list = new ArrayList<>();

		for (long i = 1; i * i <= n; i++) { // √n
			if (n % i == 0) {
				list.add(i); // a x b
				if (i != n / i) {
					list.add(n / i); // b x a (逆向き)
				}
			}
		}
		return list;
	}

}
