import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.PrintStream;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DEqueue solver = new DEqueue();
        solver.solve(1, in, out);
        out.close();
    }

    static class DEqueue {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            if (true) {
                logMe("test");
                //test();
                solveMe(in, out);
                return;
            }
        /*    long res = solveOk(in, out);
            out.println(res);
            return;
        }
        solveMe(in, out);*/
        }

        private long solveMe(Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int k = in.nextInt();
            long v[] = new long[n];
            for (int i = 0; i < n; i++) {
                v[i] = in.nextInt();
            }

            return solveMeArr(v, k);


        }

        private long solveMeArr(long[] v, int k) {
            int n = v.length;
            long sum[] = new long[n];

            for (int i = 0; i < n; i++) {
                if (i > 0)
                    sum[i] = sum[i - 1];
                sum[i] += v[i];

            }

            long res = 0;
            for (int i = 0; i < n; i++)
                for (int j = i; j < n; j++) {
                    int remaining = k - (i + n - 1 - j);
                    if (remaining < 0)
                        continue;

                    long tmp = sum[n - 1] - sum[j];
                    if (i > 0)
                        tmp += sum[i - 1];
                    //logMe("BEFORE i="+i+";j="+j+";tmp="+tmp+";remaining="+remaining);
                    List<Long> arr = new ArrayList<>();
                    for (int l = 0; l < n; l++)
                        if (l < i || l > j)
                            arr.add(v[l]);
                    arr.sort(Long::compare);
                    for (int l = 0; l < remaining && l < arr.size(); l++) {
                        if (arr.get(l) < 0) {
                            tmp -= arr.get(l);
                        }
                    }
                    //logMe("i="+i+";j="+j+";tmp="+tmp);
                    res = Math.max(res, tmp);
                }
            return res;
        }

        void logMe(String msg) {
            System.err.println(msg);
        }

    }
}

