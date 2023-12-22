import java.io.*;
import java.math.*;
import java.util.*;

class Main {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(sc.nextLine());
        long[] xs = new long[n];
        long[] ys = new long[n];
        int odd = 0, even = 0;
        for (int i = 0; i < n; i++) {
            String[] xy = sc.nextLine().split(" +");
            xs[i] = Long.parseLong(xy[0]);
            ys[i] = Long.parseLong(xy[1]);
            if ((xs[i] + ys[i]) % 2 == 0)  {
                even++;
                xs[i]--;
            }
            else odd++;
        }

        if (odd * even != 0) {
            System.out.println(-1);
        }
        else {
            System.out.println(even > 0 ? 32 : 31);
            if (even > 0) System.out.print("1 ");
            for (long bit = 1; bit < (1L << 31); bit <<= 1)
                System.out.printf("%d%c", bit, bit == (1 << 30) ? '\n' : ' ');

            for (int i = 0; i < n; i++) {
                long u = xs[i] + ys[i];
                long v = xs[i] - ys[i];

                long maskU = (u + (1 << 31) - 1) >> 1;
                long maskV = (v + (1 << 31) - 1) >> 1;

                long x = 0, y = 0;
                if (even > 0) {
                    System.out.print("R");
                    x++;
                }
                for (long bit = 1; bit < (1L << 31); bit <<= 1) {
                    if ((maskU & bit) == 0 && (maskV & bit) == 0) {
                        System.out.print("L");
                        x -= bit;
                    }
                    else if ((maskU & bit) != 0 && (maskV & bit) != 0) {
                        System.out.print("R");
                        x += bit;
                    }
                    else if ((maskU & bit) == 0 && (maskV & bit) != 0) {
                        System.out.print("D");
                        y -= bit;
                    }
                    else if ((maskU & bit) != 0 && (maskV & bit) == 0) {
                        System.out.print("U");
                        y += bit;
                    }
                }
                System.out.println();
                //System.out.printf("x=%d y=%d\n", x, y);
            }
        }
        sc.close();
    }
}