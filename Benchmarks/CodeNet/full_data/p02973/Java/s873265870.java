import java.io.*;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
    static TreeSet<Integer> lis[];
    static int[] a;
    static int pointer;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = sc.nextInt();
        a = sc.nextIntArray(n);
        lis = new TreeSet[n];
        for (int i = 0; i < n; i++)
            lis[i] = new TreeSet<>();
        pointer = 0;
        int[] pos = new int[n];
        for (int i = 0; i < n; i++) {
            int j = BS(i);
            pointer = Math.max(pointer, j + 1);
            lis[j].add(i);
            pos[i] = j;
        }
        int ans = 0;
        for (int i = pointer - 1; i >= 0; i--) {
            while (!lis[i].isEmpty()) {
                int cur = lis[i].last();
                lis[i].remove(cur);
                ans++;
                for (int j = pos[cur] - 1; j >= 0; j--) {
                    if (lis[j].lower(cur) != null) {
                        int remove = lis[j].lower(cur);
                        lis[j].remove(remove);
                        cur = remove;
                    }
                }

            }
        }
        out.println(ans);
        out.flush();
        out.close();
    }

    static int BS(int v) {
        int lo = 0, hi = pointer - 1;
        int ans = pointer;
        while (lo <= hi) {
            int mid = lo + hi >> 1;
            if (a[lis[mid].last()] >= a[v]) {
                ans = mid;
                hi = mid - 1;
            } else lo = mid + 1;
        }
        return ans;
    }


    static class Scanner {

        StringTokenizer st;
        BufferedReader br;

        public Scanner(InputStream system) {
            br = new BufferedReader(new InputStreamReader(system));
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


        public int[] nextIntArray(int n) throws IOException {
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
        }

        public long[] nextLongArray(int n) throws IOException {
            long[] a = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = nextLong();
            return a;
        }


        public Integer[] nextIntegerArray(int n) throws IOException {
            Integer[] a = new Integer[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
        }

        public double[] nextDoubleArray(int n) throws IOException {
            double[] ans = new double[n];
            for (int i = 0; i < n; i++)
                ans[i] = nextDouble();
            return ans;
        }

        public short nextShort() throws IOException {
            return Short.parseShort(next());
        }

    }
}