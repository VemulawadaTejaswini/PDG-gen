import java.io.*;
import java.util.*;



public class Main {
	
	static InputReader in = new InputReader(System.in);
	static PrintWriter out = new PrintWriter(System.out);

	static int MOD = 1000000007;
	static int M = 5005;
	static long oo = (long)1e16;
	
	static Long[] a, b, c;
	
	public static void main(String[] args) throws IOException {
		
		int x = in.nextInt();
		int y = in.nextInt();
		int z = in.nextInt();
		int K = in.nextInt();
		
		a = new Long[x];
		b = new Long[y];
		c = new Long[z];
		
		for(int i=0; i < x; ++i)
			a[i] = in.nextLong();
		
		for(int i=0; i < y; ++i)
			b[i] = in.nextLong();
		
		for(int i=0; i < z; ++i)
			c[i] = in.nextLong();
		
		Arrays.sort(a, Collections.reverseOrder());
		Arrays.sort(b, Collections.reverseOrder());
		Arrays.sort(c, Collections.reverseOrder());
		
		ArrayList<Long> v = new ArrayList<>(); 
		for(int i=0; i < x; ++i) {
			for(int j=0; j < y; ++j) {
				for(int k=0; k < z; ++k) {
					if((i+1) * (j+1) * (k+1) <= K) {
						v.add( a[i] + b[j] + c[k] );
					}
				}
			}
		}
		
		Collections.sort(v, Collections.reverseOrder());
		for(int i=0; i < K; ++i) {
			System.out.println(v.get(i));
		}
		
//		List<Triple> ans = new ArrayList<>();
//		PriorityQueue<Triple> pq = new PriorityQueue<>(Collections.reverseOrder());
//		pq.add(new Triple(x-1, y-1, z-1));
//		
//		Set<Triple> set = new HashSet<>();
//		
//		while(ans.size() < K && !pq.isEmpty() ) {
//			Triple t = pq.poll();
//			ans.add(t);
//			int i = t.first, j = t.second, k = t.third;
//			if(i >= 1) {
//				Triple nt = new Triple(i-1, j, k);
//				if(!set.contains(nt)) {
//					pq.add(nt);
//					set.add(nt);
//				}
//			}
//			if(j >= 1) {
//				Triple nt = new Triple(i, j-1, k);
//				if(!set.contains(nt)) {
//					pq.add(nt);
//					set.add(nt);
//				}
//			}
//			if(k >= 1) {
//				Triple nt = new Triple(i, j, k-1);
//				if(!set.contains(nt)) {
//					pq.add(nt);
//					set.add(nt);
//				}
//			}
//		}
//		
//		for(Triple t : ans) {
//			System.out.println(t.getSum());
//		}
		
		
		out.close();
	}
	
	static class Triple implements Comparable<Triple> {
		int first, second, third;

		public Triple(int first, int second, int third) {
			super();
			this.first = first;
			this.second = second;
			this.third = third;
		}

		@Override
		public int compareTo(Triple o) {
			return Long.signum( this.getSum() - o.getSum() ); 
		}
		
		public long getSum() {
			return (long)a[first] + b[second] + c[third];
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + first;
			result = prime * result + second;
			result = prime * result + third;
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Triple other = (Triple) obj;
			if (first != other.first)
				return false;
			if (second != other.second)
				return false;
			if (third != other.third)
				return false;
			return true;
		}
	}
	
	
	static void shuffle(int[] a) {
		Random r = new Random();
		for(int i = a.length - 1; i > 0; --i) {
			int si = r.nextInt(i);
			int t = a[si];
			a[si] = a[i];
			a[i] = t;
		}
	}
	
	static int lower_bound(int[] a, int n, int k) {
		int s = 0;
		int e = n;
		int m;
		while (e - s > 0) {
			m = (s + e) / 2;
			if (a[m] < k)
				s = m + 1;
			else
				e = m;
		}
		return e;
	}
	
	static int gcd(int a, int b) {
		return b == 0 ? a : gcd(b, a % b);
	}
	
	static class Pair implements Comparable<Pair> {
		int first, second;

		public Pair(int first, int second) {
			super();
			this.first = first;
			this.second = second;
		}

		@Override
		public int compareTo(Pair o) {
			return this.first != o.first ? this.first - o.first : this.second - o.second;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + first;
			result = prime * result + second;
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Pair other = (Pair) obj;
			if (first != other.first)
				return false;
			if (second != other.second)
				return false;
			return true;
		}
	}
	
	
}



class InputReader {

	private final InputStream stream;
	private final byte[] buf = new byte[8192];
	private int curChar, snumChars;

	public InputReader(InputStream st) {
		this.stream = st;
	}

	public int read() {
		if (snumChars == -1)
			throw new InputMismatchException();
		if (curChar >= snumChars) {
			curChar = 0;
			try {
				snumChars = stream.read(buf);
			} catch (IOException e) {
				throw new InputMismatchException();
			}
			if (snumChars <= 0)
				return -1;
		}
		return buf[curChar++];
	}

	public int nextInt() {
		int c = read();
		while (isSpaceChar(c)) {
			c = read();
		}
		int sgn = 1;
		if (c == '-') {
			sgn = -1;
			c = read();
		}
		int res = 0;
		do {
			res *= 10;
			res += c - '0';
			c = read();
		} while (!isSpaceChar(c));
		return res * sgn;
	}

	public long nextLong() {
		int c = read();
		while (isSpaceChar(c)) {
			c = read();
		}
		int sgn = 1;
		if (c == '-') {
			sgn = -1;
			c = read();
		}
		long res = 0;
		do {
			res *= 10;
			res += c - '0';
			c = read();
		} while (!isSpaceChar(c));
		return res * sgn;
	}

	public int[] nextIntArray(int n) {
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = nextInt();
		}
		return a;
	}

	public String readString() {
		int c = read();
		while (isSpaceChar(c)) {
			c = read();
		}
		StringBuilder res = new StringBuilder();
		do {
			res.appendCodePoint(c);
			c = read();
		} while (!isSpaceChar(c));
		return res.toString();
	}

	public String nextLine() {
		int c = read();
		while (isSpaceChar(c))
			c = read();
		StringBuilder res = new StringBuilder();
		do {
			res.appendCodePoint(c);
			c = read();
		} while (!isEndOfLine(c));
		return res.toString();
	}

	public boolean isSpaceChar(int c) {
		return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
	}

	private boolean isEndOfLine(int c) {
		return c == '\n' || c == '\r' || c == -1;
	}

}