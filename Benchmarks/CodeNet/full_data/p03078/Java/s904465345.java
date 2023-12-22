import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;
import java.util.Comparator;
import java.util.Collections;
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
        D solver = new D();
        solver.solve(1, in, out);
        out.close();
    }

    static class D {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int X = in.nextInt();
            int Y = in.nextInt();
            int Z = in.nextInt();
            int K = in.nextInt();

            List<Long> A = new ArrayList<>();
            List<Long> B = new ArrayList<>();
            List<Long> C = new ArrayList<>();
            for (int i = 0; i < X; i++) {
                A.add(in.nextLong());
            }
            for (int i = 0; i < Y; i++) {
                B.add(in.nextLong());
            }
            for (int i = 0; i < Z; i++) {
                C.add(in.nextLong());
            }
            Collections.sort(A, Comparator.reverseOrder());
            Collections.sort(B, Comparator.reverseOrder());
            Collections.sort(C, Comparator.reverseOrder());

            List<Long> ret = new ArrayList<>();
            for (int i = 0; i < A.size(); i++) {
                for (int j = 0; j < B.size(); j++) {
                    for (int k = 0; k < C.size(); k++) {
                        if (i + j + k + 3 <= K) {
                            ret.add(A.get(i) + B.get(j) + C.get(k));
                        }
                    }
                }
            }
            Collections.sort(ret, Collections.reverseOrder());
            for (int i = 0; i < K; i++) {
                out.println(ret.get(i));
            }
        }

    }
}

