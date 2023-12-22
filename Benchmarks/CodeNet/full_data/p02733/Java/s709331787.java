import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.InputStream;

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
        EDividingChocolate solver = new EDividingChocolate();
        solver.solve(1, in, out);
        out.close();
    }

    static class EDividingChocolate {
        int[][] mat;
        int[][] aux;
        int N;
        int M;
        int k;

        public void preProcess() {
            for (int i = 0; i < N; i++)
                aux[0][i] = mat[0][i];
            for (int i = 1; i < M; i++)
                for (int j = 0; j < N; j++)
                    aux[i][j] = mat[i][j] +
                            aux[i - 1][j];
            for (int i = 0; i < M; i++)
                for (int j = 1; j < N; j++)
                    aux[i][j] += aux[i][j - 1];
        }

        public int sumQuery(int tli, int tlj, int rbi, int rbj) {
            int res = aux[rbi][rbj];
            if (tli > 0)
                res = res - aux[tli - 1][rbj];
            if (tlj > 0)
                res = res - aux[rbi][tlj - 1];
            if (tli > 0 && tlj > 0)
                res = res + aux[tli - 1][tlj - 1];
            return res;
        }

        public void solve(int testNumber, Scanner sc, PrintWriter pw) {
            M = sc.nextInt();
            N = sc.nextInt();
            k = sc.nextInt();
            mat = new int[M][N];
            aux = new int[M][N];
            for (int i = 0; i < M; i++) {
                String temp = sc.next();
                for (int j = 0; j < N; j++)
                    mat[i][j] = temp.charAt(j) - '0';
            }
            preProcess();
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < 1 << M; i++) {
                min = Math.min(min, getMin(i) + Integer.bitCount(i));
            }
            pw.println(min);
        }

        private int getMin(int msk) {
            int c = 0;
            int last = 0;
            for (int i = 0; i < N; i++) {
                boolean f = true;
                int lastRow = 0;
                if (msk == 0) {
                    f = sumQuery(0, 0, M - 1, i) <= k;
                } else {
                    for (int j = 0; j < M; j++) {
                        if ((msk & 1 << j) != 0) {
                            if (sumQuery(lastRow, last, j, i) > k) {
                                f = false;
                                break;
                            }
                            lastRow = j + 1;
                        }
                    }
                }
                if (!f || sumQuery(lastRow, last, M - 1, i) > k) {
                    c++;
                    if (i == last)
                        return (int) 1e9;
                    last = i;
                    i--;
                }
            }
            return c;
        }

    }

    static class Scanner {
        StringTokenizer st;
        BufferedReader br;

        public Scanner(FileReader r) {
            br = new BufferedReader(r);
        }

        public Scanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }

        public String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

