import java.io.*;
import java.util.*;
import java.util.Map.Entry;

public class Main {
	
	static int INF = Integer.MAX_VALUE / 2;
		
	public static void main(String[] args) throws IOException {
		FastScanner sc = new FastScanner(System.in);
		
		int N = sc.nextInt();
		int W = sc.nextInt();
		int[] w = new int[N+1];
		int[] v = new int[N+1];
		int sumV = 0;
		
		for(int i = 1; i <= N; i++){
			w[i] = sc.nextInt();
			v[i] = sc.nextInt();
			sumV += v[i];
		}
		
		long[][] dp = new long[N+1][sumV+1];
		
		for(int i = 0; i <= N; i++){
			Arrays.fill(dp[i], INF);
		}
		dp[0][0] = 0;
		
		for(int i = 0; i < N; i++){
			for(int j = 0; j <= sumV; j++){
				dp[i+1][j] = Math.min(dp[i+1][j], dp[i][j]);
				if(j + v[i+1] <= sumV){
					dp[i+1][j + v[i+1]] = Math.min(dp[i+1][j + v[i+1]], dp[i][j] + w[i+1]);
				}
			}
		}
		
		long ans = 0;
		for(int j = sumV; j >= 0; j--){
			if(dp[N][j] <= W){
				ans = j;
				break;
			}
		}
		
		System.out.println(ans);
		
	}//end main
	
	
}//end Main

class Pair{
	int r;
	int c;
	public Pair(int r, int c){
		this.r = r;
		this.c = c;
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
