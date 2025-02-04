import java.util.*; 
import java.io.*;
 
public class Main {
	
	public static void solve(InputReader in) {
		int n = in.readInt();
		Queue<Long> q = new LinkedList<>();
		ArrayList<Long> list = new ArrayList<>(); 
		for(long i = 1; i<=9; i++) {
			q.add(i); 
			list.add(i);
		}
		 
		for(long i = 0; true; i++) {
		   long x = q.poll(); 
		   long y = 0;
		   if(x % 10 != 0) {
			   y = 10 * x + (x%10) -1;
			   q.add(y);
			   list.add(y); 
		   }
		   y = 10*x + (x%10);
		   q.add(y); 
		   list.add(y); 
		   
		   if(x % 10 != 9) {
			   y = 10*x + (x%10) + 1;
			   q.add(y);
			   list.add(y); 
		   }
		  
		   if(n <= q.size()) {
			   System.out.println(list.get(n-1)); 
			   return; 
		   }
		}
	}
	
	
    public static void main(String[] args) {
    	InputReader in = new InputReader(System.in); 
    	int t = 1;
    	while(t-- > 0) {
    		solve(in); 
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
