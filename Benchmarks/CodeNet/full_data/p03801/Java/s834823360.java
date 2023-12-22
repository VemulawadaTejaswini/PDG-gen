import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            //while(true)
            solve(in);
        }
    }

    private static void solve(Scanner in) {
        int N = in.nextInt();
        int[] a = new int[N];
        long[] f = new long[N];

        long SUM = 0;
        for (int i = 0; i < N; i++) {
            a[i] = in.nextInt();
            SUM += a[i];
        }

        while (SUM > 0) {
            int max = 0;
            int mini = 0;
            int maxi = 0;
            for (int i = 0; i < N; i++) {
                if (max < a[i]) {
                    max = a[i];
                    mini = i;
                    maxi = i;
                } else if (max == a[i]) {
                    maxi = i;
                }
            }
            String str = String.valueOf(mini + 1);
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '0') {
                    continue;
                }
                for (int j = i; j < str.length(); j++) {
                    String sub = str.substring(i, j + 1);
                    int freq = Integer.valueOf(sub);
                    f[freq - 1]++;
                }
            }
            a[maxi]--;
            SUM--;
        }

        StringBuilder ans = new StringBuilder();
        //        for (int i = 1; i < N + 1; i++) {
        //            int cnt = 0, idx = -1;
        //            do {
        //                idx = s.indexOf(String.valueOf(i), idx + 1);
        //                if (idx > -1) {
        //                    cnt++;
        //                }
        //            } while (idx > -1 && idx < s.length());
        //            ans.append(cnt).append("\n");
        //        }
        for (long l : f) {
            ans.append(l).append("\n");
        }
        System.out.println(ans);
    }
}

class Scanner implements Closeable {
    private final InputStream stream;
    private final byte[] buf = new byte[1024];
    private int cur;
    private int num;

    Scanner(InputStream stream) {
        this.stream = stream;
    }

    int[] nextIntArray(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = nextInt();
        return a;
    }

    int nextInt() {
        return (int) nextLong();
    }

    long nextLong() {
        int c = read();
        while (isdel(c))
            c = read();
        int sgn = 1;
        if (c == '-') {
            sgn = -1;
            c = read();
        }
        long l = 0;
        do {
            if (c < '0' || c > '9')
                throw new InputMismatchException();
            l *= 10;
            l += c - '0';
            c = read();
        } while (!isdel(c));
        return l * sgn;
    }

    double nextDouble() {
        return Double.parseDouble(next());
    }

    String next() {
        int c = read();
        while (isdel(c))
            c = read();
        StringBuilder s = new StringBuilder();
        do {
            s.appendCodePoint(c);
            c = read();
        } while (!isdel(c));
        return s.toString();
    }

    private int read() {
        if (num == -1)
            throw new InputMismatchException();
        if (cur >= num) {
            cur = 0;
            try {
                num = stream.read(buf);
            } catch (Exception e) {
                throw new InputMismatchException();
            }
            if (num <= 0)
                return -1;
        }
        return buf[cur++];
    }

    private boolean isdel(int c) {
        return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
    }

    @Override
    public void close() {
        try {
            stream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}