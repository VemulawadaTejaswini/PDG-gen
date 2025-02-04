import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

public class Main {
	static int[] a = new int[3];
	static int c=0;
	public static void main(String[] args) throws Exception{	
		FastScanner sc = new FastScanner();
		int i, j;
			//code
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int x;
		int cnt = 0;
		
		for(i=1; i<=7-2; i++){
			c = 0;
			set(1, i);
			set(2, i);
			set(3, i);
			for(j=1; j<=n-2; j++){
				x = 0;
				x += a[0];
				x += a[1];
				x += a[2];
				if(x % 11 == k){
					cnt++;
				}
				set(j+3, i);
			}
		}
		pl(cnt);
	}
	
	static void set(int i, int j){
		a[c] = 0;
		for(int k=0; k<3; k++){
			a[c] += i*7 + (j+k) - 7;
		}
		c++;
		if(c == 3) c = 0;
	}
	
	static void func(String s){
		
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
