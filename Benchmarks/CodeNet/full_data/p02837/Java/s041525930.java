import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Eric
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskC_147 solver = new TaskC_147();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC_147 {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int[] a = new int[n];
            int[][] x = new int[n][n - 1];
            int[][] y = new int[n][n - 1];

            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
                for (int j = 0; j < a[i]; j++) {
                    x[i][j] = in.nextInt() - 1;
                    y[i][j] = in.nextInt();
                }
            }

            int options = (int) Math.pow(2, n);
            int nbHonests = 0;
            int maxHonests = 0;
            for (int option = 0; option < options; option++) {
                nbHonests = 0;
                outer:
                for (int i = 0; i < n; i++) {
                    boolean isHonest = (option & (1 << i)) != 0;
                    //System.err.println("[" + i + "] isHonest = " + isHonest + "; option = " + option + " (1<<i)" + (1<<i));
                    if (!isHonest)
                        continue;
                    nbHonests++;
                    for (int j = 0; j < a[i]; j++) {
                        boolean shouldBeHonest = (option & (1 << x[i][j])) != 0;
                        //System.err.println("[" + i + ", " + x[i][j] + "] shouldBeHonest = " + shouldBeHonest + " ; option = " + option + "x[i][j] = " + x[i][j]);
                        if (shouldBeHonest != (y[i][j] == 1)) {
                            nbHonests = 0;
                            break outer;
                        }
                    }
                }
                maxHonests = Math.max(maxHonests, nbHonests);
            }
            out.println(maxHonests);
        }

    }
}

