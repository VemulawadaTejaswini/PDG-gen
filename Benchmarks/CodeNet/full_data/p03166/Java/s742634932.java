import java.io.*;
import java.util.*;


public class Main {
    static final int UNCALC = -1;
    static final int INF = (int) 1e9;
    static ArrayList<Integer> adjList[];
    static int memo[];

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = sc.nextInt();
        adjList = new ArrayList[n];
        for (int i = 0; i < n; i++)
            adjList[i] = new ArrayList<>();
        int m = sc.nextInt();
        int[] p = new int[n];
        while (m-- > 0) {
            int x = sc.nextInt() - 1;
            int y = sc.nextInt() - 1;
            adjList[x].add(y);
            p[y]++;
        }
        Queue<Integer> roots = new LinkedList<>();
        for (int i = 0; i < n; i++)
            if (p[i] == 0) roots.add(i);
        int max = 0;
        memo = new int [n];
        Arrays.fill(memo,UNCALC);
        while (!roots.isEmpty())
            max = Math.max(max,dp(roots.remove()));
        out.println(max);
        out.flush();
        out.close();

    }

    static int dp(int node) {
        if (memo[node] != UNCALC) return memo[node];
        int max = 0;
        for (int v : adjList[node])
            max = Math.max(max, 1 + dp(v));
        return max;
    }


    static class Scanner {
        StringTokenizer st;
        BufferedReader br;

        public Scanner(InputStream system) {
            br = new BufferedReader(new InputStreamReader(system));
        }

        public Scanner(String file) throws Exception {
            br = new BufferedReader(new FileReader(file));
        }

        public String next() throws IOException {
            while (st == null || !st.hasMoreTokens()) st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }

        public String nextLine() throws IOException {
            return br.readLine();
        }

        public int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        public double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }

        public char nextChar() throws IOException {
            return next().charAt(0);
        }

        public Long nextLong() throws IOException {
            return Long.parseLong(next());
        }

        public boolean ready() throws IOException {
            return br.ready();
        }

        public void waitForInput() throws InterruptedException {
            Thread.sleep(3000);
        }

        public int[] nextIntArray(int n) throws IOException {
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
        }

        public Integer[] nextIntegerArray(int n) throws IOException {
            Integer[] a = new Integer[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
        }

    }
}