import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileNotFoundException;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author MaxHeap
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        C solver = new C();
        solver.solve(1, in, out);
        out.close();
    }

    static class C {
        public void solve(int testNumber, FastReader in, PrintWriter out) {
            int N = in.nextInt();
            int[] f = new int[100005];
            int[] temp = new int[N];
            int[] tab;
            int pos = 0;
            for (int i = 0; i < N; i++) {
                int a = in.nextInt();
                f[a]++;
                if (f[a] == 1)
                    temp[pos++] = a;
            }
            tab = new int[pos];
            for (int i = 0; i < pos; i++) tab[i] = temp[i];
            Arrays.sort(tab);
            int front = 0, back = pos - 1;
            int cp = 0;
            while (front < back) {
                if (f[tab[front]] == 1) {
                    front++;
                    continue;
                }
                if (f[tab[back]] == 1) {
                    --back;
                    continue;
                }
                if (f[tab[back]] > f[tab[front]]) {
                    f[tab[back]] -= f[tab[front]] + 1;
                    f[tab[front]] = 1;
                    ++front;
                } else if (f[tab[back]] < f[tab[front]]) {
                    f[tab[front]] -= f[tab[back]] + 1;
                    f[tab[back]] = 1;
                    --back;

                } else if (f[tab[back]] == f[tab[front]]) {

                    f[tab[front]] = f[tab[back]] = 1;
                    --back;
                    ++front;

                }
            }
            int ans = 0;
            int mi = 0;
            for (int i = 0; i < 100005; i++) {
                if (f[i] > 1) {
                    mi = mi + (f[i] - 1);
                }
                if (f[i] >= 1) {
                    ans++;
                }
            }
            int ret = ans - mi;
            out.println(ret > 1 ? ret : 1);

        }

    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
            st = null;
        }

        public FastReader(InputStream is) {
            br = new BufferedReader(new InputStreamReader(is));
            st = null;
        }

        public FastReader(String s) {
            try {
                br = new BufferedReader(new FileReader(s));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        public String next() {
            while (st == null || !st.hasMoreElements()) {
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

    }
}

