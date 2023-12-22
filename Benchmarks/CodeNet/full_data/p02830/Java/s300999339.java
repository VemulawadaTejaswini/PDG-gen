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
        TaskBB solver = new TaskBB();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskBB {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            String a = in.next();
            String b = in.next();
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < n; i++) {
                sb.append(a.charAt(i));
                sb.append(b.charAt(i));
            }
            out.println(sb.toString());
        }

    }
}

