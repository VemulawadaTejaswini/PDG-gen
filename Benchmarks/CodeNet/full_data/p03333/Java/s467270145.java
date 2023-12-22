import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Comparator;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author mikit
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CIntervalGame solver = new CIntervalGame();
        solver.solve(1, in, out);
        out.close();
    }

    static class CIntervalGame {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            CIntervalGame.Per[] l = new CIntervalGame.Per[n];
            CIntervalGame.Per[] r = new CIntervalGame.Per[n];
            int li = 0, ri = 0;
            boolean[] u = new boolean[n];
            for (int i = 0; i < n; i++) {
                CIntervalGame.Per p = new CIntervalGame.Per(in.nextInt(), in.nextInt());
                l[i] = p;
                r[i] = p;
            }
            Arrays.sort(l, Comparator.comparing(p -> -p.l));
            Arrays.sort(r, Comparator.comparing(p -> p.r));
            int takahashi = 0;
            long d = 0;
            boolean migi = Math.abs(l[0].l) >= Math.abs(r[0].r);
            for (int i = 0; i < n; i++) {
                if (migi) {
                    CIntervalGame.Per p;
                    while ((p = l[li]).used) {
                        li++;
                    }
                    p.used = true;
                    if (p.l < takahashi) {
                        if (takahashi <= p.r) {
                            continue;
                        } else {
                            d += takahashi - p.r;
                            takahashi = p.r;
                        }
                    } else {
                        migi = false;
                        d += p.l - takahashi;
                        takahashi = p.l;
                    }
                } else {
                    CIntervalGame.Per p;
                    while ((p = r[ri]).used) {
                        ri++;
                    }
                    p.used = true;
                    if (p.r > takahashi) {
                        if (takahashi >= p.l) {
                            continue;
                        } else {
                            d += p.l - takahashi;
                            takahashi = p.l;
                        }
                    } else {
                        migi = true;
                        d += takahashi - p.r;
                        takahashi = p.r;
                    }
                }
            }
            d += Math.abs(takahashi);
            out.println(d);
        }

        static class Per {
            int l;
            int r;
            boolean used = false;

            Per(int l, int r) {
                this.l = l;
                this.r = r;
            }

        }

    }
}

