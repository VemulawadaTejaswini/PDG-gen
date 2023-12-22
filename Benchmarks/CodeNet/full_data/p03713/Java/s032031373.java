import java.io.FileInputStream;
import java.util.NoSuchElementException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class Main {
	//ABC082D
	public static void main(String[] args) throws IOException {
		//FastScanner sc = new FastScanner(new FileInputStream("input.txt"));
		FastScanner sc = new FastScanner(System.in);
		
		long H = sc.nextLong();
		long W = sc.nextLong();
		long ans = Long.MAX_VALUE;
		
		for(int i = 1; i < W; i++){
			long S1 = H * i;
			long S2 = (H / 2) * (W - i);
			long S3 = (H - H / 2) * (W - i);
			//System.out.println("S1 = " + S1 + " S2 = " + S2 + " S3 = " + S3);
			long min = Math.min(Math.min(S1, S2), S3);
			long max = Math.max(Math.max(S1, S2), S3);
			ans = Math.min(ans, max - min);
			
			S2 = H  * ((W - i) / 2);
			S3 = H  * ((W - i) - (W - i) / 2);
			//System.out.println("S1 = " + S1 + " S2 = " + S2 + " S3 = " + S3);
			min = Math.min(Math.min(S1, S2), S3);
			max = Math.max(Math.max(S1, S2), S3);
			if(min != 0) ans = Math.min(ans, max - min);
		}
		
		long tmp = H;
		H = W;
		W = tmp;
		
		for(int i = 1; i < W; i++){
			long S1 = H * i;
			long S2 = (H / 2) * (W - i);
			long S3 = (H - H / 2) * (W - i);
			long min = Math.min(Math.min(S1, S2), S3);
			long max = Math.max(Math.max(S1, S2), S3);
			ans = Math.min(ans, max - min);
			
			S2 = H  * ((W - i) / 2);
			S3 = H  * ((W - i) - (W - i) / 2);
			min = Math.min(Math.min(S1, S2), S3);
			max = Math.max(Math.max(S1, S2), S3);
			ans = Math.min(ans, max - min);
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
