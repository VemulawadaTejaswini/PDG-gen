import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.util.InputMismatchException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskB solver = new TaskB();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskB {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();

            ArrayList<Integer>[] graph = new ArrayList[n];
            for (int i = 0; i < n; i++) {
                graph[i] = new ArrayList<>();
            }

            int[] a = new int[m];
            int[] b = new int[m];
            for (int i = 0; i < m; i++) {
                a[i] = in.nextInt() - 1;
                b[i] = in.nextInt() - 1;
                graph[a[i]].add(b[i]);
                graph[b[i]].add(a[i]);
            }

            boolean[] used = new boolean[n];
            used[a[0]] = true;
            used[b[0]] = true;
            ArrayList<Integer> list1 = new ArrayList<>();
            int now1 = a[0];
            list1.add(a[0]);
            while (true) {
                boolean flg = true;
                int to = 0;
                for (int y : graph[now1]) {
                    if (!used[y]) {
                        to = y;
                        flg = false;
                        break;
                    }
                }
                if (flg) break;

                used[to] = true;
                now1 = to;
                list1.add(to);
            }
            ArrayList<Integer> list2 = new ArrayList<>();
            int now2 = b[0];
            list2.add(b[0]);
            while (true) {
                boolean flg = true;
                int to = 0;
                for (int y : graph[now2]) {
                    if (!used[y]) {
                        to = y;
                        flg = false;
                        break;
                    }
                }
                if (flg) break;

                used[to] = true;
                now2 = to;
                list2.add(to);
            }

            out.println(list1.size() + list2.size());
            for (int i = list1.size() - 1; i >= 0; i--) {
                if (i < list1.size() - 1) out.print(" ");
                out.print((list1.get(i) + 1));
            }
            for (int i = 0; i < list2.size(); i++) {
                out.print(" " + (list2.get(i) + 1));
            }
        }

    }

    static class InputReader {
        BufferedReader in;
        StringTokenizer tok;

        public String nextString() {
            while (!tok.hasMoreTokens()) {
                try {
                    tok = new StringTokenizer(in.readLine(), " ");
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
            }
            return tok.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(nextString());
        }

        public InputReader(InputStream inputStream) {
            in = new BufferedReader(new InputStreamReader(inputStream));
            tok = new StringTokenizer("");
        }

    }
}

