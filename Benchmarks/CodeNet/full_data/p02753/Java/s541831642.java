import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author EDGE
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskAtcoder158A solver = new TaskAtcoder158A();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskAtcoder158A {
        public void solve(int testNumber, FastReader in, PrintWriter out) {

            char[] a = in.nextLine().toCharArray();
            int x = 0, y = 0;
            for (char t : a
            ) {
                if (t == 'A')
                    x++;
                else y++;

            }
            if (x != 0 && y != 0)
                out.println("Yes");
            else
                out.println("No");

        }

    }

    static class FastReader {
        BufferedReader br;

        public FastReader(InputStream inputStream) {
            br = new BufferedReader(new
                    InputStreamReader(inputStream));
        }

        public String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

    }
}

