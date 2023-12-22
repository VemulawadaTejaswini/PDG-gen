import java.io.*;
import java.util.*;

public class Main {

    int[][] next = new int[26][500000];
    int[] id = new int[500000];
    int[] size = new int[500000];
    int states = 1;

    void add(String s, int i) {
        int cur = 0;
        for (char c : s.toCharArray()) {
            if (next[c - 'a'][cur] == -1) {
                next[c - 'a'][cur] = states++;
            }
            size[cur]++;
            cur = next[c - 'a'][cur];
        }
        size[cur]++;
        id[cur] = i;
    }

    int get(int cur, int k, String s) {
        if (id[cur] != -1) {
            if (k == 1) {
                return id[cur];
            }
            k--;
        }

        for (int i = 0; i < s.length(); i++) {
            int nxt = next[i][cur];
            if (nxt == -1) {
                continue;
            }
            if (size[nxt] >= k) {
                return get(nxt, k, s);
            }
            k -= size[nxt];
        }
        return -1;
    }

    public void solve() {
        int n = in.nextInt();
        for (int[] i : next) {
            Arrays.fill(i, -1);
        }
        Arrays.fill(id, -1);

        for (int i = 0; i < n; i++) {
            add(in.nextToken(), i);
        }
        int q = in.nextInt();
        for (int i = 0; i < q; i++) {
            int k = in.nextInt();
            String s = in.nextToken();
            out.println(get(0, k, s) + 1);
        }
    }

    public void run() {
        in = new FastScanner();
        out = new PrintWriter(System.out);
        solve();
        out.close();
    }

    FastScanner in;
    PrintWriter out;

    class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner(String fileName) {
            try {
                br = new BufferedReader(new FileReader(fileName));
            } catch (FileNotFoundException e) {
            }
        }

        public FastScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String nextToken() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(nextToken());
        }

        long nextLong() {
            return Long.parseLong(nextToken());
        }

        double nextDouble() {
            return Double.parseDouble(nextToken());
        }
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
