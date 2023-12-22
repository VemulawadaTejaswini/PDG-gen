import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author ky112233
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        BQualificationSimulator solver = new BQualificationSimulator();
        solver.solve(1, in, out);
        out.close();
    }

    static class BQualificationSimulator {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int a = in.nextInt();
            int b = in.nextInt();
            String str = in.next();
            int cnt = 0;
            String[] pass = new String[n];
            int rank = 1;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 'a') {
                    if (cnt < a + b) {
                        cnt++;
                        pass[i] = "Yes";
                    } else pass[i] = "No";
                } else if (str.charAt(i) == 'b') {
                    if (cnt < a + b && rank <= b) {
                        cnt++;
                        rank++;
                        pass[i] = "Yes";
                    } else pass[i] = "No";
                } else pass[i] = "No";
            }
            for (int i = 0; i < n; i++) {
                out.println(pass[i]);
            }
        }

    }
}

