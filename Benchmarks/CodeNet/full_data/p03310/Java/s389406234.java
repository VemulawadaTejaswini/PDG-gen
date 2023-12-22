import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.NoSuchElementException;

public class Main {
	
	public static void main(String[] args) throws IOException {
		FastScanner sc = new FastScanner(System.in);
		
		int N = sc.nextInt();
		long[] sum = new long[N+1];
		long[] A = new long[N+1];
		for(int i = 1; i <= N; i++){
			A[i] = sc.nextLong();
			sum[i] = sum[i-1] + A[i];
		}
		
		long ans = Long.MAX_VALUE;
		for(int i = 2; i <= N - 1; i++){
			long P = 0, Q = 0;
			long min = Long.MAX_VALUE;
			for(int j = 1; j < i; j++){
				long p = sum[j];
				long q = sum[i] - sum[j];
				if(Math.abs(p-q) < min){
					min = Math.abs(p-q);
					P = p; Q = q;
				}
			}
			
			long R = 0, S = 0;
			min = Long.MAX_VALUE;
			for(int j = i + 1; j < N; j++){
				long r = sum[j] - sum[i];
				long s = sum[N] - sum[j];
				if(Math.abs(r-s) < min){
					min = Math.abs(r-s);
					R = r; S = s;
				}
			}
			
			ans = Math.min(ans, Math.abs(Math.max(Math.max(P, Q), Math.max(R, S)) - Math.min(Math.min(P, Q), Math.min(R, S))));
		}
		
		System.out.println(ans);
	}
}

class FastScanner {
    private InputStream in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;
    public FastScanner(InputStream in) {
		this.in = in;
	}
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
    private int readByte() {
    	if (hasNextByte()) return buffer[ptr++];
    	else return -1;
    }
    private static boolean isPrintableChar(int c){
    	return 33 <= c && c <= 126;
    }
    public boolean hasNext() {
    	while(hasNextByte() && !isPrintableChar(buffer[ptr]))
    		ptr++; return hasNextByte();
    }
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
    public double nextDouble() {
    	return Double.parseDouble(next());
    }
}