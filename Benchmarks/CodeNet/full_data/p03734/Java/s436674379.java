import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;
import java.util.Locale.FilteringMode;

 
public class Main {
	static final long MOD1=1000000007;
	static final long MOD2=998244353;
	public static void main(String[] args) {
		PrintWriter out = new PrintWriter(System.out);
		InputReader sc=new InputReader(System.in);
		int N=sc.nextInt();
		long W=sc.nextLong();
		long[] w=new long[N];
		long[] v=new long[N];
		for (int i = 0; i < v.length; i++) {
			w[i]=sc.nextLong();
			v[i]=sc.nextLong();
		}
		long max=0;
		ArrayList<Long>[] arrayLists=new ArrayList[4];
		for (int i = 0; i < arrayLists.length; i++) {
			arrayLists[i]=new ArrayList<>();
		}
		for (int i = 0; i < v.length; i++) {
			arrayLists[(int)(w[i]-w[0])].add(v[i]);
		}
		for (int i = 0; i < arrayLists.length; i++) {
			Collections.sort(arrayLists[i],Comparator.reverseOrder());
		}
		long[][] sum=new long[4][];
		for (int i = 0; i < 4; i++) {
			sum[i]=new long[arrayLists[i].size()+1];
			for (int j = 1; j < sum[i].length; j++) {
				sum[i][j]=sum[i][j-1]+arrayLists[i].get(j-1);
			}
		}
		for (int i = 0; i <= arrayLists[0].size(); i++) {
			for (int j = 0; j <= arrayLists[1].size(); j++) {
				for (int j2 = 0; j2 <= arrayLists[2].size(); j2++) {
					for (int k = 0; k <= arrayLists[3].size(); k++) {
						if ((long)i*w[0]+(long)j*(w[0]+1)+(long)j2*(w[0]+2)+(long)k*(w[0]+3)>W) {
							continue;
						}
						max=Math.max(max, sum[0][i]+sum[1][j]+sum[2][j2]+sum[3][k]);
					}
				}
			}
		}
		System.out.println(max);
	}
		static class InputReader { 
		private InputStream in;
		private byte[] buffer = new byte[1024];
		private int curbuf;
		private int lenbuf;
		public InputReader(InputStream in) {
			this.in = in;
			this.curbuf = this.lenbuf = 0;
		}
 
		public boolean hasNextByte() {
			if (curbuf >= lenbuf) {
				curbuf = 0;
				try {
					lenbuf = in.read(buffer);
				} catch (IOException e) {
					throw new InputMismatchException();
				}
				if (lenbuf <= 0)
					return false;
			}
			return true;
		}
 
		private int readByte() {
			if (hasNextByte())
				return buffer[curbuf++];
			else
				return -1;
		}
 
		private boolean isSpaceChar(int c) {
			return !(c >= 33 && c <= 126);
		}
 
		private void skip() {
			while (hasNextByte() && isSpaceChar(buffer[curbuf]))
				curbuf++;
		}
 
		public boolean hasNext() {
			skip();
			return hasNextByte();
		}
 
		public String next() {
			if (!hasNext())
				throw new NoSuchElementException();
			StringBuilder sb = new StringBuilder();
			int b = readByte();
			while (!isSpaceChar(b)) {
				sb.appendCodePoint(b);
				b = readByte();
			}
			return sb.toString();
		}
 
		public int nextInt() {
			if (!hasNext())
				throw new NoSuchElementException();
			int c = readByte();
			while (isSpaceChar(c))
				c = readByte();
			boolean minus = false;
			if (c == '-') {
				minus = true;
				c = readByte();
			}
			int res = 0;
			do {
				if (c < '0' || c > '9')
					throw new InputMismatchException();
				res = res * 10 + c - '0';
				c = readByte();
			} while (!isSpaceChar(c));
			return (minus) ? -res : res;
		}
 
		public long nextLong() {
			if (!hasNext())
				throw new NoSuchElementException();
			int c = readByte();
			while (isSpaceChar(c))
				c = readByte();
			boolean minus = false;
			if (c == '-') {
				minus = true;
				c = readByte();
			}
			long res = 0;
			do {
				if (c < '0' || c > '9')
					throw new InputMismatchException();
				res = res * 10 + c - '0';
				c = readByte();
			} while (!isSpaceChar(c));
			return (minus) ? -res : res;
		}
 
		public double nextDouble() {
			return Double.parseDouble(next());
		}
 
		public int[] nextIntArray(int n) {
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = nextInt();
			return a;
		}
 
		public long[] nextLongArray(int n) {
			long[] a = new long[n];
			for (int i = 0; i < n; i++)
				a[i] = nextLong();
			return a;
		}
 
		public char[][] nextCharMap(int n, int m) {
			char[][] map = new char[n][m];
			for (int i = 0; i < n; i++)
				map[i] = next().toCharArray();
			return map;
		}
	}
}
