import java.io.*;
import java.util.ArrayList;
import java.util.Locale;
import java.util.StringTokenizer;
import java.util.concurrent.ArrayBlockingQueue;


public class Main {
    String filename = "cubes";//filename here, System.in/out if no file

    FastScanner in;
    PrintWriter out;
    public int n;
    public ArrayList<Integer>[] g;
    public int[] type; //0-uncol 1-f 2-s

    void solve() {
        n = in.nextInt();
        g = new ArrayList[n];
        type = new int[n];
        for (int i = 0; i < n; i++) g[i] = new ArrayList<>();
        for (int i = 1; i < n; i++) {
            int a = in.nextInt()-1;
            int b = in.nextInt()-1;
            g[a].add(b);
            g[b].add(a);
        }
        ArrayBlockingQueue<Integer> q = new ArrayBlockingQueue<Integer>(n);
        type[0] = 1;
        type[n - 1] = 2;
        q.add(0);
        q.add(n - 1);
        int f = 0;
        int s = 0;
        while (!q.isEmpty()) {
            int now = q.remove();
            if (type[now] == 1) f++;
            else s++;
            for (int i = 0; i < g[now].size(); i++) {
                int to = g[now].get(i);
                if (type[to] == 0) {
                    q.add(to);
                    type[to] = type[now];
                }
            }
        }
        if (f>s) out.println("Fennec");
        else out.println("Snuke");
    }

    void run() throws IOException {
        InputStream input = System.in;
        OutputStream output = System.out;
        try {
            File f = new File(filename + ".in");
            if (f.exists() && f.canRead()) {
                input = new FileInputStream(f);
                output = new FileOutputStream(filename + ".out");
            }
        } catch (IOException e) {
        }
        in = new FastScanner(input);
        out = new PrintWriter(new BufferedOutputStream(output));
        solve();
        in.close();
        out.close();
    }

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        new Main().run();
    }

    class FastScanner implements Closeable {
        private BufferedReader br;
        private StringTokenizer tokenizer;

        public FastScanner(InputStream stream) throws FileNotFoundException {
            br = new BufferedReader(new InputStreamReader(stream));
        }

        public boolean hasNext() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    String s = br.readLine();
                    if (s == null) {
                        return false;
                    }
                    tokenizer = new StringTokenizer(s);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.hasMoreTokens();
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public String nextLine() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    return br.readLine();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken("\n");
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

        @Override
        public void close() throws IOException {
            br.close();
        }
    }
}