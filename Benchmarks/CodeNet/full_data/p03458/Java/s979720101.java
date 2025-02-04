import java.io.IOException;
import java.io.InputStream;
import java.util.*;
 
public class Main{
	public static void main(String[] args){
		FastScanner sc = new FastScanner();
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[][] ans = new int[2*K][2*K];
		for(int i=0; i<2*K; ++i){
			for(int j=0; j<2*K; ++j){
				ans[i][j] = 0;
			}
		}
		
		for(int i=0; i<N; ++i){
			int x = (int)(sc.nextLong()%(2*K));
			int y = (int)(sc.nextLong()%(2*K));
			String s = sc.next();
			
			int a = 0;
			if(s.equals("B")){
				for(int j=x; j<x+K; j++){
					for(int k=y; k<y+K; k++){
						ans[j%(2*K)][k%(2*K)]++;
					}					
				}
				for(int j=x+K; j<x+2*K; j++){
					for(int k=y+K; k<y+2*K; k++){
						ans[j%(2*K)][k%(2*K)]++;
					}					
				}
			}else{
				for(int j=x; j<x+K; j++){
					for(int k=y+K; k<y+2*K; k++){
						ans[j%(2*K)][k%(2*K)]++;
					}					
				}
				for(int j=x+K; j<x+2*K; j++){
					for(int k=y; k<y+K; k++){
						ans[j%(2*K)][k%(2*K)]++;
					}					
				}
			}
		}
		
		int max = 0;
		for(int i=0; i<2*K; ++i){
			for(int j=0; j<2*K; ++j){
				max = Math.max(max, ans[i][j]);
			}
		}
		System.out.println(max);
		return;
	}
	
	public static void quickSort(long[] a, int from, int to) {
		if (to - from <= 1) {
			return;
		}
		int i = from;
		int j = to - 1;
		long x = a[from + (new Random()).nextInt(to - from)];
		while (i <= j) {
			while (a[i] < x) {
				i++;
			}
			while (a[j] > x) {
				j--;
			}
			if (i <= j) {
				long t = a[i];
				a[i] = a[j];
				a[j] = t;
				i++;
				j--;
			}
		}
		quickSort(a, from, j + 1);
		quickSort(a, j + 1, to);
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