import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        int N = sc.nextInt();
        PrintWriter out = new PrintWriter(System.out);
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i=0; i<N; i++) {
            Integer A = sc.nextInt();
            Map.Entry<Integer, Integer> entry = map.floorEntry(A-1);
            out.println(entry);
            if (entry == null) {
                if (map.containsKey(A)) {
                    Integer val = map.get(A);
                    map.put(A, val+1);
                } else {
                    map.put(A, 1);
                }
            } else {
                map.remove(entry.getKey());
                if (entry.getValue() > 1) {
                    map.put(entry.getKey(), entry.getValue()-1);
                } else {
                    map.put(A, 1);
                }
            }
            out.println(map);
        }

        int cnt = 0;
        for(Integer key: map.keySet()) {
            cnt += map.get(key);
        }
        out.println(cnt);
        out.flush();
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