import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
	    long[] V = new long[N];
	    for (int i = 0; i < N; ++i)
	    	V[i] = sc.nextLong();

	    long res = 0;
	    for (int p = 0; p <= Math.min(K, N); ++p) {
	        for (int q = 0; p + q <= Math.min(K, N); ++q) {
	            List<Long> v = new ArrayList<>();
                long cur = 0;
	            for (int i = 0; i < p; ++i) { v.add(V[i]); cur += V[i];}
	            for (int i = 0; i < q; ++i) { v.add(V[N-1-i]) ; cur += V[N-1-i];}
	               
	            Collections.sort(v);
	            for (int i = 0; i < Math.min(K - p - q, (int)v.size()); ++i) {
	                if (v.get(i) < 0) cur -= v.get(i);
	            }
	            res = Math.max(res, cur);
	        }
	    }
	    out.println(res);
		
		out.close();
	}



static class FastScanner {
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
    public boolean hasNext() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++; return hasNextByte();}
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
    public int nextInt() {
        long nl = nextLong();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
        return (int) nl;
    }
    public double nextDouble() { return Double.parseDouble(next());}
}
}

