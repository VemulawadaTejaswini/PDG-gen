import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		InputReader in = new InputReader(System.in);
		int n = in.readInt(); 
		int m = in.readInt();
	    pair p[] = new pair[n]; 
	    for(int i = 0; i<n; i++) {
	    	int a = in.readInt();
	    	int b = in.readInt();
	    	p[i] = new pair(a,b);
	    }
	    Arrays.sort(p);
	    long sum = 0; 
	    for(pair i : p) {
	    	if(i.second >= m) {
	    		sum += m * i.first; 
	    		break; 
	    	}
	    	else {
	    		m -= i.second; 
	    		sum += i.second * i.first; 
	    	}
	    }
	    System.out.println(sum); 
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
class pair implements Comparable<pair> {
	int first;
	int second;

	pair(int first, int second) {
		this.first = first;
		this.second = second;
	}
    public int getFirst() {
    	return first; 
    }
    public int getSecond() {
    	return second; 
    }
	public String toString() {
		return first + " " + second;
	}

	public boolean equals(Object o) {
		return o instanceof pair && ((pair) o).first == first && ((pair) o).second == second;
	}

	public int compareTo(pair a) {
		return Integer.compare(first, a.first) ;
	}
}