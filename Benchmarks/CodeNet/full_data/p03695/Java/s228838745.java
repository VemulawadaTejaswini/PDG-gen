import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		InputReader in = new InputReader(System.in);
		int arr[] = new int[8]; 
		int n = in.readInt(); 
		
		for(int i = 0; i<n; i++) {
			int x = in.readInt(); 
			if(x >= 1 && x <= 399) arr[0] += 1;
			else if(x <= 799 && x >= 400) arr[0] += 1;
			else if(x <= 1199 && x >= 800) arr[1] += 1;
			else if(x <= 1599 && x >= 1200) arr[2] += 1;
			else if(x <= 1999 && x >= 1600) arr[3] += 1;
			else if(x <= 2399 && x >= 2000) arr[4] += 1;
			else if(x <= 2799 && x >= 2400) arr[5] += 1;
			else if(x <= 3199 && x >= 2800) arr[6] += 1;
			else arr[7] += 1; 
		}
		
		int min = 0; 
		for(int i = 0; i<arr.length-1; i++) {
		   if(arr[i] != 0)
			 min++; 
		}
		int max = min + arr[7]; 
		if(min == 1) min = 2; 
		if(min == 0) min = 1; 
		
		System.out.println(min + " " + max); 
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
