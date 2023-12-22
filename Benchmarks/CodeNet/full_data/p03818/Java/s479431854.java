
import java.util.*;
import java.io.*;
class Main {
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        int N = sc.nextInt();
        int[] a = new int[N];
        for(int i = 0; i<N; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        for(int i = 0; i<N; i++) pp(a[i]+" ");
        p("");
        int even = 0;
        int pre = a[0];
        int cur = 0;
        int cnt = 1;
        int all = 0;
        for(int i = 1; i<N; i++) {
            cur = a[i];
            if(i==N-1) {
                if(cur==pre) cnt++;
                else all += 1;
                if(cnt%2==0) {
                    even++;
                    all += 2;
                    pe(i+" "+cur+" +2 "+all);
                }else {
                    all++;
                    pe(i+" "+cur+" +1 "+all);
                }
                break;
            }
            if(cur==pre) {
                cnt++;
                if(i==N-1) {
                    if(cnt%2==0) {
                        even++;
                        all += 2;
                        pe(i+" "+cur+" "+all);
                    }else {
                        all++;
                        pe(i+" "+cur+" "+all);
                    }
                }
            }else {
                if(cnt%2==0) {
                    even++;
                    all += 2;
                    pe(i+" "+cur+" +2 "+all);
                }else {
                    all++;
                    pe(i+" "+cur+" +1 "+all);
                }
                cnt = 1;
            }
            pre = cur;
        }
        pe(all);
        int ans = all - (even/2*2) - (even%2*2);
        p(ans);
    }
    public static <T> void p(T element) {
	System.out.println(element);
    }
    public static <T> void pp(T element) {
        System.out.print(element);
        }
        public static <T> void pe(T element) {
            System.err.println(element);
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