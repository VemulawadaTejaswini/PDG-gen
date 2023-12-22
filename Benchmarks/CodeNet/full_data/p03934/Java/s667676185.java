import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

public class Main {
	
	public static void main(String[] args) throws Exception{	
		FastScanner sc = new FastScanner();
		int i, j, k;
			//code
		
		int n = sc.nextInt();
		int q = sc.nextInt();
		
		int index = 0;
		
		int[] N = new int[n];
		long[] a = new long[q];
		long[] b = new long[q];
		
		
		for(i=0; i<q; i++){
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}
		
		
		for(i=0; i<q; i++){
			for(j=0; j<b[i]; j++){
				int min = 9999999;
				for(k=(int) (a[i]-1); k>=0; k--){
					if(min >= N[k]){
					min = N[k];
					index = k;
					}
				}
				N[index]++;
			}
		}
		
		for(i=0; i<n; i++){
			pl(N[i]);
		}
		
		
	
		
	
	}
	
	
	
	static void func(){

	}
	
	static void p(String s){ System.out.print(s); }
	static void pl(String s){ System.out.println(s); }
	static void p(int s){ System.out.print(s); }
	static void pl(int s){ System.out.println(s); }
	static void p(long s){ System.out.print(s); }
	static void pl(long s){ System.out.println(s); }
	static void p(double s){ System.out.print(s); }
	static void pl(double s){ System.out.println(s); }
	static void p(boolean s){ System.out.print(s); }
	static void pl(boolean s){ System.out.println(s); }
	

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
