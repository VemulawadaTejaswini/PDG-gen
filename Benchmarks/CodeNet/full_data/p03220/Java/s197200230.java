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
        ABC113_2 solver = new ABC113_2();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC113_2 {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();
            int T = in.nextInt();
            int A = in.nextInt();
            int ANS = 0;
            int diff_from_a = 2147483647;

            int evaluated[] = new int[N];


            for (int i = 0; i < N; i++) {
                int H = in.nextInt();
                int WK = (int) ((T * 1000) - H * 6);
                int cc = Math.abs(WK - (A * 1000));
                if (diff_from_a > cc) {
                    diff_from_a = cc;
                    ANS = i + 1;
                }
//            evaluated[i]= WK;
            }
        /*
        for (int i = 0; i < evaluated.length; i++) {
            if (evaluated[i] < A) {
                if (Math.abs(diff_from_a) >  Math.abs((A*1000) - evaluated[i])) {
                    diff_from_a = (int) Math.abs((A*1000) - evaluated[i]);
                    ANS = i + 1;
                }
            } else {
                // evaluated[i] >= A
                if (Math.abs(diff_from_a) >  Math.abs(evaluated[i]-(A*1000))) {
                    diff_from_a = (int) Math.abs(evaluated[i]-(A*1000));
                    ANS = i + 1;
                }
            }
        }
        */
/*
            if (A > 0)  {
                if (Math.abs(diff_from_a) > (int) Math.abs(A-WK)) {
                    diff_from_a = (int) Math.abs(A-WK);
                    ANS = i + 1;
                }
            } else {
                if (Math.abs(diff_from_a) > (int) Math.abs(A + WK)) {
                    diff_from_a = (int) Math.abs(A + WK);
                    ANS = i + 1;
                }
            }
*/
            /*
            if (diff_from_a < 0) {
                if (diff_from_a > WK) {
                    diff_from_a = (int) (A - (T - H * 0.006));
                    ANS = i + 1;
                }
            } else {
                if (diff_from_a > (int) (A-(T - H * 0.006))) {
                    diff_from_a = (int) (A - (T - H * 0.006));
                    ANS = i + 1;
                }
            }
            */
            //}
            out.println(ANS);
        }

    }
}

