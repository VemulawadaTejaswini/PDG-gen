import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;


public class Main {

    int[][] c;

    private void solve() {
        c = new int[3][3];

        for(int i = 0;i < 3;i++) {
            for(int j = 0;j < 3;j++) {
                c[i][j] = nextInt();
            }
        }

        boolean ans = false;
        out:
        for(int a1 = 0;a1 < 101;a1++) {
            for(int a2 = 0;a2 < 101;a2++) {
                for(int a3 = 0;a3 < 101;a3++) {
                    int[] a = {a1, a2, a3};
                    int[] b = new int[3];

                    for(int i = 0;i < 3;i++) {
                        for(int j = 0;j < 3;j++) {
                            b[j] = c[i][j] - a[i];
                        }
                    }

                    boolean flag = true;
                    for(int i = 0;i < 3;i++) {
                        for(int j = 0;j < 3;j++) {
                            if (a[i] + b[j] != c[i][j]) {
                                flag = false;
                            }

                            if (b[j] < 0 || b[j] > 100) {
                                flag = false;
                            }
                        }
                    }

                    if (flag) {
                        ans = true;
                        break out;
                    }
                }
            }
        }

        if (ans) out.println("Yes");
        else out.println("No");
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
