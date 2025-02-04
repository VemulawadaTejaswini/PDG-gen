import java.io.IOException;
import java.io.InputStream;
import java.util.*;
import java.math.BigInteger;
 
public class Main implements Runnable {
	
	//static int mod = 1000000007;

    public static void main(String[] args) {
    	new Thread(null, new Main(), "", 16 * 1024 * 1024).start();
    }
    
    public void run() {
        FastScanner sc = new FastScanner();
        
        int n = sc.nextInt();
        int ga = sc.nextInt();
        int sa = sc.nextInt();
        int ba = sc.nextInt();
        int gb = sc.nextInt();
        int sb = sc.nextInt();
        int bb = sc.nextInt();
        
        int[] w1 = {ga,sa,ba};
        int[] v1 = {gb-ga,sb-sa,bb-ba};
        int n1 = (int) unboundedKnapsack(w1,v1,n);
        
        int[] w2 = {gb,sb,bb};
        int[] v2 = {ga-gb,sa-sb,ba-bb};
        long n2 = unboundedKnapsack(w2,v2,n1+n);
        
        System.out.println(n2+n1+n);
    }

	static int unboundedKnapsack(int[] weight, int[] value, int capacity){
		int n = weight.length;
		int[][] dp = new int[n+1][capacity+1]; //dp[i+1][w]が品物0から品物iまでを用いた重さ制限wの問題の解
		
		for(int i=0;i<n;i++){
			for(int w=1;w<=capacity;w++){
				if(w>=weight[i]){
					dp[i+1][w] = Math.max(dp[i+1][w-weight[i]]+value[i],dp[i][w]);
					//dp[i][w-weight[i]]+value[i]はdp[i+1][w-weight[i]]+value[i]の劣化なので調べる必要なし
				}
				else{
					dp[i+1][w] = dp[i][w];
				}
			}
		}
		
		return dp[n][capacity];	
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
		} else {
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
		if (hasNextByte())
			return buffer[ptr++];
		else
			return -1;
	}
	private static boolean isPrintableChar(int c) {
		return 33 <= c && c <= 126;
	}
	public boolean hasNext() {
		while (hasNextByte() && !isPrintableChar(buffer[ptr]))
			ptr++;
		return hasNextByte();
	}
	public String next() {
		if (!hasNext())
			throw new NoSuchElementException();
		StringBuilder sb = new StringBuilder();
		int b = readByte();
		while (isPrintableChar(b)) {
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}
	public long nextLong() {
		if (!hasNext())
			throw new NoSuchElementException();
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
		while (true) {
			if ('0' <= b && b <= '9') {
				n *= 10;
				n += b - '0';
			} else if (b == -1 || !isPrintableChar(b)) {
				return minus ? -n : n;
			} else {
				throw new NumberFormatException();
			}
			b = readByte();
		}
	}
	public int nextInt() {
		long nl = nextLong();
		if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)
			throw new NumberFormatException();
		return (int) nl;
	}
	public int[] nextIntArray(int n){
		int[] a = new int[n];
		for(int i=0;i<n;i++){
			a[i] = nextInt();
		}
		return a;
	}
	public Integer[] nextIntegerArray(int n){
		Integer[] a = new Integer[n];
		for(int i=0;i<n;i++){
			a[i] = nextInt();
		}
		return a;
	}
	public double nextDouble() {
		return Double.parseDouble(next());
	}
}