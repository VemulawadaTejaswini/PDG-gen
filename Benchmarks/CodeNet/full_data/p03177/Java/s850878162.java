import java.io.*;
import java.util.*;
import java.util.Map.Entry;

import javax.swing.plaf.multi.MultiButtonUI;

public class Main {
	
	static int MOD = 1000000007;
		
	public static void main(String[] args) throws IOException {
		FastScanner sc = new FastScanner(System.in);
		
		int N = sc.nextInt();
		long K = sc.nextLong();
		
		int[][] T = new int[N][N];
		int[] s = new int[N];
		for(int i = 0; i < N; i++){
			s[i] = 1;
			for(int j = 0; j < N; j++){
				T[i][j] = sc.nextInt();
			}
		}
		
		T = powMatrix(T, K);
		//printMatrix(T);
		s = multiplyMatrix(T, s);
		//printMatrix(s);
		
		long ans = 0;
		for(int i = 0; i < N; i++)
			ans = (ans + s[i]) % MOD;
		System.out.println(ans);
		
	}//end main
	
	public static int[][] powMatrix(int[][] a, long n){
		
		if(n == 0){
			int size = a.length;
			int[][] e = new int[size][size];
			for(int i = 0; i < size; i++){
				for(int j = 0; j < size; j++){
					if(i == j)
						e[i][j] = 1;
					else
						e[i][j] = 0;
				}
			}
			return e;
		}
		
		if(n % 2 == 0){
			return powMatrix(multiplyMatrix(a, a), n / 2);
		}else{
			return multiplyMatrix(a, powMatrix(multiplyMatrix(a, a), (n - 1) / 2));
		}
	}
	
	public static int[] multiplyMatrix(int[][] a, int[] x){
		int size = a.length;
		int[] y = new int[size];
		for(int i = 0; i < size; i++){
			for(int j = 0; j < size; j++){
				y[i] = (int)((1L * y[i] + (1L * a[i][j] * x[j]) % MOD) % MOD);
			}
		}
		return y;
	}
	
	public static int[][] multiplyMatrix(int[][] a, int[][] b){
		int size = a.length;
		int[][] c = new int[size][size];
		for(int i = 0; i < size; i++){
			for(int j = 0; j < size; j++){
				for(int k = 0; k < size; k++){
					c[i][j] = (int)((1L * c[i][j] + (1L * a[i][k] * b[k][j]) % MOD) % MOD);
				}
			}
		}
		return c;
	}
	
	public static void printMatrix(int[] a){
		int size = a.length;
		for(int j = 0; j < size; j++){
			System.out.println(a[j]);
		}
	}
	
	public static void printMatrix(int[][] a){
		int size = a.length;
		for(int i = 0; i < size; i++){
			for(int j = 0; j < size; j++){
				System.out.print(a[i][j]);
				if(j == size-1)
					System.out.println();
				else
					System.out.print(" ");
			}
		}
	}
	
}//end Main

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
