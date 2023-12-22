import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
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
        BFrog2 solver = new BFrog2();
        solver.solve(1, in, out);
        out.close();
    }

    static class BFrog2 {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int ds = in.nextInt();
            int k = in.nextInt();
            int[] H = new int[ds];
            int[] res = new int[ds];
            for (int i = 0; i < ds; i++) H[i] = in.nextInt();
            Arrays.fill(res, -1);
            for (int i = H.length - 2; i >= 0; i--) {
                for (int x = 1; x <= k; x++) {
                    if (i < H.length - x) {
                        if (Math.abs(H[i] - H[i + x]) + res[i + x] + 1 < res[i] || res[i] == -1) {
                            res[i] = Math.abs(H[i] - H[i + x]) + res[i + x];
                            if (res[i] == -1) res[i] = 0;
                        }
                    } else if (res[i] == -1) res[i] = Integer.MAX_VALUE / 2;
                }
            }
            //if(res[0] >= Integer.MAX_VALUE / 2) res[0] = 0;
            if (res[0] != 0) res[0]++;
            out.println(res[0]);
        }

    }
}

