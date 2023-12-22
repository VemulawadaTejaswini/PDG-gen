import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Silviase
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CSuccessiveSubtraction solver = new CSuccessiveSubtraction();
        solver.solve(1, in, out);
        out.close();
    }

    static class CSuccessiveSubtraction {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            StringBuilder sb = new StringBuilder();
            int n = in.nextInt();
            int pr = 0;
            ArrayList<Integer> ar = new ArrayList<Integer>();
            for (int i = 0; i < n; i++) {
                ar.add(in.nextInt());
            }
            Collections.sort(ar);
            if (ar.get(0) > 0) {
                // all plus
                int res = ar.get(0);
                for (int i = 1; i < ar.size() - 1; i++) {
                    sb.append(res + " " + ar.get(i) + "\n");
                    res -= ar.get(i);
                }
                sb.append(ar.get(ar.size() - 1) + " " + res + "\n");
                pr = ar.get(ar.size() - 1) - res;
            } else if (ar.get(ar.size() - 1) < 0) {
                // all minus
                int res = ar.get(ar.size() - 1);
                for (int i = 0; i < ar.size() - 1; i++) {
                    sb.append(res + " " + ar.get(i) + "\n");
                    res -= ar.get(i);
                }
                pr = res;
            } else {
                // ar(0) < 0
                // ar(size-1) > 0
                int high = ar.get(ar.size() - 1);
                int low = ar.get(0);
                for (int i = 1; i < ar.size() - 1; i++) {
                    if (ar.get(i) < 0) {
                        sb.append(high + " " + ar.get(i) + "\n");
                        high -= ar.get(i);
                    } else {
                        sb.append(low + " " + ar.get(i) + "\n");
                        low -= ar.get(i);
                    }
                }
                pr = high - low;
                sb.append(high + " " + low + "\n");
            }
            String ans = new String(sb);
            out.println(pr);
            out.print(ans);

        }

    }
}

