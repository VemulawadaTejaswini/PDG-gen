import java.util.*;
import java.io.*;
class Main {
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        String str = sc.next();
        long ans = 0;
        boolean f = false;

        StringBuilder builder = new StringBuilder();
        for(int i = str.length()-1; i>=0; i--) {
            int n = (str.charAt(i)-'0');
            if(f) n++;
            if(n==5) {
                if(i-1>=0) {
                    if((str.charAt(i-1)-'0')>=5) {
                        builder.append((char)10-n);
                        ans += 10-n;
                        f = true;
                    }else {
                        builder.append(n);
                ans += n;
            
                f = false;
                    }
                }
                else if(i+1<str.length()) {
                    if((str.charAt(i+1)-'0')>=5) {
                        builder.append((char)10-n);
                        ans += 10-n;
                        f = true;
                    }else {
                        builder.append(n);
                ans += n;
            
                f = false;
                    }
                }
            }
            else if(n>5) {
                builder.append((char)10-n);
                ans += 10-n;
                f = true;
            }else {
                
                builder.append(n);
                ans += n;
            
                f = false;
            }
        }
        String s = builder.toString();
        for(int i = s.length()-1; i>=0; i--) {
            pp(s.charAt(i));
        } 
        p("");
        p(str);
        if(f) ans++;
        p(ans);
    }
    public static String stringCopy(String str) {
        StringBuilder builder = new StringBuilder();
        builder.append(str.toCharArray());
        return builder.toString();
    }
    public static <T> void p(T element) {
	System.out.println(element);
    }
    public static <T> void pp(T element) {
        System.out.print(element);
    }
    public static int min(int a, int b, int c) {
	int min = Math.min(a,b);
	min = Math.min(min,c);
	return min;
    }
    public static int max(int a, int b,int c) {
	int max= Math.max(a,b);
	max = Math.max(max,c);
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
 
    private boolean isPrintableChar(int c) {
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
 
    public double nextDouble() {
        return Double.parseDouble(next());
    }
}