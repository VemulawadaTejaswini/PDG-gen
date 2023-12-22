import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

public class Main {
	//FastScannerクラス、普通の Scannerクラスだとメモリと時間を大幅に喰らうので高速化する内部クラス。
	
	public static void main(String[]args) {
		FastScanner sc = new FastScanner(System.in);

		int N = Integer.valueOf(sc.next());
		int[]A = new int [N];
		for(int i = 0;i<N;i++)A[i] = Integer.valueOf(sc.next());
		
		long []s = new long[N+2];
		
		s[1] = s[0]+(long)Math.abs(A[0]-0);//1
		for(int i = 1;i<N;i++) {//Nー1
			s[i+1] = s[i]+(long)Math.abs(A[i]-A[i-1]);
		}
		s[N+1] = s[N]+(long)Math.abs(0-A[N-1]);
		
		for(int i = 0;i<N;i++) {
			long goukei = 0;
			goukei+=s[N+1]-s[i+2];
			//System.out.print(goukei);
			//System.out.print(" ");
			goukei+=s[i];
			//System.out.println(s[i]);
			
			if(i==0) goukei+=(long)Math.abs(A[i+1]);
			else if(i==N-1)goukei+=(long)Math.abs(A[i-1]);
			else goukei+=(long)Math.abs(A[i+1]-A[i-1]);
			
			System.out.println(goukei);
		}
	}
	
	static class FastScanner {
		 
		private final InputStream in;
		private final byte[] buffer = new byte[1024];
		private int ptr = 0;
		private int buflen = 0;
 
		public FastScanner(InputStream source) {
			in = source;
		}
 
		private boolean hasNextByte() {
			if (ptr < buflen) {
				return true;
			} else {
				ptr = 0;
				try {
					buflen = in.read(buffer);
				} catch (IOException e) {
					e.printStackTrace();
				}
				if (buflen <= 0) {
					return false;
				}
			}
			return true;
		}
 
		private int readByte() {
			if (hasNextByte()) return buffer[ptr++];
			else return -1;
		}
 
		private static boolean isPrintableChar(int c) {
			return 33 <= c && c <= 126;
		}
 
		private void skipUnprintable() {
			while (hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
		}
 
		public boolean hasNext() {
			skipUnprintable();
			return hasNextByte();
		}
 
		public String next() {
			if (!hasNext()) throw new NoSuchElementException();
			StringBuilder sb = new StringBuilder();
			int b = readByte();
			while (isPrintableChar(b)) {
				sb.appendCodePoint(b);
				b = readByte();
			}
			return sb.toString();
		}
 
		public long nextLong() {
			if (!hasNext()) throw new NoSuchElementException();
			long n = 0;
			boolean minus = false;
			int b = readByte();
			if (b == '-') {
				minus = true;
				b = readByte();
			}
			if (b < '0' || '9' < b) {
				throw new NumberFormatException();
			}
			while (true) {
				if ('0' <= b && b <= '9') {
					n *= 10;
					n += b - '0';
				} else if (b == -1 || !isPrintableChar(b)) {
					return minus ? -n : n;
				} else {
					throw new NumberFormatException();
				}
				b = readByte();
			}
		}
	}
}
