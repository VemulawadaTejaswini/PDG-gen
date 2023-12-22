import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.PrintStream;
import java.util.Scanner;

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

            for (int i = 0; i < Q; i++) {
                String target = S.substring(startArray[i] - 1, endArray[i]);
                getFrequencyOfAC(target, out);
            }
        }

        private void getFrequencyOfAC(String target, PrintWriter out) {
            int counter = 0;
            for (int i = 0; i < target.length() - AC_STRING.length() + 1; i++) {
                System.out.println(target.substring(i, i + 2));
                if (target.substring(i, i + 2).equals(AC_STRING)) {
                    counter++;
                }
            }
            out.println(counter);
        }

    }
}

