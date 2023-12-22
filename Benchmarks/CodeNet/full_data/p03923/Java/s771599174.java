import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		FS r = new FS();
		long N = r.nextLong();
		long A = r.nextLong();
		solver(N,A);
	}
	
	// public static void solver(long N, long A) {
	// 	long minTime = N;
	// 	long speed = A+1;
	// 	long eatCount = 1;
	// 	while(true) {
	// 		long afterTime = N/speed;
	// 		if(speed*afterTime<N) afterTime++;
	// 		minTime = (long)Math.min(eatCount*(A*2+1)+afterTime, minTime);
	// 		speed *= (A+1);
	// 		eatCount++;
	// 		if(N < speed) break;
	// 	}
	// 	System.out.println(minTime);
	// }
	public static void solver(long N, long A) {
		long minTime = N;
		for(long i=2; i<=(int)Math.min(N, 10000); i++) {
			long speed = i;
			long eatCount = 1;
			while(true) {
				long afterTime = N/speed;
				if(speed*afterTime<N) afterTime++;
				minTime = (long)Math.min(eatCount*(A+i)+afterTime, minTime);
				speed *= i;
				eatCount++;
				if(N*i < speed || speed <= 0) break;
			}
		}
		System.out.println(minTime);
	}
	
	// Read Class
	static class FS {
		private final InputStream in = System.in;
		private final byte[] buffer = new byte[1024];
		private int ptr = 0;
		private int buflen = 0;
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
	
		private int readByte() { return hasNextByte() ? buffer[ptr++] : -1;}
		private boolean isPrintableChar(int c) {return 33 <= c && c <= 126;}
		private void skipUnprintable() {while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;}
	
		public boolean hasNext() { skipUnprintable(); return hasNextByte();}
		public String next() {
			if (!hasNext()) throw new NoSuchElementException();
			StringBuilder sb = new StringBuilder();
			int b = readByte();
			while(isPrintableChar(b)) {
				sb.appendCodePoint(b);
				b = readByte();
			}
			return sb.toString();
		}
		public int nextInt() {
			return (int)nextLong();
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
			while(true) {
				if ('0' <= b && b <= '9') {
					n *= 10;
					n += b - '0';
				} else if(b == -1 || !isPrintableChar(b)) {
					return minus ? -n : n;
				} else {
					throw new NumberFormatException();
				}
				b = readByte();
			}
		}
	}
}