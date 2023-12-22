import java.io.*;
import java.util.*;
 
public class Main {
    public static void main(String[] args) throws IOException {
        FastScanner sc = new FastScanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        
        int n = sc.nextInt();
      pw.println(n*(n-1)/2);
        
        pw.close();
    }
    static class FastScanner {
    	private InputStream stream;
    	private byte[] buf = new byte[1024];
    	private int curChar;
    	private int numChars;
    	private FastScanner.SpaceCharFilter filter;
    	
    	public FastScanner(InputStream stream) {
    		this.stream = stream;
    	}
    	
    	public int read() {
    		if (numChars == -1) {
    			throw new InputMismatchException();
    		}
    		if (curChar >= numChars) {
    			curChar = 0;
    			try {
    				numChars = stream.read(buf);
    			} catch (IOException e) {
    				throw new InputMismatchException();
    			}
    			if (numChars <= 0) {
    				return -1;
    			}
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
    			if (c < '0' || c > '9') {
    				throw new InputMismatchException();
    			}
    			res *= 10;
    			res += c - '0';
    			c = read();
    		} while (!isSpaceChar(c));
    		return res * sgn;
    	}
    	
    	public String nextString() {
    		int c = read();
    		while (isSpaceChar(c)) {
    			c = read();
    		}
    		StringBuilder res = new StringBuilder();
    		do {
    			if (Character.isValidCodePoint(c)) {
    				res.appendCodePoint(c);
    			}
    			c = read();
    		} while (!isSpaceChar(c));
    			return res.toString();
    	}
    	
    	public boolean isSpaceChar(int c) {
    		if (filter != null) {
    			return filter.isSpaceChar(c);
    		}
    		return isWhitespace(c);
    	}
    	
    	public static boolean isWhitespace(int c) {
    		return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
    	}
    	
    	public int[] nextIntArray(int n) {
    		int[] array = new int[n];
    		for (int i = 0; i < n; ++i) array[i] = nextInt();
    		return array;
    	}
    	
    	public interface SpaceCharFilter {
    	public boolean isSpaceChar(int ch);
    	
    	}
    }
}