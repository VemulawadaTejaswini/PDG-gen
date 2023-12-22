import java.io.*;
import java.util.*;

public class Main {

    final boolean ONLINE_JUDGE = System.getProperty("ONLINE_JUDGE") != null;
    BufferedReader in;
    PrintWriter out;
    StringTokenizer tok = new StringTokenizer("");

    public static void main(String[] args) {
        new Main().run();
        // Sworn to fight and die
    }

    void init() throws FileNotFoundException {
        if (1 > 0) {
            in = new BufferedReader(new InputStreamReader(System.in));
            out = new PrintWriter(System.out);
        } else {
            in = new BufferedReader(new FileReader("input.txt"));
            out = new PrintWriter("output.txt");
        }
    }

    String readString() throws IOException {
        while (!tok.hasMoreTokens()) {
            tok = new StringTokenizer(in.readLine());
        }
        return tok.nextToken();
    }

    int readInt() throws IOException {
        return Integer.parseInt(readString());
    }

    long readLong() throws IOException {
        return Long.parseLong(readString());
    }

    double readDouble() throws IOException {
        return Double.parseDouble(readString());
    }

    public void run() {
        try {
            long t1 = System.currentTimeMillis();
            init();
            solve();
            out.close();
            long t2 = System.currentTimeMillis();
            System.err.println("Time = " + (t2 - t1));
        } catch (Exception e) {
            e.printStackTrace(System.err);
            System.exit(-1);
        }
    }

    public long check(int[] a, long start) {
        long current = start;
        for (int i = 0; i < a.length; i++) {
            if (current % a[i] != 0) {
                current = (current / a[i]) * a[i];
            }
        }
        return current;
    }

    public void solve() throws IOException {
        int k = readInt();
        int[] a = new int[k];
        long max = -1;
        for (int i = 0; i < k; i++) {
            a[i] = readInt();
            max = Math.max(max, a[i]);
        }

        if (a[k - 1] > 2) {
            out.print(-1);
            return;
        }

        long left = max;
        long right = Long.MAX_VALUE - 100;

        for (int zz = 0; zz < 150; zz++) {
            long mid = (left + right) / 2;
            long result = check(a, mid);
            if (result > 2) {
                right = mid - 1;
            } else {
                left = mid;
            }
        }

        long mmax = (right + left) / 2;


        left = max;
        right = Long.MAX_VALUE - 100;

        for (int zz = 0; zz < 150; zz++) {
            long mid = (left + right) / 2;
            long result = check(a, mid);
            if (result < 2) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        long mmin = (right + left) / 2;

        if (check(a, mmin - 1) == 2) {
            mmin--;
        }
        if (check(a, mmax + 1) == 2) {
            mmax++;
        }

        if (mmax < mmin) {
            out.print(-1);
            return;
        }
        out.print(mmin + " " + mmax);
    }
}