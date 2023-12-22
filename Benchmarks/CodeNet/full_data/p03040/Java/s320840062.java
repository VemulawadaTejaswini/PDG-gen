import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;
public class Main {
	static final long MOD=1000000007;//998244353;
	static int[] par;
	public static void main(String[] args) {
		PrintWriter out = new PrintWriter(System.out);
		InputReader sc=new InputReader(System.in);
		TreeSet<Pair> treeSet=new TreeSet<>();
		Pair median=null;
		HashMap<Long, Integer> hashMap=new HashMap<>();
		int Q=sc.nextInt();
		long sum=0;
		TreeSet<Pair> treeSet2=new TreeSet<>();
		for (int i = 0; i < Q; i++) {
			int X=sc.nextInt();
			if (X==1) {
				long a=sc.nextLong();
				long b=sc.nextLong();
				sum+=b;
				if (hashMap.containsKey(a)) {
					hashMap.put(a, hashMap.get(a)+1);
				}else {
					hashMap.put(a, 1);
				}
				Pair newPair=new Pair(hashMap.get(a), a);
				treeSet.add(newPair);
				if (median==null) {
					median=newPair;
					continue;
				}
				if (newPair.compareTo(median)<=0){
					sum-=newPair.y;
					if (treeSet.size()%2==0) {
						sum+=median.y;
						median=treeSet.lower(median);
					}else {
						sum+=median.y;
					}
				}else {
					sum+=newPair.y;
					if (treeSet.size()%2==0) {
						sum-=median.y;
					}else {
						median=treeSet.higher(median);
						sum-=median.y;
					}
				}
			}else {
				out.println(median.y+" "+sum);
			}
		}
		out.flush();
   	}
	static class Pair implements Comparable<Pair>{
    	public int x;
    	public long y;
    	public Pair(int x,long y) {
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
    		if (this.y>p.y) {
    			return 1;
    		}
    		else if (this.y<p.y) {
    			return -1;
    		}
    		else {
    			if (this.x>p.x) {
					return 1;
				}else if (this.x<p.x) {
					return -1;
				}else {
					return 0;
				}
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