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
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();

            String[] result = new String[n];
            Arrays.fill(result, "0");

            int keta;
            String num;
            boolean flag = true;
            for (int i = 0; i < m; i++) {
                keta = in.nextInt() - 1;
                num = in.next();

                if (keta == 0 && num.equals("0") && n > 1) {
                    flag = false;
                    break;
                }
                if (result[keta].equals(num)) {
                    continue;
                }
                if (!result[keta].equals("0")) {
                    flag = false;
                    break;
                }
                result[keta] = num;
            }

            if (flag) {
                if (result[0].equals("0") && n != 1) {
                    result[0] = "1";
                }
                out.append(String.join("", result));
            } else {
                out.append("-1");
            }
        }

    }
}

