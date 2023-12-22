import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		String s = r.readLine();

		long cnt = 0;
		BigInteger base = BigInteger.valueOf(2019);
		for (int i = 0; i < s.length() - 4; ++i) {
			boolean flag = false;
			for (int j = i + 5; j <= s.length(); ++j) {
				String p = s.substring(i, j);
				int sum = 0;
				for (int x = 0; x < p.length(); ++x) {
					sum += p.charAt(x);
				}
				if (sum % 3 != 0) {
					continue;
				}

				BigInteger d = new BigInteger(p);
				if (d.remainder(base) == BigInteger.ZERO) {
					++cnt;
					flag = true;
				}
			}
			if(flag) {
				continue;
			}
		}

		System.out.println(cnt);

		r.close();
	}
}