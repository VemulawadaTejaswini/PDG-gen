

/**
 * @Author Mehdi Maick
 * Created on 04/12/2016.
 */

import java.util.*;
import java.io.*;

import static java.lang.Math.*;

public class Main {
    public static void solve(FastReader fs, PrintWriter pw) {
        int n = fs.nextInt();
        long x = fs.nextLong();
        long[] tab = fs.nextLongArray(n);
        long ans = 0;
        long sum = tab[0];
        for (int i = 1; i < n; i++) {
            sum += tab[i];
            if (tab[i] + tab[i - 1] > x) {
                long diff = ((tab[i] + tab[i - 1]) - x);
                if (tab[i] > x && tab[i - 1] > x) {
                    ans += tab[i];
                    tab[i] = 0;
                    ans += (tab[i - 1] - x);
                    tab[i - 1] = x;
                } else if (tab[i] >= tab[i - 1]) {
                    tab[i] = tab[i] - diff;
                    ans += diff;
                } else {
                    tab[i - 1] = tab[i - 1] - diff;
                    ans += diff;
                }
            }
        }
        if (x == 0) {
            pw.println(sum);
        } else {
            pw.println(ans);
        }
    }

    public static void main(String[] args) throws Exception {
        FastReader fs = new FastReader(System.in);
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

        solve(fs, pw);

        fs.close();
        pw.close();
    }

    static class FastReader {

        BufferedReader reader;
        StringTokenizer st;

        FastReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream));
            st = null;
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    String line = reader.readLine();
                    if (line == null) {
                        return null;
                    }
                    st = new StringTokenizer(line);
                } catch (Exception e) {
                    throw new RuntimeException();
                }
            }
            return st.nextToken();
        }

        String nextLine() {
            String s = null;
            try {
                s = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return s;
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

        char nextChar() {
            return next().charAt(0);
        }

        int[] nextIntArray(int n) {
            int[] arr = new int[n];
            int i = 0;
            while (i < n) {
                arr[i++] = nextInt();
            }
            return arr;
        }

        long[] nextLongArray(int n) {
            long[] arr = new long[n];
            int i = 0;
            while (i < n) {
                arr[i++] = nextLong();
            }
            return arr;
        }

        int[] nextIntArrayOneBased(int n) {
            int[] arr = new int[n + 1];
            int i = 1;
            while (i <= n) {
                arr[i++] = nextInt();
            }
            return arr;
        }

        long[] nextLongArrayOneBased(int n) {
            long[] arr = new long[n + 1];
            int i = 1;
            while (i <= n) {
                arr[i++] = nextLong();
            }
            return arr;
        }

        void close() {
            try {
                reader.close();
            } catch (IOException e) {
                System.err.println("There's been an error trying closing the reader ");
                e.printStackTrace();
            }
        }
    }


}