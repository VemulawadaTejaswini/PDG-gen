import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Scanner;
import java.util.ArrayDeque;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Aeroui
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
            ArrayDeque<Integer> q = new ArrayDeque<>();
            boolean f = false;
            for (int i = 0; i < n; ++i) {
                if (f) q.addFirst(in.nextInt());
                else q.addLast(in.nextInt());

                f = !f;
            }

            Iterator<Integer> it;
            if (n % 2 == 0) it = q.iterator();
            else it = q.descendingIterator();

            while (it.hasNext()) {
                out.print(it.next() + " ");
            }


        }

    }
}

