import java.io.IOException;
import java.io.InputStream;
import java.util.InputMismatchException;

public class Main {
	public static void main(String[] args) {
		FastScannerA sc = new FastScannerA(System.in);
		
		int N = sc.nextInt();
		int[] arr = new int[100005];
		for(int i = 0; i<N; i++){
			int a = sc.nextInt();
			if(a>0) arr[a-1]++;
			arr[a]++;
			arr[a+1]++;
		}
		
		int max = 0;
		for(int i : arr) max = Math.max(max, i);
		System.out.println(max);
	}
}

class FastScannerA{
    private InputStream stream;
    private byte[] buf = new byte[1024];
    private int curChar;
    private int numChars;
    private SpaceCharFilter filter;

    public FastScannerA(InputStream stream)
    {
        this.stream = stream;
    }

    public int read()
    {
        if (numChars == -1)
            throw new InputMismatchException();
        if (curChar >= numChars)
        {
            curChar = 0;
            try
            {
                numChars = stream.read(buf);
            } catch (IOException e)
            {
                throw new InputMismatchException();
            }
            if (numChars <= 0)
                return -1;
        }
        return buf[curChar++];
    }

    public int nextInt()
    {
        int c = read();
        while (isSpaceChar(c))
            c = read();
        int sgn = 1;
        if (c == '-')
        {
            sgn = -1;
            c = read();
        }
        int res = 0;
        do
        {
            if (c < '0' || c > '9')
                throw new InputMismatchException();
            res *= 10;
            res += c - '0';
            c = read();
        } while (!isSpaceChar(c));
        return res * sgn;
    }

    public String next()
    {
        int c = read();
        while (isSpaceChar(c))
            c = read();
        StringBuilder res = new StringBuilder();
        do
        {
            res.appendCodePoint(c);
            c = read();
        } while (!isSpaceChar(c));
        return res.toString();
    }
    
    public String nextLine()
    {
        int c = read();
        StringBuilder res = new StringBuilder();
        do
        {
            res.appendCodePoint(c);
            c = read();
        } while (!isLineEndChar(c));
        return res.toString();
    }    
    
    public double nextDouble() {
        int c = read();
        while (isSpaceChar(c))
            c = read();
        int sgn = 1;
        if (c == '-') {
            sgn = -1;
            c = read();
        }
        double res = 0;
        while (!isSpaceChar(c) && c != '.') {
            if (c == 'e' || c == 'E')
                return res * Math.pow(10, nextInt());
            if (c < '0' || c > '9')
                throw new InputMismatchException();
            res *= 10;
            res += c - '0';
            c = read();
        }
        if (c == '.') {
            c = read();
            double m = 1;
            while (!isSpaceChar(c)) {
                if (c == 'e' || c == 'E')
                    return res * Math.pow(10, nextInt());
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                m /= 10;
                res += (c - '0') * m;
                c = read();
            }
        }
        return res * sgn;
    }
    
    public long nextLong() {
        int c = read();
        while (isSpaceChar(c))
            c = read();
        int sgn = 1;
        if (c == '-') {
            sgn = -1;
            c = read();
        }
        long res = 0;
        do {
            if (c < '0' || c > '9')
                throw new InputMismatchException();
            res *= 10;
            res += c - '0';
            c = read();
        } while (!isSpaceChar(c));
        return res * sgn;
    }
    
    public boolean isSpaceChar(int c)
    {
        if (filter != null)
            return filter.isSpaceChar(c);
        return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
    }
    
    public boolean isLineEndChar(int c)
    {
        if (filter != null)
            return filter.isSpaceChar(c);
        return c == '\n' || c == '\r' || c == -1;
    }

    public interface SpaceCharFilter
    {
        public boolean isSpaceChar(int ch);
    }
}