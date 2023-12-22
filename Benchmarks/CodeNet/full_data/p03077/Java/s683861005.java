import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    private static long n;

    // 09:06-
    public static void main(String[] args) throws Exception {
        try (BufferedInputStream in = new BufferedInputStream(System.in);
             PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out))) {

            Scanner sc = new Scanner(in);

            n = sc.nextLong();
            long[] xs = new long[5];
            for (int i = 0; i < xs.length; i++) xs[i] = sc.nextLong();

            out.println(doit(xs, xs.length - 1));
        }
    }

    private static long doit(long[] xs, int i) {
        long cur = f(xs[i]);
        if (i == 0) return cur;

        long prev = doit(xs, i - 1);
        if (prev > cur) {
            return prev + 1;
        } else {
//            return cur + i - 1;
            return cur + i;
        }
    }

    private static long f(long x) {
        return (n + (x - 1)) / x;
    }
}
