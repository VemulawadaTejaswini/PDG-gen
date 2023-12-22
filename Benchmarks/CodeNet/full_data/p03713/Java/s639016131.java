import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class Main {
	public static void main(String args[]) {
		FastScanner scanner = new FastScanner();
		long h=scanner.nextLong();
		long w=scanner.nextLong();
		long tmp1=a(h,w);
		long tmp2=a(w,h);
		long tmp3=b(h,w);
		long tmp4=b(w,h);
		System.out.println(tmp1+" "+tmp2+" "+tmp3+" "+tmp4);
		System.out.println(Math.min(Math.min(tmp1, tmp2), Math.min(tmp3, tmp4)));
	}

	private static long b(long h, long w) {
		long min=Long.MAX_VALUE;
		for (int i = 1; i <= h - 1; i++) {
			long[] s = new long[3];
			s[0] = i * w;
			s[1] = (h - i) * (w - (w / 2));
			s[2] = (h - i) * (w / 2);
			Arrays.sort(s);
			min=Math.min(min, s[2]-s[0]);
		}
		return min;
	}

	private static long a(long h, long w) {
		if(h%3==0){
			return 0;
		}else{
			long min=Long.MAX_VALUE;
			for(int i=1;i<h;i++){
				long[] s=new long[3];
				s[0]=i*w;
				s[1]=(h-i)/2*w;
				s[2]=((h-i)-(h-i)/2)*w;
				Arrays.sort(s);
				min=Math.min(min, s[2]-s[0]);
			}
			return min;
		}
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
