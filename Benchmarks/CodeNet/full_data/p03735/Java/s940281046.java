import java.io.IOException;
import java.io.InputStream;
import java.util.*;
 
public class Main{
	public static void main(String[] args){
		FastScanner sc = new FastScanner();
		long min1 = Long.MAX_VALUE;
		long min2 = Long.MAX_VALUE;
		long max1 = 0;
		long max2 = 0;
		
		int n = sc.nextInt();
		for(int i=0;i<n; i++){
			long x = sc.nextLong();
			long y = sc.nextLong();
			long a1 = Math.min(min1, x);
			long a2 = Math.min(min2, y);
			long a3 = Math.max(max1, x);
			long a4 = Math.max(max2, y);
			long b1 = Math.min(min1, y);
			long b2 = Math.min(min2, x);
			long b3 = Math.max(max1, y);
			long b4 = Math.max(max2, x);
			if((a3-a1)*(a4-a2)<(b3-b1)*(b4-b2)){
				min1 = a1;
				min2 = a2;
				max1 = a3;
				max2 = a4;
			}else{
				min1 = b1;
				min2 = b2;
				max1 = b3;
				max2 = b4;
			}
		}
		
		System.out.println((max1-min1)*(max2-min2));
		return;
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