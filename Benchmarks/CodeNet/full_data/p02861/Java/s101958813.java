import java.io.*;
import java.util.Random;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
        FastReader scan = new FastReader();
        PrintWriter out = new PrintWriter(System.out);
        Task solver = new Task();
        int t = 1;
        while (t --> 0) solver.solve(1, scan, out);
        out.close();
    }

    static class Task {

        public void solve(int testNumber, FastReader scan, PrintWriter out) {
            int n = scan.nextInt();
            int[][] point = new int[n][2];
            for(int i = 0; i < n; i++) {
                point[i][0] = scan.nextInt();
                point[i][1] = scan.nextInt();
            }
            double total = 0;
            long fact1 = 1, fact2 = 1;
            for(int i = 1; i <= n-2; i++) fact1 *= i;
            for(int i = 1; i <= n; i++) fact2 *= i;
            for(int i = 0; i < n; i++) {
                for(int j = i+1; j < n; j++) {
                    total += dist(point[i][0], point[i][1], point[j][0], point[j][1]);
                }
            }
            total *= 2*fact1*(n-1);
            out.println(total/fact2);
        }

        static double dist(int a, int b, int c, int d) {
            long x = Math.abs(a-c), y = Math.abs(b-d);
            return Math.sqrt(x*x+y*y);
        }
    }

    static void shuffle(int[] a) {
        Random get = new Random();
        for (int i = 0; i < a.length; i++) {
            int r = get.nextInt(a.length);
            int temp = a[i];
            a[i] = a[r];
            a[r] = temp;
        }
    }

    static void shuffle(long[] a) {
        Random get = new Random();
        for (int i = 0; i < a.length; i++) {
            int r = get.nextInt(a.length);
            long temp = a[i];
            a[i] = a[r];
            a[r] = temp;
        }
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        public FastReader(String s) throws FileNotFoundException {
            br = new BufferedReader(new FileReader(new File(s)));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
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