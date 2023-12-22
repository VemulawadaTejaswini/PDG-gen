
import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.geom.Point2D;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] $) {
        int n = sc.nextInt();
        long[] x=new long[n];
        long[] y=new long[n];
        for (int i = 0; i < n; i++) {
            x[i]=sc.nextLong();
            y[i]=sc.nextLong();
        }
        HashSet<Long> P = new HashSet<>();
        HashSet<Long> Q = new HashSet<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                P.add(x[i]-x[j]);
                Q.add(y[i]-y[j]);
            }
        }
        int ans = n;
        for (long p : P) {
            for (long q : Q) {
                int t = 0;
                if (p == 0 && q == 0) continue;
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        if(i==j)continue;
                        if (x[i] - x[j] == p && y[i] - y[j]== q) t++;
                    }
                }
                if(ans>n-t)ans=n-t;
            }
        }
        out.println(ans);
        out.close();
    }

    static PrintWriter out = new PrintWriter(System.out);

    static class sc {
        static Scanner s = new Scanner(System.in);

        static String next() {
            return s.next();
        }

        static String nextLine() {
            return s.nextLine();
        }

        static int nextInt() {
            return Integer.parseInt(s.next());
        }

        static long nextLong() {
            return Long.parseLong(s.next());
        }

        static double nextDouble() {
            return Double.parseDouble(s.next());
        }

        static boolean hasNext() {
            return s.hasNext();
        }

        static boolean hasNextInt() {
            return s.hasNextInt();
        }

    }

}
