import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	static long X;
	
	public static void main(String[] args) throws IOException {
		MyScanner sc = new MyScanner();
		PrintWriter out = new PrintWriter(System.out);
		int N = sc.nextInt();
		X = sc.nextInt();
		List<Exam> all = new ArrayList<>(N);
		long target = 0;
		for (int i = 0; i < N; i++) {
			long tmpb = sc.nextInt();
			long tmpl = sc.nextInt();
			long tmpu = sc.nextInt();
			all.add(new Exam(tmpb, tmpl, tmpu));
			target += tmpb * tmpl;
		}
		Collections.sort(all);
		long[] acums = new long[N+1];
		for (int i = 1; i <= N; i++) {
			acums[i] = acums[i-1] + all.get(i-1).tot;
		}
		long left = -1, right = X * N;
		while (left + 1 < right) {
			long med = (left + right) / 2;
			long complete = med / X;
			long got = acums[(int)complete];
			long rem = med % X;
			long best = got;
			if (rem > 0) {
				long extra = all.get((int)complete).tot;
				long real;
				for (int i = 0; i < N; i++) {
					Exam cur = all.get(i);
					real = got + cur.getVal(rem);
					if (i < complete) real += extra - cur.tot;
					best = Math.max(best, real);
				}
			}
			if (best >= target) right = med;
			else left = med;
		}
		out.println(right);
		
		out.flush();
	}
	
	static class Exam implements Comparable<Exam> {
		long b, l, u, tot;
		
		public Exam(long b, long l, long u) {
			this.b = b;
			this.l = l;
			this.u = u;
			tot = b * l + (X - b) * u;
		}
		
		public long getVal(long hours) {
			long ret = hours * l;
			if (hours > b) {
				ret += (hours - b) * (u - l);
			}
			return ret;
		}
		
		@Override
		public int compareTo(Exam o) {
			return Long.compare(o.tot, tot);
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
