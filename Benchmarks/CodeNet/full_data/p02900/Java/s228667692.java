import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        PrintWriter out = new PrintWriter(System.out);
        FastScanner sc = new FastScanner();
        Strategy strategy = new MyStrategy();
        strategy.solve(out, sc);
        out.flush();
    }
}

class MyStrategy implements Strategy {
    @Override
    public void solve(PrintWriter out, FastScanner sc) {
        long A = sc.nextLong();
        long B = sc.nextLong();

        TreeSet<Long> setA = getList(A);
        TreeSet<Long> setB = getList(B);
//        out.println(setA);
//        out.println(setB);
        int res = 0;
        Long a = setA.pollFirst();
        Long b = setB.pollFirst();
        while(a != null && b != null) {
            if (a.compareTo(b) == 0) {
                res += 1;
                a = setA.pollFirst();
                b = setB.pollFirst();
            } else if (a.compareTo(b) > 0) {
                b = setB.pollFirst();
            } else if (a.compareTo(b) < 0){
                a = setA.pollFirst();
            } else {
                throw new RuntimeException();
            }
        }
        out.println(res);
    }

    private TreeSet<Long> getList(long num){
        TreeSet<Long> set = new TreeSet<>(Comparator.naturalOrder());
        set.add(1l);
        long i = 2;
        double limit = Math.sqrt(num);

        if (num % 2 == 0) {
            set.add(2l);
            while (num % 2 == 0) {
                num /= i;
            }
        }
        i += 1;
        while (num > 1 && i <= limit) {
            if (num % i == 0) {
                set.add(i);
                num /= i;
            } else {
                i += 2;
            }
        }
        return set;
    }


}

interface Strategy {
    void solve(PrintWriter out, FastScanner sc);
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
