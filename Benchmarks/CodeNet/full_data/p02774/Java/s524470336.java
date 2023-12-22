import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Comparator;
import java.util.ArrayList;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author silviase
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DPairs solver = new DPairs();
        solver.solve(1, in, out);
        out.close();
    }

    static class DPairs {
        ArrayList<Long> minus = new ArrayList<>();
        ArrayList<Long> plus = new ArrayList<>();
        long zero = 0;
        long n;
        long pos;
        long neg;

        public void solve(int testNumber, Scanner in, PrintWriter out) {

            n = in.nextLong();
            long k = in.nextLong();
            for (int i = 0; i < n; i++) {
                long x = in.nextLong();
                if (x == 0) {
                    zero++;
                } else if (x < 0) {
                    minus.add(-x);
                } else {
                    plus.add(x);
                }
            }

            neg = minus.size();
            pos = plus.size();

            minus.sort(Comparator.naturalOrder());
            plus.sort(Comparator.naturalOrder());

            // System.out.println(minus.size());
            // System.out.println(zero);
            // System.out.println(plus.size());

            long ng = -(long) 1e18;
            long ok = (long) 1e18;
            while (Math.abs(ok - ng) > 1) {
                long mid = (ok + ng) / 2;
                // out.println(mid + " " + f(mid));
                if (f(mid) >= k) {
                    ok = mid;
                } else {
                    ng = mid;
                }
            }

            out.println(ok);

        }

        long f(long key) {
            long res = 0;
            if (key < 0) {
                for (long mi : minus) {
                    int ng = -1;
                    int ok = (int) pos;
                    while (Math.abs(ok - ng) > 1) {
                        int mid = (ok + ng) / 2;
                        if (mi * plus.get(mid) >= Math.abs(key)) {
                            ok = mid;
                        } else {
                            ng = mid;
                        }
                    }
                    res += (plus.size() - ok);
                }
            } else {
                res += ((n * (n - 1)) / 2) - (pos * ((pos - 1) / 2)) - (neg * (neg - 1) / 2);
                for (int i = 0; i < neg; i++) {
                    int ng = i;
                    int ok = (int) neg;
                    long cmp = minus.get(i);
                    while (Math.abs(ok - ng) > 1) {
                        int mid = (ok + ng) / 2;
                        if (cmp * minus.get(mid) > key) {
                            ok = mid;
                        } else {
                            ng = mid;
                        }
                    }
                    res += (ng - i);
                }

                for (int i = 0; i < pos; i++) {
                    int ng = i;
                    int ok = (int) pos;
                    long cmp = plus.get(i);
                    while (Math.abs(ok - ng) > 1) {
                        int mid = (ok + ng) / 2;
                        if (cmp * plus.get(mid) > key) {
                            ok = mid;
                        } else {
                            ng = mid;
                        }
                    }
                    res += (ng - i);
                }
            }
            return res;
        }

    }
}

