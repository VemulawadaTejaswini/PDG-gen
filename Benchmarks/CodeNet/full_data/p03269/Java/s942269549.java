import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

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
        DAllYourPathsAreDifferentLengths solver = new DAllYourPathsAreDifferentLengths();
        solver.solve(1, in, out);
        out.close();
    }

    static class DAllYourPathsAreDifferentLengths {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int l = in.nextInt();
            int tmp = 0x80000;
            int nodes = 20;
            while (tmp > 0) {
                if ((l & tmp) > 0) {
                    break;
                }
                tmp = tmp >> 1;
                nodes--;
            }
            out.print(nodes);
            out.print(' ');

            List<DAllYourPathsAreDifferentLengths.D> ans = new ArrayList<>();
            int w = (l & tmp) / 2;
            for (int i = 1; i < nodes; i++) {
                ans.add(new DAllYourPathsAreDifferentLengths.D(i, i + 1, 0));
                ans.add(new DAllYourPathsAreDifferentLengths.D(i, i + 1, w));
                w /= 2;
            }

            int g = (l & tmp) / 2;
            int k = 0;
            for (int i = 1; i < tmp; i *= 2) {
                if ((i & l) > 0) {
                    ans.add(new DAllYourPathsAreDifferentLengths.D(1, nodes - i + 1, tmp + k));
                    k += g;
                }
                g /= 2;
            }

            out.println(ans.size());
            for (DAllYourPathsAreDifferentLengths.D d : ans) {
                out.print(d.n1);
                out.print(' ');
                out.print(d.n2);
                out.print(' ');
                out.println(d.w);
            }
        }

        public static class D {
            int n1;
            int n2;
            int w;

            public D(int n1, int n2, int w) {
                this.n1 = n1;
                this.n2 = n2;
                this.w = w;
            }

        }

    }
}

