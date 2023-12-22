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
        AFrog1 solver = new AFrog1();
        solver.solve(1, in, out);
        out.close();
    }

    static class AFrog1 {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int ds = in.nextInt();
            int[] H = new int[ds];
            int[] res = new int[ds];
            for (int i = 0; i < ds; i++) H[i] = in.nextInt();
            for (int i = H.length - 2; i >= 0; i--) {
                int v1 = (i < H.length - 1) ? Math.abs(H[i] - H[i + 1]) + res[i + 1] : Integer.MAX_VALUE / 2;
                int v2 = (i < H.length - 2) ? Math.abs(H[i] - H[i + 2]) + res[i + 2] : Integer.MAX_VALUE / 2;
                res[i] = Math.min(v1, v2);
            }
            out.println(res[0]);
        }

    }
}

