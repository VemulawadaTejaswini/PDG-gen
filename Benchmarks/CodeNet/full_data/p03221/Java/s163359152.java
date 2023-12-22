import java.io.IOException;
import java.util.NoSuchElementException;

import java.io.InputStream;

import java.io.PrintWriter;

import java.util.Arrays;
import java.util.Comparator;

@SuppressWarnings("unchecked")
class City {
    int num;
    int pref;
    int year;
    int rank;

    City (int num, int pref, int year) {
        this.num = num;
        this.pref = pref;
        this.year = year;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);

        final int N = nextInt();
        final int M = nextInt();

        City[] c = new City[M];

        for (int i = 0; i < M; i++)
            c[i] = new City(i, nextInt(), nextInt());

        // pref 昇順 year 昇順
        Arrays.sort(c, new Comparator<City>() {
            public int compare(City city1, City city2) {
                if (city1.pref != city2.pref)
                    return city1.pref - city2.pref;
                else
                    return city1.year - city2.year;
            }
        });

        City b = c[0];
        int cnt = 0;
        for (City x : c) {
            if (b.pref == x.pref) cnt++;
            else cnt = 1;

            x.rank = cnt;

            b = x;
        }

        // num 昇順
        Arrays.sort(c, new Comparator<City>() {
            public int compare(City city1, City city2) {
                return city1.num - city2.num;
            }
        });

        for (City x : c) {
            out.print(String.format("%06d", x.pref));
            out.print(String.format("%06d", x.rank));
            out.println();
        }

        out.flush();
    }

    // FastScanner start
    static final InputStream in = System.in;
    static final byte[] buffer = new byte[1024];
    static int ptr = 0;
    static int buflen = 0;
    static boolean hasNextByte() {
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
    static int readByte() {
        if (hasNextByte()) return buffer[ptr++];
        else return -1;
    }
    static boolean isPrintableChar(int c) {
        return 33 <= c && c <= 126;
    }
    static boolean hasNext() {
        while (hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
        return hasNextByte();
    }
    static String next() {
        if (!hasNext()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while (isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }
    static long nextLong() {
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
        while (true) {
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
    static int nextInt() {
        long nl = nextLong();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)
            throw new NumberFormatException();
        return (int) nl;
    }
    static double nextDouble() {
        return Double.parseDouble(next());
    }
    // FastScanner end
}
