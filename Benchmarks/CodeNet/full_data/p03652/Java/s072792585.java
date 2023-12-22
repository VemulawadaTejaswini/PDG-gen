import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        int n = sc.nextInt(); int m = sc.nextInt();
        int [][] a = new int[n][m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++) a[i][j] = sc.nextInt();
        int res = Integer.MAX_VALUE;
        int [] index = new int[n];
        boolean [] in = new boolean[m + 1];
        Arrays.fill(in, true);
        int sports = m;
        while (sports > 0) {
            int bestSport = -1; int people = 0;
            int [] ct = new int[m + 1];
            for (int i = 0; i < n; i++) {
                ++ct[a[i][index[i]]];
            }
            for (int i = 1; i <= m; i++) {
                if (ct[i] > people) {
                    bestSport = i;
                    people = ct[i];
                }
            }
            res = Math.min(res, people);
            in[bestSport] = false;
            for (int i = 0; i < n; i++) {
                while (index[i] < m && !in[a[i][index[i]]]) ++index[i];
            }
            --sports;
        }
        out.println(res);
        out.close();
    }


    //-----------MyScanner class for faster input----------
    public static class MyScanner {
        BufferedReader br;
        StringTokenizer st;

        public MyScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
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