import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Collections;
import java.util.NoSuchElementException;

public class Main {
	static FastScanner sc = new FastScanner();
	static PrintStream out = System.out;
	static int p[], q[];

	public static void main(String args[]) {
		int W = ni();
		int H = ni();
		p = na(W);
		q = na(H);
		long ans = 0;
		java.util.Arrays.sort(p);
		java.util.Arrays.sort(q);

		int x = 0;
		int y = 0;
		for (int i=0;i<W+H;i++) {
			if (x < W && p[x] < q[y]) {
				ans += p[x] * (H+1-y);
				x++;
			} else {
				ans += q[y] * (W+1-x);
				y++;
			}
		}

		System.out.println(ans);
	}

	private static String next() {
		return sc.next();
	}

	private static int ni() {
		return sc.nextInt();
	}

	private static long nl() {
		return sc.nextLong();
	}

	private static int[] na(int n) {
		int[] a = new int[n];
		for(int i = 0;i < n;i++) a[i] = ni();
		return a;
	}

	private static long[] nal(int n) {
		long[] a = new long[n];
		for(int i = 0;i < n;i++) a[i] = ni();
		return a;
	}

    private static double nd() {
        return Double.parseDouble( next() );
    }
}

class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;
    private boolean hasNextByte() {
        if (ptr < buflen) {
            return true;
        }else{
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
    private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}
    private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
    private void skipUnprintable() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;}
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
        if (!hasNext()) throw new NoSuchElementException();
        int n = 0;
        boolean minus = false;
        int b = readByte();
        if (b == '-') {
            minus = true;
            b = readByte();
        }
        if (b < '0' || '9' < b) {
            throw new NumberFormatException();
        }
        while(true){
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            }else if(b == -1 || !isPrintableChar(b)){
                return minus ? -n : n;
            }else{
                throw new NumberFormatException();
            }
            b = readByte();
        }
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
        while(true){
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            }else if(b == -1 || !isPrintableChar(b)){
                return minus ? -n : n;
            }else{
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }
}
