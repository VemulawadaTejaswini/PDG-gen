import java.io.*;
import java.util.*;

public class Main {
    static MyReader in = new MyReader();

    public static void main(String[] args) {
        int N = in.i();

        String ans = "Yes";
        int t0 = 0;
        int x0 = 0;
        int y0 = 0;
        for (int i = 0; i < N; i++) {
            int t1 = in.i();
            int x1 = in.i();
            int y1 = in.i();

            int d = t1 - t0 - Math.abs(x0 - x1) - Math.abs(y0 - y1);
            if (d < 0 || d % 2 == 1) {
                ans = "No";
                break;
            }

            t0 = t1;
            x0 = x1;
            y0 = y1;
        }
        
        System.out.println(ans);
    }
}

class MyReader extends BufferedReader {
    char[] cbuf = new char[1024];
    int head = 0;
    int tail = 0;

    MyReader() {
        super(new InputStreamReader(System.in));
    }

    char next() {
        if (head == tail) {
            try {
                tail = super.read(cbuf, 0, cbuf.length);
            } catch (IOException e) {
                e.printStackTrace();
            }
            head = 0;
        }
        return cbuf[head++];
    }

    int i() {
        int k = next() - '0';
        boolean minus = k == -3;
        int n = minus ? 0 : k;
        while (0 <= (k = next() - '0') && k <= 9) n = 10 * n + k;
        return minus ? -n : n;
    }

    int[] ii(final int N) {
        int[] a = new int[N];
        for (int j = 0; j < a.length; j++) a[j] = i();
        return a;
    }

    long l() {
        int k = next() - '0';
        boolean minus = k == -3;
        long n = minus ? 0 : k;
        while (0 <= (k = next() - '0') && k <= 9) n = 10 * n + k;
        return minus ? -n : n;
    }

    char[] s(final int N) {
        char[] s = new char[N];
        for (int i = 0; i < N; i++) {
            s[i] = next();
        }
        next();
        return s;
    }

    public int read(char[] cbuf) {
        int i;
        char c;
        for (i = 0; (c = next()) != ' ' && c != '\n'; i++) cbuf[i] = c;
        return i;
    }

    public String readLine() {
        try {
            return super.readLine();
        } catch (IOException e) {
            return null;
        }
    }
}
