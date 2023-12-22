
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.StringTokenizer;

public class Main {
	public static void main(String args[]) {
		FastScanner sc = new FastScanner(System.in);

		Long N = sc.nextLong();
		Long P = sc.nextLong();

		Map<Long, Integer> map = new HashMap<Long, Integer>();

		if (N == 1) {
			System.out.println(P);
			return;
		}

		for (Long i = (long) 2; i <= P; i++) {

			if (P % i == 0) {

				P /= i;

				if (map.get(i) == null) {
					map.put(i, 1);
				} else {
					map.put(i, map.get(i) + 1);
				}

				i = (long) 1;
			}
		}

		Long result = (long) 1;
		for (Entry<Long, Integer> ent : map.entrySet()) {
			if (ent.getValue() >= N) {
				result = (long) (result * (Math.pow(ent.getKey(), (ent.getValue() / N))));
			}
		}

		System.out.println(result);
	}

	static class FastScanner {
		private BufferedReader reader = null;
		private StringTokenizer tokenizer = null;

		public FastScanner(InputStream in) {
			reader = new BufferedReader(new InputStreamReader(in));
			tokenizer = null;
		}

		public String next() {
			if (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					tokenizer = new StringTokenizer(reader.readLine());
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			return tokenizer.nextToken();
		}

		public long nextLong() {
			return Long.parseLong(next());
		}
	}
}