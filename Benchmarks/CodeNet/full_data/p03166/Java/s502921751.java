import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.ArrayList;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author real
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        MAXIMUMLENGTH solver = new MAXIMUMLENGTH();
        solver.solve(1, in, out);
        out.close();
    }

    static class MAXIMUMLENGTH {
        ArrayList<ArrayList<Integer>> list;
        int[] height;
        int maxLength = 0;
        int[] ans;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            list = in.initlist(n);
            int indegree[] = new int[n + 1];
            for (int i = 0; i < m; i++) {
                int u = in.nextInt();
                int v = in.nextInt();
                list.get(u).add(v);
                indegree[v]++;
            }
            height = new int[n + 1];
            Arrays.fill(height, -1);
            ans = in.memset(n + 1, -1);
            for (int i = 1; i <= n; i++) {
                if (indegree[i] == 0)
                    ans(i);
            }
            for (int i = 1; i <= n; i++) {
                if (indegree[i] == 0)
                    diameter(i);
            }
            out.println(maxLength);
        }

        void diameter(int node) {
            if (ans[node] != -1)
                return;
            int mx1 = -1;
            int mx2 = -1;
            for (int x : list.get(node)) {
                if (height[x] >= mx1) {
                    mx2 = mx1;
                    mx1 = height[x];
                } else {
                    if (height[x] > mx2) {
                        mx2 = height[x];
                    }
                }
            }
            //maxLength = Math.max(maxLength,height[node]);
            maxLength = Math.max(maxLength, mx1 + mx2 + 2);
            ans[node] = maxLength;
        }

        int ans(int node) {
            if (height[node] != -1)
                return height[node];
            if (list.get(node).size() == 0) {
                return height[node] = 0;
            }
            int mx = 0;
            for (int x : list.get(node)) {
                mx = Math.max(mx, ans(x));
            }
            height[node] = mx + 1;
            return height[node];
        }

    }

    static class InputReader {
        private final InputStream stream;
        private final byte[] buf = new byte[8192];
        private int curChar;
        private int snumChars;

        public InputReader(InputStream st) {
            this.stream = st;
        }

        public int read() {
            //*-*------clare------
//remeber while comparing 2 non primitive data type not to use ==
//remember Arrays.sort for primitive data has worst time case complexity of 0(n^2) bcoz it uses quick sort
//again silly mistakes ,yr kb tk krta rhega ye mistakes
//try to write simple codes ,break it into simple things
            // for test cases make sure println(); ;)
//knowledge>rating
        /*
        public class Main
        implements Runnable{
    public static void main(String[] args) {
        new Thread(null,new Main(),"Main",1<<26).start();

    }
    public void run() {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskC solver = new TaskC();//chenge the name of task
        solver.solve(1, in, out);
        out.close();
    }
         */

            if (snumChars == -1)
                throw new InputMismatchException();
            if (curChar >= snumChars) {
                curChar = 0;
                try {
                    snumChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (snumChars <= 0)
                    return -1;
            }
            return buf[curChar++];
        }

        public int nextInt() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            int res = 0;
            do {
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public ArrayList<ArrayList<Integer>> initlist(int n) {
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            for (int i = 0; i <= n; i++) {
                list.add(new ArrayList<Integer>());
            }
            return list;
        }

        public int[] memset(int n, int val) {
            int ar[] = new int[n];
            Arrays.fill(ar, val);
            return ar;
        }

        public boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

    }
}

