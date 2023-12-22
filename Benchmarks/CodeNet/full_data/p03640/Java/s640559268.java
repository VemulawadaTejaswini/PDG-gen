import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author OmarYasser
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        public void solve(int testNumber, Scanner sc, PrintWriter out) {
            int n = sc.nextInt(), m = sc.nextInt();
            int[][] res = new int[n][m];
            int i = 0, j = 0, num = 1, parity = 0;
            int N = sc.nextInt();
            while (N-- > 0) {
                int a = sc.nextInt();
                while (a-- > 0) {
                    res[i][j] = num;
                    if (parity == 0) {
                        j++;
                        if (j == m) {
                            parity = 1;
                            j = m - 1;
                            i++;
                        }
                    } else {
                        j--;
                        if (j == -1) {
                            parity = 0;
                            j = 0;
                            i++;
                        }
                    }
                }
                num++;
            }
            for (int r = 0; r < n; r++) {
                for (int c = 0; c < m; c++) {
                    if (c > 0) out.print(" ");
                    out.print(res[r][c]);
                }
                out.println();
            }
        }

    }

    static class Scanner {
        StringTokenizer st;
        BufferedReader br;

        public Scanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }

        public Scanner(FileReader f) {
            br = new BufferedReader(f);
        }

        public String next() {
            while (st == null || !st.hasMoreTokens())
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (Exception e) {
                }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

