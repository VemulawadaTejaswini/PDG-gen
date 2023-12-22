import java.util.*;
import java.io.*;

public class Main {
 
	public static void main(String[] args) {
		InputReader in = new InputReader(System.in);
	    int n = in.readInt();
	    char s[] = in.readString().toCharArray();
	    long r = 0, g = 0, b = 0; 
	    
	    for(int i = 0; i<n; i++) {
	    	if(s[i] == 'R') r++; 
	    	if(s[i] == 'G') g++; 
	    	if(s[i] == 'B') b++; 
	    }
	    long total = r*g*b; 
	    int ans = 0; 
	    int rgb = (int)'R' + (int)'G' + (int)'B'; 
	    for(int i = 0; i<n; i++) {
	    	for(int j = i+1; j<n; j++) {
	    		int k = 2*j - i; 
	    		if(k < n) 
	    			if((int)s[i] + (int)s[j] + (int)s[k] == rgb) 
	    				total--;  
	    	}
	    }
	    System.out.println(total); 
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
