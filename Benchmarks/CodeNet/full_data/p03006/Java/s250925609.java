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
        		HashSet<Kind> set = new HashSet<>();
        		int p = x[i] - x[j];
        		int q = y[i] - y[j];
        		
        		if(p==0 && q==0){
        			continue;
        		}
        		else if(p==0){
            		for(int k=0;k<n;k++){
            			Kind nk = new Kind(0,mod(y[k],q),x[k]);
            			if(set.add(nk)){	//まだない

            			}
            			else{	//既にあった
            				nocost++;
            			}
            		}
            		
            		maxnocost = Math.max(maxnocost, nocost);
        		}
        		else if(q==0){
            		for(int k=0;k<n;k++){
            			Kind nk = new Kind(mod(x[k],p),0,y[k]);
            			if(set.add(nk)){	//まだない

            			}
            			else{	//既にあった
            				nocost++;
            			}
            		}
            		
            		maxnocost = Math.max(maxnocost, nocost);
        		}
        		else{
            		for(int k=0;k<n;k++){
            			Kind nk = new Kind(mod(x[k],p),mod(y[k],q),(int)(Math.floor(x[k]/(double)p) - Math.floor(y[k]/(double)q)));
            			if(set.add(nk)){	//まだない

            			}
            			else{	//既にあった
            				nocost++;
            			}
            		}
            		
            		maxnocost = Math.max(maxnocost, nocost);
        		}
        	}
        }

        System.out.println(n-maxnocost);
    }
    
	static int mod(int a, int mod) {
		return (a % mod + mod) % mod;
	}
}

class Kind{
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + div;
		result = prime * result + modp;
		result = prime * result + modq;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Kind other = (Kind) obj;
		if (div != other.div)
			return false;
		if (modp != other.modp)
			return false;
		if (modq != other.modq)
			return false;
		return true;
	}

	int modp;
	int modq;
	int div;
	
	public Kind(int modp,int modq, int div){
		this.modp = modp;
		this.modq = modq;
		this.div = div;
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