import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;

public class Main {
	static final long MOD=1000000007;//998244353;
	static long ans;
	public static void main(String[] args) {
		PrintWriter out = new PrintWriter(System.out);
		InputReader sc=new InputReader(System.in);
		int N=sc.nextInt();
		int[] A=sc.nextIntArray(N);
		int[] B=sc.nextIntArray(N);
		int min=Integer.MAX_VALUE;
		outside:for (int i = 0; i < 1<<N; i++) {
			ArrayList<Pair> odd=new ArrayList<>();
			ArrayList<Pair> even=new ArrayList<>();
			for (int j = 0; j < N; j++) {
				if ((1&(i>>j))==1) {
					if (j%2==0) {
						odd.add(new Pair(B[j], j));
					}else {
						even.add(new Pair(B[j], j));
					}
				}else {
					if (j%2==0) {
						even.add(new Pair(A[j], j));
					}else {
						odd.add(new Pair(A[j], j));
					}
				}
			}
			if (even.size()!=odd.size()+(N%2)) {
				continue;
			}
			Collections.sort(odd);
			Collections.sort(even);
			int last=Integer.MIN_VALUE;
			int[] p=new int[N];
			for (int j = 0; j < N; j++) {
				int x=0;
				int y=0;
				if (j%2==1) {
					x=odd.get(j/2).x;
					y=odd.get(j/2).y;
				}else {
					x=even.get(j/2).x;
					y=even.get(j/2).y;
				}
				if (x<last) {
					continue outside;
				}
				p[j]=y;
				last=x;
			}
			int sum=0;
			for (int j = 0; j < N; j++) {
				for (int j2 = j+1; j2 < N; j2++) {
					if (p[j]>p[j2]) {
						sum++;
					}
				}
			}
			min=Math.min(min, sum);
		}
		if (min==Integer.MAX_VALUE) {
			min=-1;
		}
		System.out.println(min);
 	}
	static class Pair implements Comparable<Pair>{
    	public int x;
    	public int y;
    	public Pair(int x,int y) {
    		this.x=x;
    		this.y=y;
    	}
    	@Override
    	public boolean equals(Object obj) {
    		if(obj instanceof Pair) {
    			Pair other = (Pair) obj;
    			return other.x==this.x && other.y==this.y;
    		}
    		return false;
    	}//同値の定義
    	@Override
    	public int hashCode() {
    		return Objects.hash(this.x,this.y);
    	}//これ書かないと正しく動作しない（要　勉強）
    	@Override
    	public int compareTo( Pair p){
    		if (this.x>p.x) {
    			return 1;
    		}
    		else if (this.x<p.x) {
    			return -1;
    		}
    		else {
    			return 0;
    		}
    	}
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
