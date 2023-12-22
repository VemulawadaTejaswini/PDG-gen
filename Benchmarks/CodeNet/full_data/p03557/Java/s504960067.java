import java.util.*; 
import java.io.*;
 
public class Main {
	 static long lowerBound(int[] array, int key) {
		int start = -1;
		int end = array.length;
 
		while (end  > 1 + start) {
			int mid = (start + end) / 2;
			if (array[mid] < key) {
				start = mid;
			} else {
				end = mid;
			}
		}
 
		return start+1;
 
	}
	 static long upperBound(int[] array, int key) {
		int start = -1;
		int end = array.length;
 
		while (end > 1 + start) {
			int mid = (end + start) / 2;
			if (array[mid] > key) {
				end = mid;
			} else {
				start = mid;
			}
		}
 
		return end;
	}
	public static void main(String[] args) {
		InputReader in = new InputReader(System.in);
	    int n = in.readInt();
	    int a[] = new int[n]; 
	    int b[] = new int[n]; 
	    int c[] = new int[n]; 
	    
	    for(int i = 0; i<n; i++) a[i] = in.readInt();
	    for(int i = 0; i<n; i++) b[i] = in.readInt();
	    for(int i = 0; i<n; i++) c[i] = in.readInt();
	    
	    Arrays.sort(a);
	    Arrays.sort(c); 
	    long ans = 0; 
	    for(int i = 0; i<n; i++) {
	    	ans += (lowerBound(a,b[i])) * (n - upperBound(c,b[i])); 
	    }
	    System.out.println(ans); 
	}
}

class InputReader {

	private InputStream stream;
	private byte[] buf = new byte[1024];
	private int curChar;
	private int numChars;
	private SpaceCharFilter filter;

	public InputReader(InputStream stream) {
		this.stream = stream;
	}

	public int read() {
		if (numChars == -1)
			throw new InputMismatchException();
		if (curChar >= numChars) {
			curChar = 0;
			try {
				numChars = stream.read(buf);
			} catch (IOException e) {
				throw new InputMismatchException();
			}
			if (numChars <= 0)
				return -1;
		}
		return buf[curChar++];
	}

	public int readInt() {
		int c = read();
		while (isSpaceChar(c))
			c = read();
		int sgn = 1;
		if (c == '-') {
			sgn = -1;
			c = read();
		}
		int res = 0;
		do {
			if (c < '0' || c > '9')
				throw new InputMismatchException();
			res *= 10;
			res += c - '0';
			c = read();
		} while (!isSpaceChar(c));
		return res * sgn;
	}

	public String readString() {
		int c = read();
		while (isSpaceChar(c))
			c = read();
		StringBuilder res = new StringBuilder();
		do {
			res.appendCodePoint(c);
			c = read();
		} while (!isSpaceChar(c));
		return res.toString();
	}

	public long readLong() {
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
			if (c < '0' || c > '9') {
				throw new InputMismatchException();
			}
			res *= 10;
			res += c - '0';
			c = read();
		} while (!isSpaceChar(c));
		return res * sgn;
	}
	
	public boolean isSpaceChar(int c) {
		if (filter != null)
			return filter.isSpaceChar(c);
		return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
	}

	public String next() {
		return readString();
	}

	public interface SpaceCharFilter {
		public boolean isSpaceChar(int ch);
	}
}
