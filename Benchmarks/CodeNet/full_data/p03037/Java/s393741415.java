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
        ABC_c solver = new ABC_c();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC_c {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();
            int M = in.nextInt();
            boolean card[] = new boolean[N + 1];

            int minl = 0;
            int maxr = N;


            for (int i = 0; i < M; i++) {
                int L = in.nextInt();
                int R = in.nextInt();

                if (minl < L) {
                    minl = L;
                }
                if (maxr > R) {
                    maxr = R;
                }
            /*

            for (int j = L; j <= R; j++) {
                boolean wk = card[j];

                if (wk==)

                if ((L <= j)&&(R >=j)) {
                    card[j] = card[j];
                }else {
                    card[j] = true;
                }
            }
            */

            }
        /*
        int count = 0;
        for (boolean val : card) {
            if (!val) {
                count++;
            }
        }
        */
            out.println(maxr - minl + 1);
        }

    }
}

