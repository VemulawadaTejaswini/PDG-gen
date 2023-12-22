

/**
 * @Author Mehdi Maick
 * Created on 04/12/2016.
 */

import java.util.*;
import java.io.*;

import static java.lang.Math.*;

public class Main{
    public static void solve(FastReader fs, PrintWriter pw) {
        int n = fs.nextInt(), m = fs.nextInt();
        int[] tab = new int[n];
        boolean[] mark = new boolean[n];
        Arrays.fill(tab, 1);
        int ans = 1;
        int a, b;
        mark[0] = true;
        for (int i = 0; i < m; i++) {
            a = fs.nextInt() - 1;
            b = fs.nextInt() - 1;
            if (mark[a]) {
                if (tab[a] > 1) {
                    tab[a]--;
                    tab[b]++;
                    mark[b] = true;
                    ans++;
                } else {
                    if (tab[a] == 1) {
                        tab[a]--;
                        tab[b]++;
                        mark[a] = false;
                        mark[b] = true;
                    }
                }
            } else {
                if (tab[a] >= 1) {
                    tab[a]--;
                    tab[b]++;
                }
            }
        }
//        System.err.println(Arrays.toString(mark));
        int ret = 0;
        for(int i = 0; i <n; i++){
            if(mark[i])ret++;
        }
        pw.println(ret);
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