import java.util.*;
import java.io.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] $) {
        int n=sc.nextInt(),k=sc.nextInt();
        double ans=0;
        for (int i = 1; i <= n; i++) {
            int t=(i-1+k)/i;
            int l=Integer.toString(t,2).length();
            int tail=Integer.numberOfTrailingZeros(t);
            int c=tail==l-1?tail:l;
            ans+=pow(0.5,c);
        }
        out.println(ans/n);
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
    }
}