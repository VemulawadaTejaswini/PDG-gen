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
		int M = sc.nextInt();
		int[] vals = new int[N];
		for (int i = 0; i < vals.length; i++) {
			vals[i] = sc.nextInt();
		}
		List<Pair> all = new ArrayList<>();
		for (int i = 0; i < M; i++) {
			all.add(new Pair(sc.nextInt(), sc.nextInt()));
		}
		Collections.sort(all, Collections.reverseOrder());
		Arrays.sort(vals);
		long ans = 0;
		int idx = 0, iPair = 0;
		while (idx < N && iPair < M) {
			Pair pair = all.get(iPair);
			if (pair.value > vals[idx]) {
				vals[idx] = pair.value;
				pair.cant--;
				if (pair.cant == 0) iPair++;
				idx++;
			} else break;
		}
		for (int i = 0; i < N; i++) {
			ans += vals[i];
		}
		
		out.println(ans);
		
		out.flush();
	}
	
	static class Pair implements Comparable<Pair> {
		int value, cant;
		
		public Pair(int cant, int value) {
			this.value = value;
			this.cant = cant;
		}
		
		@Override
		public int compareTo(Pair o) {
			return Integer.compare(value, o.value);
		}
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
