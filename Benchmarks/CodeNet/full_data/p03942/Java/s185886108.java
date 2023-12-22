import java.io.*;
import java.util.*;

public class Main {
    private static boolean debug = false;
    private static boolean elapsed = false;

    private void solve(Scanner sc, PrintWriter out) {
        int N = sc.nextInt();
        sc.nextLine();
        StringBuilder s = new StringBuilder(sc.nextLine());
        StringBuilder t = new StringBuilder(sc.nextLine());

        int[] n = new int[N];

        if (s.equals(t)) {
            out.println(0);
        } else {
            for (int i = N - 1; i > 0; --i) {
                if (t.charAt(i) == s.charAt(i)) {
                    n[i] = 0;
                } else {
                    for (int j = i - 1; j >= 0; --j) {
                        if (t.charAt(i) == t.charAt(j)) {
                            ++n[i];
                        }
                    }
                }
            }

            int max = 0;
            for (int i = 0; i < N; ++i) {
                if (max < n[i]) {
                    max = n[i];
                }
            }

            out.println(max);
        }
    }
    /*
     * 10^10 > Integer.MAX_VALUE = 2147483647 > 10^9
     * 10^19 > Long.MAX_VALUE = 9223372036854775807L > 10^18
     */
    public static void main(String[] args) {
        long S = System.currentTimeMillis();

        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        new Main().solve(sc, out);
        out.flush();

        long G = System.currentTimeMillis();
        if (elapsed) {
            System.err.println((G - S) + "ms");
        }
    }
}