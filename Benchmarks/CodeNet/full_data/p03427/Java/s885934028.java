import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author ZYCSwing
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskA solver = new TaskA();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskA {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            long n = in.nextLong();
            List<Integer> list = new ArrayList<>();

            while (n > 0) {
                list.add((int) (n % 10));
                n /= 10;
            }
            int sum = (list.size() - 1) * 9 + list.get(list.size() - 1);

            boolean ok = true;
            for (int i = 0; i < list.size() - 1; ++i)
                if (list.get(i) != 9) {
                    ok = false;
                    break;
                }
            if (!ok) sum--;
            out.println(sum);
        }

    }
}

