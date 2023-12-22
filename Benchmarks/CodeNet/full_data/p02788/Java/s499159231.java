import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;

        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);

        Task solver = new Task();
        solver.solve(1, in, out);
        out.close();
    }
}

class Task {


    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int n = in.nextInt();
        long D = in.nextLong();
        long A = in.nextLong();
        long[] x = new long[n];
        long[] h = new long[n];
        Point[] points = new Point[n];
        for (int i = 0; i < n; i++) {
            x[i] = in.nextLong();
            h[i] = in.nextLong();
            h[i] = (h[i] + A - 1) / A;
            points[i] = new Point(x[i], h[i]);
        }
        Arrays.sort(points);
        int[] l = new int[n];
        int[] r = new int[n];
        int end = 0;
        for (int i = 0; i < n; i++) {
            while (end < n && points[end].x <= points[i].x + 2 * D) {
                end++;
            }
            l[i] = i;
            r[i] = end;
        }
        long[] a = new long[n + 1];
        Arrays.fill(a, 0);
        //for (int i = 0; i < n; i++) {
        //    a[l[i]] += h[i];
        //    a[r[i]] -= h[i];
        //}
        long ans = 0, cur = 0;
        for (int i = 0; i < n; i++) {
            cur += a[i];
            long H = points[i].h;
            if (cur < H) {
                a[l[i]] += H - cur;
                a[r[i]] -= H - cur;
                ans += H - cur;
                cur = H;
            }
        }
        out.println(ans);
    }

    class Point implements Comparable<Point> {
        long x;
        long h;

        public Point(long x, long h) {
            this.x = x;
            this.h = h;
        }

        public int compareTo(Point o) {
            return x < o.x ? -1 : 1;
        }
    }


}

class InputReader {

    private final BufferedReader reader;
    private StringTokenizer      tokenizer;

    public InputReader(InputStream stream){
        reader = new BufferedReader(new InputStreamReader(stream));
        tokenizer = null;
    }

    public String nextLine() {
        try {
            return reader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String next() {
        while (tokenizer == null || !tokenizer.hasMoreTokens()) {
            tokenizer = new StringTokenizer(nextLine());
        }
        return tokenizer.nextToken();
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
