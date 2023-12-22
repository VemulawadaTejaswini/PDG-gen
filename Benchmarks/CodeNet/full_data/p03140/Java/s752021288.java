import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author hakamada
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Nikkei_2 solver = new Nikkei_2();
        solver.solve(1, in, out);
        out.close();
    }

    static class Nikkei_2 {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();
            String[] A = in.next().toUpperCase().split("");
            String[] B = in.next().toUpperCase().split("");
            String[] C = in.next().toUpperCase().split("");

            int count = 0;
            for (int i = 0; i < N; i++) {
                char cA = A[i].charAt(0);
                char cB = B[i].charAt(0);
                char cC = C[i].charAt(0);

                if ((cA == cB) && (cB == cC)) {
                } else if ((cA != cB) && (cB != cC) && (cA != cC)) {
                    count += 2;
                } else {
                    count++;
                }

            }
            out.println(count);
        }

    }
}

