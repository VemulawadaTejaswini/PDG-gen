import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

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

        List<Integer> maxis = new ArrayList<>();
        List<Integer> fis = new ArrayList<>();
        while (SUM > 0) {
            if (maxis.isEmpty()) {
                fis.clear();
                int max = 0;
                for (int i = 0; i < N; i++) {
                    if (max < a[i]) {
                        max = a[i];
                        maxis.clear();
                        maxis.add(i);
                    } else if (max == a[i]) {
                        maxis.add(i);
                    }
                }
            }
            int mini = maxis.get(0);
            int maxi = maxis.get(maxis.size() - 1);
            if (fis.isEmpty()) {
                String str = String.valueOf(mini + 1);
                for (int i = 0; i < str.length(); i++) {
                    if (str.charAt(i) == '0') {
                        continue;
                    }
                    for (int j = i; j < str.length(); j++) {
                        String sub = str.substring(i, j + 1);
                        int fi = Integer.valueOf(sub);
                        fis.add(fi);
                    }
                }
            }
            for (int fi : fis) {
                f[fi - 1]++;
            }
            a[maxi]--;
            maxis.remove(maxis.size() - 1);
            SUM--;
        }

        StringBuilder ans = new StringBuilder();
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