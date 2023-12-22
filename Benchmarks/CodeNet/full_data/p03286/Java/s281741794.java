import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static void divmod (int[] vi, int a, int b) {
        int q;
        int r;
        if (b < 0) {
            b = -b;
            a = -a;
        }
        q = 0;
        r = a;
        if (r > 0) {
            // long start = System.currentTimeMillis();
            while (r - b >= 0) {
                // long start1 = System.currentTimeMillis();
                q += 1;
                r -= b;
                // long end1 = System.currentTimeMillis();
                // System.out.println ("2-0:" + (end1 - start1) + "ms");
            }
            // long end = System.currentTimeMillis();
            // System.out.println ("2:" + (end - start) + "ms");
        } else if (r < 0) {
            // long start = System.currentTimeMillis();
            do {
                q -= 1;
                r += b;
            } while (r < 0);
            // long end = System.currentTimeMillis();
            // System.out.println ("3:" + (end - start) + "ms");
        }
        vi[0] = q;
        vi[1] = r;
    }
    public static void main (String[] args) throws IOException {
        final String s;
        try (BufferedReader reader =
                 new BufferedReader (new InputStreamReader (System.in))) {
            s = reader.readLine();
        }
        int[] vi           = new int[2];
        int           N    = Integer.parseInt (s);
        StringBuilder sb   = new StringBuilder();
        int           base = 2;
        while (0 != N) {
            // base = 3 でうまくいかない
            // 例えば 7
            // base = 2 は OK
            // sb.insert (0, String.valueOf (Math.abs (N % base)));
            // N -= Math.abs (N % base);
            // N /= -base;

            // base = 3 でもうまくいく
            // long start = System.currentTimeMillis();
            divmod (vi, N, base);
            // long end = System.currentTimeMillis();
            // System.out.println ("1:" + (end - start) + "ms");
            sb.insert (0, String.valueOf (vi[1]));
            N -= vi[1];
            // start = System.currentTimeMillis();
            divmod (vi, N, base);
            // end = System.currentTimeMillis();
            // System.out.println ("4:" + (end - start) + "ms");
            N = -vi[0];
        }
        if (sb.length() == 0) sb.append ("0");
        System.out.println (sb);
    }
}
