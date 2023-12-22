import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.NoSuchElementException;


public class Main {
    public static void main(String[] args) {
        FastScanner fsc = new FastScanner();
        char[] s = (fsc.next() + "!").toCharArray();
        int n = s.length - 1;
        HashSet<Character> a = new HashSet<>();
        ArrayDeque<Integer> d = new ArrayDeque<>();
        for (int i = n - 1; i >= 0; i--) {
            a.add(s[i]);
            if (a.size() == 26) {
                a.clear();
                d.addFirst(i);
            }
        }
        d.addLast(n);
        d.addLast(n + 1);
        int nxt = d.pollFirst();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= n; i++) {
            if (i == nxt) {
                for (char c = 'a'; c <= 'z'; c++) {
                    if (!a.contains(c)) {
                        nxt = d.pollFirst();
                        sb.append(c);
                        a.clear();
                        while (i < n && s[i] != c) {
                            i++;
                        }
                        break;
                    }
                }
                throw new RuntimeException();
            } else {
                a.add(s[i]);
            }
        }
        System.out.println(sb);
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
