import java.util.Map.Entry;
import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		FastScanner sc = new FastScanner(System.in);
		
		int N = sc.nextInt();
		int[] x = new int[N];
		int[] y = new int[N];
		int[] h = new int[N];
		for(int i = 0; i < N; i++){
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
			h[i] = sc.nextInt();
		}
		
		for(int Cx = 0; Cx <= 100; Cx++){
			for(int Cy = 0; Cy <= 100; Cy++){
				int range = Integer.MAX_VALUE, H = 1;
				if(h[0] == 0){
					range = h[0] + Math.abs(x[0]-Cx) + Math.abs(y[0]-Cy);
				}else{
					H = h[0] + Math.abs(x[0]-Cx) + Math.abs(y[0]-Cy);
				}
				boolean tf = true;
				for(int i = 1; i < N; i++){
					int hi = h[i] + Math.abs(x[i]-Cx) + Math.abs(y[i]-Cy);
					if(h[i] == 0){
						range = Math.min(range, hi);
						if(H > range) tf = false;
					}
					
					if(h[i] > 0){
						if(H == 1) H = hi;
						if(hi != H) tf = false;
					}
				}
				if(tf){
					System.out.println(Cx + " " + Cy + " " + H);
					return;
				}
			}
		}
		
		System.out.println("No");
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
