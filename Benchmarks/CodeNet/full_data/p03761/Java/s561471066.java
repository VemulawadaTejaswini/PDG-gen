import java.io.*;
import java.util.*;

class Main {
    static boolean there (int[][] a, int pos, int n) {
        for (int i = 0; i < n; i++) {
            if (a[i][pos] == 0) return false;
        }
        return true;
    }
    static int func (int[][] a, int pos, int n) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            min = Math.min(a[i][pos], min);
        }
        return min;
    }
    public static void main(String args[]) {
        FastReader sc = new FastReader();
        StringBuilder sb = new StringBuilder("");
        int n = sc.nextInt();
        int[][] a = new int[n][26];
        for (int i = 0; i < n; i++) {
            String x = sc.next();
            for (int ii = 0; ii < x.length(); ii++) {
                a[i][x.charAt(ii) - 'a']++;
            }
        }
        for (int i = 0; i < 26; i++) {
            if (there(a, i, n)) {
                int k = func(a, i , n);
                for (int ii = 0; ii < k; ii++) {
                    sb.append((char)(97 + i));
                }
            }
        }
        System.out.println(sb);
    }

    static class FastReader
    {
        BufferedReader br;
        StringTokenizer st;

        public FastReader()
        {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next()
        {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException  e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt()
        {
            return Integer.parseInt(next());
        }

        long nextLong()
        {
            return Long.parseLong(next());
        }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine()
        {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
    }
}