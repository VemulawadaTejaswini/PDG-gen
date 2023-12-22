import java.util.*; 
import java.io.*;
 
public class Main {
	
	public static void main(String[] args) {
		InputReader in = new InputReader(System.in);
	     int t = 1;
	     while(t-- > 0) {
	    	 char s[] = in.readString().toCharArray(); 
	    	 if((s[0] - '0') + (s[1] - '0') + (s[2] - '0') + (s[3] - '0') == 7)
	    		 System.out.println(s[0]+ "+" + s[1]+"+"+s[2]+"+"+s[3]+"="+'7'); 
	    	 else if((s[0] - '0') + (s[1] - '0') + (s[2] - '0') - (s[3] - '0') == 7)
	    		 System.out.println(s[0]+ "+" + s[1]+"+"+s[2]+"-"+s[3]+"="+'7');
	    	 else if((s[0] - '0') + (s[1] - '0') - (s[2] - '0') + (s[3] - '0') == 7)
	    		 System.out.println(s[0]+ "+" + s[1]+"-"+s[2]+"+"+s[3]+"="+'7');
	    	 else if((s[0] - '0') + (s[1] - '0') - (s[2] - '0') - (s[3] - '0') == 7)
	    		 System.out.println(s[0]+ "+" + s[1]+"-"+s[2]+"-"+s[3]+"="+'7');
	    	 else if((s[0] - '0') - (s[1] - '0') + (s[2] - '0') + (s[3] - '0') == 7)
	    		 System.out.println(s[0]+ "-" + s[1]+"+"+s[2]+"+"+s[3]+"="+'7');
	    	 else if((s[0] - '0') - (s[1] - '0') + (s[2] - '0') - (s[3] - '0') == 7)
	    		 System.out.println(s[0]+ "-" + s[1]+"+"+s[2]+"-"+s[3]+"="+'7');
	    	 else if((s[0] - '0') - (s[1] - '0') - (s[2] - '0') + (s[3] - '0') == 7)
	    		 System.out.println(s[0]+ "-" + s[1]+"-"+s[2]+"+"+s[3]+"="+'7');
	    	 else if((s[0] - '0') - (s[1] - '0') - (s[2] - '0') - (s[3] - '0') == 7)
	    		 System.out.println(s[0]+ "-" + s[1]+"-"+s[2]+"-"+s[3]+"="+'7');
	     }
	}
}

class InputReader{
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
