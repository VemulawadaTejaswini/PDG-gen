import java.io.IOException;
import java.util.NoSuchElementException;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in))) {
            FastScanner fs = new FastScanner();

            String S = fs.next();
            String T = fs.next();

            final int N = 26;

            Integer[] X = new Integer[N];
            Integer[] Y = new Integer[N];

            Arrays.fill(X, 0);
            Arrays.fill(Y, 0);

            for (int i = 0; i < S.length(); i++) X[S.charAt(i) - 'a']++;
            for (int i = 0; i < T.length(); i++) Y[T.charAt(i) - 'a']++;

            Arrays.sort(X);
            Arrays.sort(Y);

            boolean flg = true;

            for (int i = 0; i < X.length; i++) {
                if (X[i] != Y[i]) {
                    flg = false;
                    break;
                }
            }

            HashMap<Character, Character> hs
                = new HashMap<Character, Character>();

            if (flg) {
                for (int i = 0; i < S.length(); i++) {
                    if (!hs.containsKey(S.charAt(i))) {
                        hs.put(S.charAt(i), T.charAt(i));
                    } else {
                        if (!hs.get(S.charAt(i)).equals(T.charAt(i))) {
                            flg = false;
                            break;
                        }
                    }
                }
            }

            System.out.println(flg ? "Yes" : "No");
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
        if (hasNextByte()) return buffer[ptr++];
        else return -1;
    }
    private static boolean isPrintableChar(int c) {
        return 33 <= c && c <= 126;
    }
    public boolean hasNext() {
        while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
        return hasNextByte();
    }
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
        while(true) {
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            } else if(b == -1 || !isPrintableChar(b)) {
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
