import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args){
        PrintWriter out = new PrintWriter(System.out);
        FastScanner sc = new FastScanner();

        int N = sc.nextInt();
        long x[] = new long[N];
        long y[] = new long[N];
        char d[] = new char[N];

        double c_x_min = Double.POSITIVE_INFINITY;
        double c_x_max = Double.NEGATIVE_INFINITY;
        double c_y_min = Double.POSITIVE_INFINITY;
        double c_y_max = Double.NEGATIVE_INFINITY;

        for (int i=0;i<N;i++) {
            x[i] = sc.nextLong();
            y[i] = sc.nextLong();
            d[i] = sc.nextToken().charAt(0);

            if (d[i] == 'U' || d[i] == 'D') {
                c_x_min = Math.min(c_x_min, x[i]);
                c_x_max = Math.max(c_x_max, x[i]);
            } else {
                c_y_min = Math.min(c_y_min, y[i]);
                c_y_max = Math.max(c_y_max, y[i]);
            }
        }

        double min_x_l = Double.POSITIVE_INFINITY;
        double min_x_r = Double.POSITIVE_INFINITY;
        double max_x_l = Double.NEGATIVE_INFINITY;
        double max_x_r = Double.NEGATIVE_INFINITY;

        double min_y_d = Double.POSITIVE_INFINITY;
        double min_y_u = Double.POSITIVE_INFINITY;
        double max_y_d = Double.NEGATIVE_INFINITY;
        double max_y_u = Double.NEGATIVE_INFINITY;
        for (int i=0;i<N;i++) {
            if (d[i] == 'L') {
                min_x_l = Math.min(min_x_l, x[i]);
                max_x_l = Math.max(max_x_l, x[i]);
            } else if (d[i] == 'R') {
                min_x_r = Math.min(min_x_r, x[i]);
                max_x_r = Math.max(max_x_r, x[i]);
            } else if (d[i] == 'U') {
                min_y_u = Math.min(min_y_u, y[i]);
                max_y_u = Math.max(max_y_u, y[i]);
            } else if (d[i] == 'D') {
                min_y_d = Math.min(min_y_d, y[i]);
                max_y_d = Math.max(max_y_d, y[i]);
            }
        }

        double min_x[] = new double[3];
        double max_x[] = new double[3];
        min_x[0] = min_x_r;
        min_x[1] = min_x_l;
        min_x[2] = c_x_min;

        max_x[0] = max_x_r;
        max_x[1] = max_x_l;
        max_x[2] = c_x_max;

        double min_y[] = new double[3];
        double max_y[] = new double[3];
        min_y[0] = min_y_u;
        min_y[1] = min_y_d;
        min_y[2] = c_y_min;

        max_y[0] = max_y_u;
        max_y[1] = max_y_d;
        max_y[2] = c_y_max;


        double cdx = change_down(max_x, min_x);
        double cux = change_up(max_x, min_x);
        double cdy = change_down(max_y, min_y);
        double cuy = change_up(max_y, min_y);

        double ans = Double.POSITIVE_INFINITY;
        ans = Math.min(ans, wide(max_x, min_x, 0) * wide(max_y, min_y, 0));
        ans = Math.min(ans, wide(max_x, min_x, cdx) * wide(max_y, min_y, cdx));
        ans = Math.min(ans, wide(max_x, min_x, cux) * wide(max_y, min_y, cux));
        ans = Math.min(ans, wide(max_x, min_x, cdy) * wide(max_y, min_y, cdy));
        ans = Math.min(ans, wide(max_x, min_x, cuy) * wide(max_y, min_y, cuy));

        out.println(ans);
        out.flush();
    }

    public static double calc_min(double min_pos, double max_neg, double c, double t) {
        return Math.min(Math.min(min_pos + t, max_neg - t), c);
    }

    public static double calc_max(double min_pos, double max_neg, double c, double t) {
        return Math.max(Math.max(min_pos + t, max_neg - t), c);
    }

    public static double wide(double max[], double min[], double t) {
        double _min = calc_min(min[0], min[1], min[2], t);
        double _max = calc_max(max[0], max[1], max[2], t);

        return _max - _min;
    }

    public static double change_down(double max[], double min[]) {
        double left = 0;
        double right = 1e12;
        double EPS = 1e-11;

        while (true) {
            double mid1 = left * 2 / 3 + right * 1 / 3;
            double mid2 = left * 1 / 3 + right * 2 / 3;

            double w1 = wide(max, min, mid1);
            double w2 = wide(max, min, mid2);

            if (w1 <= w2) {
                right = mid2;
            } else {
                left = mid1;
            }

            if (right - left < EPS || right <= left) {
                break;
            }
        }

        return left;
    }

    public static double change_up(double max[], double min[]) {
        double left = 0;
        double right = 1e12;
        double EPS = 1e-11;

        while (true) {
            double mid1 = left * 2 / 3 + right * 1 / 3;
            double mid2 = left * 1 / 3 + right * 2 / 3;

            double w1 = wide(max, min, mid1);
            double w2 = wide(max, min, mid2);

            if (w1 < w2) {
                right = mid2;
            } else {
                left = mid1;
            }

            if (right - left < EPS || right <= left) {
                break;
            }
        }

        return left;
    }

    public static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner(String s) {
            try {
                br = new BufferedReader(new FileReader(s));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
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
                    e.printStackTrace();
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

        int[] nextIntArray(int N) {
            int a[] = new int[N];
            for (int i=0;i<N;i++) {
                a[i] = this.nextInt();
            }

            return a;
        }

        long[] nextLongArray(int N) {
            long a[] = new long[N];
            for (int i=0;i<N;i++) {
                a[i] = this.nextLong();
            }

            return a;
        }

        double[] nextDoubleArray(int N) {
            double a[] = new double[N];
            for (int i=0;i<N;i++) {
                a[i] = this.nextDouble();
            }

            return a;
        }

        String[] nextTokenArray(int N) {
            String a[] = new String[N];
            for (int i=0;i<N;i++) {
                a[i] = this.nextToken();
            }

            return a;
        }
    }
}