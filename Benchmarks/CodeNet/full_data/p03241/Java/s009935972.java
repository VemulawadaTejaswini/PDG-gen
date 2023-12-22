import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");

		int n = Integer.parseInt(str[0]);
		long m = Long.parseLong(str[1]);

		ArrayList<Long> list = divisor(m);

		long max = 0;
		for (long l : list) {
			if (n * l <= m) {
				if (max < l) {
					max = l;
				}
			}
		}

		System.out.println(max);
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
