import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.StringReader;
import java.io.IOException;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Denis Nedelyaev
 */
public class Main {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastScanner in = new FastScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        AtC solver = new AtC(in, out);
        solver.solve(1);
        out.close();
    }

    static class AtC {
        private final FastScanner in;
        private final PrintWriter out;

        public AtC(FastScanner in, PrintWriter out) {
            this.in = in;
            this.out = out;
        }

        public void solve(int testNumber) throws IOException {
            int rows = in.nextInt();
            int cols = in.nextInt();

            char[][] union = new char[rows][];
            for (int i = 0; i < rows; i++) {
                union[i] = in.next().toCharArray();
            }

            char[][] red = new char[rows][cols];
            char[][] blue = new char[rows][cols];

            for (int r = 0; r < rows; r++) {
                for (int c = 0; c < cols; c++) {
                    red[r][c] = union[r][c];
                    blue[r][c] = union[r][c];
                }
            }

            Arrays.fill(red[0], '#');
            Arrays.fill(blue[rows - 1], '#');

            for (int r = 1; r + 1 < rows; r++) {
                for (int c = 0; c < cols; c += 2) {
                    red[r][c] = '#';
                }
                for (int c = 1; c < cols; c += 2) {
                    blue[r][c] = '#';
                }
            }

            for (int r = 0; r < rows; r++) {
                for (int c = 0; c < cols; c++) {
                    out.print(red[r][c]);
                }
                out.println();
            }
            out.println();
            for (int r = 0; r < rows; r++) {
                for (int c = 0; c < cols; c++) {
                    out.print(blue[r][c]);
                }
                out.println();
            }
        }

    }

    static class FastScanner {
        private final BufferedReader br;
        private String line;
        private int pos;

        public FastScanner(String s) throws IOException {
            this(new StringReader(s));
        }

        public FastScanner(InputStream is) throws IOException {
            this(new InputStreamReader(is, "UTF-8"));
        }

        public FastScanner(Reader reader) throws IOException {
            this(new BufferedReader(reader));
        }

        public FastScanner(BufferedReader reader) throws IOException {
            br = reader;
            line = br.readLine();
            pos = 0;
        }

        public String next() throws IOException {
            if (!skipWhitespace()) {
                return null;
            }

            int start = pos;

            while (pos < line.length()) {
                char c = line.charAt(pos);

                if (c == ' ' || c == '\t') {
                    break;
                }

                pos++;
            }

            return line.substring(start, pos);
        }

        public int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        private boolean skipWhitespace() throws IOException {
            while (line != null) {
                while (pos < line.length()) {
                    char c = line.charAt(pos);

                    if (c != ' ' && c != '\t') {
                        return true;
                    }

                    pos++;
                }

                line = br.readLine();
                pos = 0;
            }

            return false;
        }

    }
}

