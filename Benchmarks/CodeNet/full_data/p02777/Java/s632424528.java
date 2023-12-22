import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

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
        abc154_a solver = new abc154_a();
        solver.solve(1, in, out);
        out.close();
    }

    static class abc154_a {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            String S = in.next();
            String T = in.next();
            int A = in.nextInt();
            int B = in.nextInt();
            String U = in.next();
            if (S.compareTo(U) == 0) {
                A--;
            }
            if (T.compareTo(U) == 0) {
                B--;
            }
            out.println(A + " " + B);
        }

    }
}

