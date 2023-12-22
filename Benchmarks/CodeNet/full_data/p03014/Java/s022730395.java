import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author /\
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DLamp solver = new DLamp();
        solver.solve(1, in, out);
        out.close();
    }

    static class DLamp {
        public void solve(int testNxumber, Scanner in, PrintWriter out) {
            int h = in.nextInt();
            int w = in.nextInt();
            char[][] grid = new char[h][w];
            for (int i = 0; i < h; i++) {
                grid[i] = in.nextLine().toCharArray();
            }
            int[][] byRow = new int[h][w];
            int[][] byCol = new int[h][w];
            List<Integer>[] rowIdxs = new List[h];
            for (int i = 0; i < h; i++) {
                rowIdxs[i] = new ArrayList<>();
                rowIdxs[i].add(-1);
                for (int j = 0; j < w; j++) {
                    if (grid[i][j] == '#') {
                        rowIdxs[i].add(j);
                    }
                }
                rowIdxs[i].add(w);
            }
            List<Integer>[] colIdxs = new List[w];
            for (int j = 0; j < w; j++) {
                colIdxs[j] = new ArrayList<>();
                colIdxs[j].add(-1);
                for (int i = 0; i < h; i++) {
                    if (grid[i][j] == '#') {
                        colIdxs[j].add(i);
                    }
                }
                colIdxs[j].add(h);
            }
            for (int i = 0; i < h; i++) {
                int temp = 0;
                for (int j = 0; j < w; j++) {
                    if (grid[i][j] == '#') {
                        temp++;
                    } else {
                        byRow[i][j] = rowIdxs[i].get(temp + 1) - rowIdxs[i].get(temp) - 1;
                    }
                }
            }
            for (int j = 0; j < w; j++) {
                int temp = 0;
                for (int i = 0; i < h; i++) {
                    if (grid[i][j] == '#') {
                        temp++;
                    } else {
                        byCol[i][j] = colIdxs[j].get(temp + 1) - colIdxs[j].get(temp) - 1;
                    }
                }
            }
            int res = 0;
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if (grid[i][j] != '#') {
                        res = Math.max(byRow[i][j] + byCol[i][j] - 1, res);
//                    out.println(i + " " + j + " " + (byRow[i][j] + byCol[i][j]));
                    }
                }
            }
            out.println(res);
        }

    }

    static class Scanner {
        private StringTokenizer st;
        private BufferedReader br;

        public Scanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }

        public Scanner(String s) {
            try {
                br = new BufferedReader(new FileReader(s));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        public String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
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

