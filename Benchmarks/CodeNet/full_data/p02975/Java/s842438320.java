import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;
import java.math.BigInteger;
 
public class Main implements Runnable {
	
	//static int mod = 1000000007;
	
    public static void main(String[] args) {
    	new Thread(null, new Main(), "", 1024 * 1024 * 1024).start();
    }
    
    public void run() {
        PrintWriter out = new PrintWriter(System.out);
        FastScanner sc = new FastScanner();
        
        int n = sc.nextInt();
        int[] a = sc.nextintArray(n);
        int[] b = new int[n];
        
        HashSet<Integer> s = new HashSet<>();
        int num = 0;
        
        for(int i=0;i<n;i++){
        	if(!s.contains(a[i])){
        		s.add(a[i]);
        		b[num] = a[i];
        		num++;
        	}
        }
        
        if(n%3 == 0){
        	if(num == 3){
        		if(((b[0]^b[1])==b[2]) || ((b[0]^b[2])==b[1]) || ((b[1]^b[2])==b[0])){
        			
        			int p = 0;
        			int q = 0;
        			int r = 0;
        			
        			for(int i=0;i<n;i++){
        				if(a[i]==b[0]){
        					p++;
        				}
        				else if(a[i]==b[1]){
        					q++;
        				}
        				else if(a[i]==b[2]){
        					r++;
        				}
        			}
        			
        			if(p==q && q==r){
                		out.println("Yes");
        			}
        			else{
                		out.println("No");
        			}
        		}
        		else{
            		out.println("No");
        		}
        	}
        	else if(num == 1){
        		if(b[0] == 0){
            		out.println("Yes");
        		}
        		else{
        			out.println("No");
        		}
        	}
        	else{
        		out.println("No");
        	}
        }
        else{
        	if(num == 1){
        		if(b[0] == 0){
            		out.println("Yes");
        		}
        		else{
        			out.println("No");
        		}
        	}
        	else{
        		out.println("No");
        	}
        }
        
        out.flush();
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
	public int[] nextintArray(int n){
		int[] a = new int[n];
		for(int i=0;i<n;i++){
			a[i] = nextInt();
		}
		return a;
	}
	public long[] nextlongArray(int n){
		long[] a = new long[n];
		for(int i=0;i<n;i++){
			a[i] = nextLong();
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
	public int[][] nextintMatrix(int h, int w){
		int[][] mat = new int[h][w];
		for(int i=0;i<h;i++){
			for(int j=0;j<w;j++){
				mat[i][j] = nextInt();
			}
		}
		return mat;
	}
	public double nextDouble() {
		return Double.parseDouble(next());
	}
}