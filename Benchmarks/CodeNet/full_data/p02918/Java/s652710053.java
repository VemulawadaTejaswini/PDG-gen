import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        int n = fs.nextInt();
        int k = fs.nextInt();
        String s = fs.next();
        ArrayList<Character> lst = new ArrayList<Character>();
        for(int i=0; i<n; i++) lst.add(s.charAt(i));
        ArrayList<Character> flag = new ArrayList<Character>();
        ArrayList<Integer> size = new ArrayList<Integer>();
        flag.add(lst.get(0));
        int cnt = 1;
        int check = 0;
        for(int i=1; i<n; i++) {
            if(flag.get(check).equals(lst.get(i))) {
                cnt++;
            }else {
                flag.add(lst.get(i));
                size.add(cnt);
                cnt = 1;
                check++;
            }
        }
        size.add(cnt);
        
      	int flag_size = flag.size();
        char first = flag.get(0);
        char last = flag.get(flag_size-1);
        if(first=='L' && last=='R') {
            if(k<=(flag_size-2)/2) System.out.println(n-flag_size+2*k);
            else System.out.println(n-1); 
        }
        else {
            int f_size;
            if(flag_size%2!=0) f_size = flag_size-1;
            else f_size = flag_size;
            if(k<f_size/2) System.out.println(n-flag_size+2*k);
            else System.out.println(n-1);
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
 
    public double nextDouble() {
        return Double.parseDouble(next());
    }
}
