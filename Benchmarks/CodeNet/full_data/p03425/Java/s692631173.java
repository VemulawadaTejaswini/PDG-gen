import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;


public class Main {

    int N;
    String[] S;

    private void solve() {
        N = nextInt();
        S = new String[N];

        long m = 0;
        long a = 0;
        long r = 0;
        long c = 0;
        long h = 0;

        for(int i = 0;i < N;i++) {
            S[i] = next();

            switch(S[i].charAt(0)) {
                case 'M':
                    m++;
                    break;
                case 'A':
                    a++;
                    break;
                case 'R':
                    r++;
                    break;
                case 'C':
                    c++;
                    break;
                case 'H':
                    h++;
                    break;
                default:
                    break;

            }
        }

        long ans = 0;
        ans += m * a * r;
        ans += m * a * c;
        ans += m * a * h;
        ans += m * r * c;
        ans += m * r * h;
        ans += m * c * h;
        ans += a * r * c;
        ans += a * r * h;
        ans += a * c * h;
        ans += r * c * h;

        out.println(ans);
    }
    public static void main(String[] args) {
        out.flush();
        new Main().solve();
        out.close();
    }

    /* Input */
    private static final InputStream in = System.in;
    private static final PrintWriter out = new PrintWriter(System.out);
    private final byte[] buffer = new byte[4096];
    private int p = 0;
    private int buflen = 0;

    private boolean hasNextByte() {
        if (p < buflen)
            return true;
        p = 0;
        try {
            buflen = in.read(buffer);
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (buflen <= 0)
            return false;
        return true;
    }

    public boolean hasNext() {
        while (hasNextByte() && !isPrint(buffer[p])) {
            p++;
        }
        return hasNextByte();
    }

    private boolean isPrint(int ch) {
        if (ch >= '!' && ch <= '~')
            return true;
        return false;
    }

    private int nextByte() {
        if (!hasNextByte())
            return -1;
        return buffer[p++];
    }

    public String next() {
        if (!hasNext())
            throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = -1;
        while (isPrint((b = nextByte()))) {
            sb.appendCodePoint(b);
        }
        return sb.toString();
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }

    public long nextLong() {
        return Long.parseLong(next());
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }
}
