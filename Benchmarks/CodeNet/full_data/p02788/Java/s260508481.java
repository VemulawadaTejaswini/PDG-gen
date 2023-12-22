import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		int n = sc.nextInt();
		long d = sc.nextLong();
		long a = sc.nextLong();
		Pair[] ps = new Pair[n];
		for(int i = 0; i < n; i++) {
			long x = sc.nextLong();
			long h = sc.nextLong();
			ps[i] = new Pair(x, h);
		}
		Arrays.sort(ps);
		long res = 0;
		long count = 0;
		LinkedList<Pair> pos = new LinkedList<Pair>();
		for(int i = 0; i < n; i++) {
			long x = ps[i].a;
			while(!pos.isEmpty() && pos.peekFirst().a < x) {
				count -= pos.peekFirst().b;
				pos.removeFirst();
			}
			long rem = ps[i].b - count * a;
			long dif = (rem+a-1) / a;
			res += dif;
			count += dif;
			pos.add(new Pair(x + 2*d, dif));
		}
		System.out.println(res);
	}
	static class Pair implements Comparable<Pair>{
		long a, b;
		public Pair(long a, long b) {
			this.a = a; this.b = b;
		}
		@Override
		public int compareTo(Pair p) {
			return a < p.a ? -1: a == p.a? 0: 1;
		}
	}
	
	static class FastScanner {
		public BufferedReader reader;
		public StringTokenizer tokenizer;
		public FastScanner() {
			reader = new BufferedReader(new InputStreamReader(System.in), 32768);
			tokenizer = null;
		}
		public String next() {
			while (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					tokenizer = new StringTokenizer(reader.readLine());
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
		public double nextDouble() {
			return Double.parseDouble(next());
		}
		public String nextLine() {
			try {
				return reader.readLine();
			} catch(IOException e) {
				throw new RuntimeException(e);
			}
		}
	}

}
