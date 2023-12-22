import java.util.Map.Entry;
import java.io.*;
import java.util.*;

public class Main {
	static int N = 0;
	static long ans = 0;
	
	public static void main(String[] args) throws IOException {
		FastScanner sc = new FastScanner(System.in);
		
		N = sc.nextInt();
		dfs("", 0, false, false, false);
		System.out.println(ans);
	}
	
	public static void dfs(String s, int len, boolean t3, boolean t5, boolean t7){
		if(len == 10){
			return;
		}else{
			if(len != 0){
				//System.out.println(s);
				if(t3 && t5 && t7 && Integer.parseInt(s) <= N) ans++;
			}
			dfs(s+"3", len+1, true, t5, t7);
			dfs(s+"5", len+1, t3, true, t7);
			dfs(s+"7", len+1, t3, t5, true);
		}
	}
	
	public static void count(String s){
		boolean t3 = false, t5 = false, t7 = false;
		for(int i = 0; i < s.length(); i++){
			if(s.charAt(i) == '3') t3 = true;
			else if(s.charAt(i) == '5') t5 = true;
			else if(s.charAt(i) == '7') t7 = true;
		}
		if(t3 && t5 && t7 && Integer.parseInt(s) < N) ans++;
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
