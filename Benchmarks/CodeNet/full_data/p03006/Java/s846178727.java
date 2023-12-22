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
        int[] x = new int[n];
        int[] y = new int[n];
        
        for(int i=0;i<n;i++){
        	x[i] = sc.nextInt();
        	y[i] = sc.nextInt();
        }

        int maxnocost = 0;
        for(int i=0;i<n;i++){
        	for(int j=i+1;j<n;j++){
        		int nocost = 0;
        		int p = x[i] - x[j];
        		int q = y[i] - y[j];
        		
        		for(int u=0;u<n;u++){
        			for(int v=u+1;v<n;v++){
        				if(x[u] - x[v] == p){
            				if(y[u] - y[v] == q){
            					nocost++;
            				}
            				if(p==0 && y[u]-y[v]==-q){
            					nocost++;
            				}
        				}
        				else if(x[u] - x[v] == -p){
            				if(y[u] - y[v] == -q){
            					nocost++;
            				}
        				}
        			}
        		}
        		maxnocost = Math.max(maxnocost, nocost);
        	}
        }

        System.out.println(n-maxnocost);
    }
    
	static int mod(int a, int mod) {
		return (a % mod + mod) % mod;
	}
}

class Pair implements Comparable<Pair>{
	int a,b;
	
	public Pair(int a, int b){
		this.a = a;
		this.b = b;
	}
	
	@Override
	public boolean equals(Object o){
		if(o instanceof Pair){
			Pair p = (Pair) o;
			return a == p.a && b == p.b;
		}
		return super.equals(o);
	}
	
	@Override
	public int compareTo(Pair o){
		if(a!=o.a){
			return Integer.compare(a,o.a);
		}
		return Integer.compare(b, o.b);
	}
	
	@Override
	public int hashCode(){
		return (a<<16)+b;
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