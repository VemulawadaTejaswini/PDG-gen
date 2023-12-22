import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.PrintStream;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author teiwa
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        String AC_STRING = "AC";

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();
            int Q = in.nextInt();
            String S = in.next();
            int[] startArray = new int[Q];
            int[] endArray = new int[Q];
            for (int i = 0; i < Q; i++) {
                startArray[i] = in.nextInt();
                endArray[i] = in.nextInt();
            }

            List<Integer> countSum = new ArrayList<>();
            for (int i = 0; i < AC_STRING.length() - 1; i++) {
                countSum.add(0);
            }
            // make pos list

            String target = S;
            int counter = 0;
            for (int j = AC_STRING.length() - 1; j < target.length(); j++) {
                if (target.substring(j - AC_STRING.length() + 1, j + 1).equals(AC_STRING)) {
                    counter++;
                }
                countSum.add(counter);
            }
            //System.out.println(countSum);
            // count
            for (int i = 0; i < Q; i++) {
                out.println(countSum.get(endArray[i] - 1) - countSum.get(startArray[i] - 1));
            }
        }

    }
}

