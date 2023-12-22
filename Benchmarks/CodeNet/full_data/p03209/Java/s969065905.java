import java.util.Map.Entry;
import java.io.*;
import java.util.*;

public class Main {
	static long[] P = new long[51];
	static long[] L = new long[51];
	
	
	public static void main(String[] args) throws IOException {
		FastScanner sc = new FastScanner(System.in);
		
		int N = sc.nextInt();
		long X = sc.nextLong();
		P[0] = 1;
		L[0] = 1;
		for(int i = 1; i <= N; i++){
			P[i] = P[i-1] * 2 + 1;
			L[i] = L[i-1] * 2 + 3;
		}
		System.out.println(P(N, X));
	}
	
	public static long P(int n, long x){
		if(n == 0){
			if(x >= 1) return 1;
			else return 0;
		}
		
		if(x >= L[n]) return P[n];
		else{
			if(x == L[n] - 1){
				return P[n];
			}else if(x >= L[n-1] + 2){
				return 1 + P[n-1] + P(n-1, x - (L[n-1]+2));
			}else if(x == L[n-1] + 1){
				return P[n-1];
			}else if(x < L[n-1] + 1){
				if(x == 1) return 0;
				else{
					return P(n-1, x-1);
				}
			}
		}
		
		return 0;
	}
	
	public static int pow(int a, int n){
		if(n == 0) return 1;
		else if(n % 2 == 0){
			return pow(a * a, n / 2);
		}else{
			return a * pow(a * a, (n - 1) / 2);
		}
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
