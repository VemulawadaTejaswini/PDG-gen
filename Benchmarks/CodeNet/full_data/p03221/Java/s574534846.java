import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.NoSuchElementException;
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
public class Main {
	static FastScanner stdIn=new FastScanner();
	public static void main(String[] args) {
		int N=stdIn.nextInt();
		int M=stdIn.nextInt();
		int A[][]=new int[M][3];
		int num[]=new int[N+1];
		int ans[][]=new int[M][2];
		for(int i=0;i<M;i++){
			A[i][1]=stdIn.nextInt();
			A[i][0]=stdIn.nextInt();
			A[i][2]=i;
		}
		Arrays.sort(A, (a, b) -> Integer.compare(a[0], b[0]));
		for(int i=0;i<M;i++){
			int P=A[i][1];
			int number=A[i][2];
			num[P]++;
			ans[number][0]=P;
			ans[number][1]=num[P];
		}
		for(int i=0;i<M;i++){
			String a=String.valueOf(ans[i][0]);
			String b=String.valueOf(ans[i][1]);
			int x=6-a.length();
			for(int j=0;j<x;j++){
				a="0"+a;
			}
			x=6-b.length();
			for(int j=0;j<x;j++){
				b="0"+b;
			}
			System.out.println(a+b);
		}
	}
}
