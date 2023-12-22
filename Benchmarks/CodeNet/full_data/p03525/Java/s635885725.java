import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;

 
public class Main {
	static final long MOD1=1000000007;
	static final long MOD2=998244353;
	public static void main(String[] args) {
		PrintWriter out = new PrintWriter(System.out);
		InputReader sc=new InputReader(System.in);
		int N=sc.nextInt();
		int[] D=sc.nextIntArray(N);
		int[] c=new int[13];
		for (int i = 0; i < D.length; i++) {
			c[D[i]]++;
		}
		int max=0;
		ArrayList<Integer> arrayList=new ArrayList<>();
		for (int i = 0; i < c.length; i++) {
			if (c[i]>=3) {
				System.out.println(0);
				return;
			}
			if (c[i]==2) {
				arrayList.add(24-i);
				arrayList.add(i);
			}
		}
		int m=Integer.MAX_VALUE;
		for (int i = 0; i < arrayList.size(); i++) {
			for (int j = i+1; j < arrayList.size(); j++) {
				int a=arrayList.get(i);
				int b=arrayList.get(j);
				m=Math.min(m, Math.min(Math.abs(a-b), 24-Math.abs(a-b)));
			}
		}
		for (int i = 0; i < 1<<13; i++) {
			int min=m;
			for (int j = 0; j < 13; j++) {
				if (c[j]==2||c[j]==0) {
					continue;
				}
				for (int j2 = j+1; j2 < 13; j2++) {
					if (c[j2]==2||c[j2]==0) {
						continue;
					}
					int a=0;
					int b=0;
					if (((i>>j)&1)==1) {
						a=24-j;
					}else {
						a=j;
					}
					if (((i>>j2)&1)==1) {
						b=24-j2;
					}else {
						b=j2;
					}
					min=Math.min(min, Math.min(Math.abs(a-b), 24-Math.abs(a-b)));
				}
			}
			if (min==Integer.MAX_VALUE) {
				continue;
			}
			max=Math.max(max, min);
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
