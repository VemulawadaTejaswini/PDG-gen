import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;

public class Main {
	static final long MOD=1000000007;//998244353;
	public static void main(String[] args) {
		PrintWriter out = new PrintWriter(System.out);
		InputReader sc=new InputReader(System.in);
		int N=sc.nextInt();
		long[] A=sc.nextLongArray(N);
		HashMap<Long, Long> hashMap=new HashMap<>();
		HashMap<Long, Long>[] hashMap2=new HashMap[N];
		for (int i = 0; i < hashMap2.length; i++) {
			hashMap2[i]=new HashMap<>();
		}
		for (int i = 0; i < A.length; i++) {
			hashMap2[i]=PrimeFactrization(A[i]);
			for (long l: hashMap2[i].keySet()) {
				if (hashMap.containsKey(l)) {
					hashMap.put(l, Math.max(hashMap.get(l), hashMap2[i].get(l)));
				}else {
					hashMap.put(l, hashMap2[i].get(l));
				}
			}
		}
		long ans=0;
		for (int i = 0; i < A.length; i++) {
			long B=1;
			for (long l: hashMap.keySet()) {
				if (hashMap2[i].containsKey(l)) {
					B*=modPow(l, hashMap.get(l)-hashMap2[i].get(l));
					B%=MOD;
				}else {
					B*=modPow(l, hashMap.get(l));
					B%=MOD;
				}
			}
			ans+=B;
			ans%=MOD;
		}
		System.out.println(ans);
	}
	static long modPow(long x, long y) {
        long z = 1;
        while (y > 0) {
            if (y % 2 == 0) {
                x = (x * x) % MOD;
                y /= 2;
            } else {
                z = (z * x) % MOD;
                y--;
            }
        }
        return z;
    }
	static HashMap<Long, Long> PrimeFactrization(long k){
		HashMap<Long, Long> hashMap=new HashMap<>();
		for (long i = 2; i*i <= k; i++) {
			long count=0;
			if (k%i!=0) {
				continue;
			}
			while (k%i==0) {
				count++;
				k/=i;
			}
			if (hashMap.containsKey(i)) {
				hashMap.put(i,count);
			}
			else {
				hashMap.put(i, count);
			}
		}
		if (k!=1&&!hashMap.containsKey(k)) {
			hashMap.put(k, 1L);
		}
		return hashMap;
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
