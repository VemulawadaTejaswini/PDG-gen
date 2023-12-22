import java.io.IOException;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.io.PrintWriter;

@SuppressWarnings("unchecked")
public class Main {
    static long f(int x, int y) {
        long ret = Long.MAX_VALUE;
        for (int i = 0; i < x; i++) {
            int x2 = (x - i) / 2;
            int x3 = x - i - x2;
            long xmin = (long)Math.min(i, x2) * y;
            long xmax = (long)Math.max(i, x3) * y;
            long xdiv = xmax - xmin;

            int y2 = y / 2;
            int y3 = y - y2;
            long ymin = (long)Math.min((long)i * y, (long)(x - i) * y2);
            long ymax = (long)Math.max((long)i * y, (long)(x - i) * y3);
            long ydiv = ymax - ymin;

            ret = Math.min(ret, Math.min(xdiv, ydiv));
        }
        return ret;
    }

    public static void main(String[] args) throws IOException {
        final String s;

        try (
            BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in))) {
            s = reader.readLine();
        }

        PrintWriter out = new PrintWriter(System.out);

        final String[] sl = s.split(" ");
        int H = Integer.parseInt(sl[0]);
        int W = Integer.parseInt(sl[1]);

        long tate = f(H, W);
        long yoko = f(W, H);

        out.println(Math.min(tate, yoko));

        out.flush();
    }
}
