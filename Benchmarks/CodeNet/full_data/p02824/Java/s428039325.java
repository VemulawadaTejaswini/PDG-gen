import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		MyScanner sc = new MyScanner();
		PrintWriter out = new PrintWriter(System.out);
		int N = sc.nextInt();
		long M = sc.nextLong();
		long V = sc.nextLong();
		long P = sc.nextLong();
		List<Long> vals = new ArrayList<>(N);
		for (int i = 0; i < N; i++) {
			vals.add(sc.nextLong());
		}
		vals.sort(Collections.reverseOrder());
		long[] elems = new long[N];
		for (int i = 0; i < N; i++) {
			elems[i] = vals.get(i);
		}
		int left = 0, right = N;
		while (left + 1 < right) {
			int med = (left + right) / 2;
			long tot = M * (V - 1);
			long max = elems[med] + M;
			int idx = 0;
			boolean can = true;
			while (idx < P - 1 && tot > 0) {
				if (idx != med) {
					tot -= M;
				}
				idx++;
			}
			if (elems[idx] > max) can = false;
			while (idx < N && tot > 0 && can) {
				if (idx != med) {
					long dif = Math.min(M, max - elems[idx]);
					if (dif > 0) {
						tot -= dif;
					}
				}
				idx++;
			}
			if (tot <= 0 && can) {
				left = med;
			} else {
				right = med;
			}
		}
		
		out.println(left + 1);
		
		out.flush();
	}
	
	static class MyScanner {
		private BufferedReader br;
		private StringTokenizer tokenizer;
		
		public MyScanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}
		
		public String next() {
			while (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					tokenizer = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			return tokenizer.nextToken();
		}
		
		public int nextInt() {
			return Integer.parseInt(next());
		}
		
		public long nextLong() {
			return Long.parseLong(next());
		}
	}
}
