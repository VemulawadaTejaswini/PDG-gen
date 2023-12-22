import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));

        int n = in.nextInt();
        train[] t = new train[n];
        for (int i = 0; i < n - 1; i++) {
            t[i] = new train(in.nextInt(), in.nextInt(), in.nextInt());
        }
        t[n - 1] = new train(0, 0, 1);
        long[] time = new long[n + 1];
        int[] maxS = new int[n + 1];
        maxS[n] = 0;
        for (int i = n - 1; i >= 1; i--) {
            maxS[i] = t[i - 1].s > maxS[i + 1] ? t[i - 1].s : maxS[i + 1];
        }
        time[n] = 0;
        for (int i = n - 1; i >= 1; i--) {
            train cur = t[i - 1];
            train next = t[i];
            if (cur.s + cur.c - maxS[i + 1] <= 0) {
                time[i] = time[i + 1];
            } else {
                time[i] = (int) Math.ceil((cur.s + cur.c - next.s) / (double) next.f) * next.f + time[i + 1];
            }
        }
        for (int i = 1; i < n + 1; i++) {
            out.println(time[i]);
        }

        out.close();
        //INT OVERFLOW -> USE LONG
        //ARR OUT OF BOUNDS
    }

    static class train {
        int c;
        int s;
        int f;

        train(int c, int s, int f) {
            this.c = c;
            this.s = s;
            this.f = f;
        }
    }

    static class Scanner {
        StringTokenizer st;
        BufferedReader br;

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

        public long nextLong() {
            return Long.parseLong(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

        public int[] nextIntArray(int n) {
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = nextInt();
            }
            return arr;
        }

        public double[] nextDoubleArray(int n) {
            double[] arr = new double[n];
            for (int i = 0; i < n; i++) {
                arr[i] = nextDouble();
            }
            return arr;
        }

        public long[] nextLongArray(int n) {
            long[] arr = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = nextLong();
            }
            return arr;
        }

        public char[] nextCharArray(int n) {
            char[] arr = nextLine().trim().replaceAll("\\s", "").toCharArray();
            return arr;
        }

        public String[] nextStringArray(int n) {
            String[] arr = new String[n];
            for (int i = 0; i < n; i++) {
                arr[i] = next();
            }
            return arr;
        }
    }
}