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
        abc155_b solver = new abc155_b();
        solver.solve(1, in, out);
        out.close();
    }

    static class abc155_b {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();
            boolean ret = true;
            for (int i = 0; i < N; i++) {
                int a = in.nextInt();
                if ((a % 2) == 0) {
                    if ((a % 3) == 0 || (a % 5) == 0) {
                        ret = true;
                    } else {
                        ret = false;
                        break;
                    }
                }
            }
            if (ret) {
                out.println("APPROVED");
            } else {
                out.println("DENIED");
            }
        }

    }
}

