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
 * @author rizhiy
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int a = in.nextInt();
            int b = in.nextInt();
            char[][] k = new char[99][99];
            if (a < b) {
                a--;
                for (int i = 0; i < 99; i++) {
                    for (int j = 0; j < 99; j++) {
                        k[i][j] = '.';
                    }
                }
                int koni = 0;
                for (int i = 0; i < 99; i += 4) {
                    if (b <= 0 || a <= 0) break;
                    koni = i + 4;
                    for (int j = 0; j < 99; j += 4) {
                        if (b <= 0 || a <= 0) break;
                        for (int k1 = i; k1 <= i + 2; k1++) {
                            for (int k2 = j; k2 <= j + 2; k2++) {
                                k[k1][k2] = '#';
                            }
                        }
                        k[i + 1][j + 1] = '.';
                        b--;
                        a--;
                    }
                }
                for (int i = koni; i < 99; i += 2) {
                    if (b <= 0) break;
                    for (int j = 0; j < 99; j += 2) {
                        if (b <= 0) break;
                        k[i][j] = '#';
                        b--;
                    }
                }
            } else {
                b--;
                for (int i = 0; i < 99; i++) {
                    for (int j = 0; j < 99; j++) {
                        k[i][j] = '#';
                    }
                }
                int koni = 0;
                for (int i = 0; i < 99; i += 4) {
                    koni = i + 4;
                    if (b <= 0 || a <= 0) break;
                    for (int j = 0; j < 99; j += 4) {
                        if (b <= 0 || a <= 0) break;
                        for (int k1 = i; k1 <= i + 2; k1++) {
                            for (int k2 = j; k2 <= j + 2; k2++) {
                                k[k1][k2] = '.';
                            }
                        }
                        k[i + 1][j + 1] = '#';
                        b--;
                        a--;
                    }
                }
                for (int i = koni; i < 99; i += 2) {
                    if (a <= 0) break;
                    for (int j = 0; j < 99; j += 2) {
                        if (a <= 0) break;
                        k[i][j] = '.';
                        a--;
                    }
                }
            }
            out.println(99 + " " + 99);
            for (int i = 0; i < 99; i++) {
                for (int j = 0; j < 99; j++) {
                    out.print(k[i][j] + " ");
                }
                out.println();
            }
        }

    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

