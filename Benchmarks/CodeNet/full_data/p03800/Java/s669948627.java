import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;
import java.math.BigInteger;
 
public class Main implements Runnable {
	
	static int mod = 1000000007;
    static boolean[] s;
	
    public static void main(String[] args) {
    	new Thread(null, new Main(), "", 1024 * 1024 * 1024).start();
    }
    
    public void run() {
       	PrintWriter out = new PrintWriter(System.out);
        FastScanner sc = new FastScanner();

        int n = sc.nextInt();
        char[] S = sc.next().toCharArray();
        
        s = new boolean[n];
        
        for(int i=0;i<n;i++){
        	if(S[i] == 'o'){
        		s[i] = true;
        	}
        }
    	
        int[] a1 = new int[n];
        int[] a2 = new int[n];
        a2[0] = 1;
        int[] a3 = new int[n];
        a3[1] = 1;
        int[] a4 = new int[n];
        a4[0] = 1;
        a4[1] = 1;
        
        Circle c1 = new Circle(a1);
        Circle c2 = new Circle(a2);
        Circle c3 = new Circle(a3);
        Circle c4 = new Circle(a4);
        
        if(c1.isCan(s)){
        	for(int i=0;i<n;i++){
        		if(c1.a[i] == 0){
        			out.print("S");
        		}
        		else{
        			out.print("W");
        		}
        	}
        	out.println();
        }
        else if(c2.isCan(s)){
        	for(int i=0;i<n;i++){
        		if(c2.a[i] == 0){
        			out.print("S");
        		}
        		else{
        			out.print("W");
        		}
        	}
        	out.println();
        }
        else if(c3.isCan(s)){
        	for(int i=0;i<n;i++){
        		if(c3.a[i] == 0){
        			out.print("S");
        		}
        		else{
        			out.print("W");
        		}
        	}
        	out.println();
        }
        else if(c4.isCan(s)){
        	for(int i=0;i<n;i++){
        		if(c4.a[i] == 0){
        			out.print("S");
        		}
        		else{
        			out.print("W");
        		}
        	}
        	out.println();
        }
        else{
        	out.println(-1);
        }
        
        out.flush();
    }

 
}

class Circle {
	int[] a;
	
	public Circle(int[] a){
		this.a = a;
	}
	
	boolean isCan(boolean[] s){
		for(int i=1;i<a.length-1;i++){
			if(a[i] == 0){
				if(s[i]==true){
					a[i+1] = a[i-1];
				}
				else{
					if(a[i-1]==1){
						a[i+1] = 0;
					}
					else{
						a[i+1] = 1;
					}
				}
			}
			else{
				if(s[i]==false){
					a[i+1] = a[i-1];
				}
				else{
					if(a[i-1]==1){
						a[i+1] = 0;
					}
					else{
						a[i+1] = 1;
					}
				}
			}
		}
		
		for(int i=0;i<a.length;i++){
			if(s[i] == (right(i)==left(i))){
				if(a[i] == 1){
					return false;
				}
			}
			else{
				if(a[i] == 0){
					return false;
				}
			}
		}
		return true;
	}
	
	//右隣
	int right(int id){
		if(id<a.length-1){
			return a[id+1];
		}
		else{
			return a[0];
		}
	}
	
	//左隣
	int left(int id){
		if(id==0){
			return a[a.length-1];
		}
		else{
			return a[id-1];
		}
	}
	
	//最大の連続する数
	int maxseq(){
		
		int max = 1;
		int id = 0;
		int num = 1;
		while(id!=a.length){
			if(right(id) == a[id]){
				num++;
				id++;
			}
			else{
				max = Math.max(max, num);
				num = 1;
				id++;
			}
		}
		
		id = 0;
		while(true){
			if(num > a.length){
				return a.length;
			}
			if(right(id) == a[id]){
				num++;
				id++;
			}
			else{
				max = Math.max(max, num);
				break;
			}
		}
		
		return max;
		
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