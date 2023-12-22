import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Mirio
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FReader in = new FReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, FReader in, PrintWriter out) {
            int n = in.nextInt();
            int x = 0, y = 0, t = 0;

            while(n-- > 0) {
                int nt = in.nextInt();
                int nx = in.nextInt();
                int ny = in.nextInt();

                int diff = Math.abs(nx - x) + Math.abs(ny - y);
                if(diff > nt - t) {
                    out.println("No");
                    return;
                } else {
                    if((nt - t - diff) % 2 != 0) {
                        out.println("No");
                        return;
                    }
                }

                t = nt;
                x = nx;
                y = ny;
            }

            out.println("Yes");
        }

    }

    static class FReader {
        private BufferedReader  r;
        private String          line;
        private StringTokenizer st;
        private String          token;

        public FReader() {
            this(System.in);
        }

        public FReader(InputStream i) {
            r = new BufferedReader(new InputStreamReader(i));
        }

        public int nextInt() {
            return Integer.parseInt(nextToken());
        }

        private String peekToken() {
            if(token == null)
                try {
                    while(st == null || !st.hasMoreTokens()) {
                        line = r.readLine();
                        if(line == null) return null;
                        st = new StringTokenizer(line);
                    }
                    token = st.nextToken();
                } catch(IOException e) { }
            return token;
        }

        private String nextToken() {
            String ans = peekToken();
            token = null;
            return ans;
        }

    }
}

