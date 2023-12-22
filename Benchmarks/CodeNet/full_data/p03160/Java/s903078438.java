package AtCoder.dp;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class A_Frog1 {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int N = sc.nextInt();
        int[] h = new int[N];
        for(int i = 0; i < N; i++) {
            h[i] = sc.nextInt();
        }
        int[] dp = new int[N];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for(int i = 0; i < N; i++) {
            for(int j : new int[]{i + 1, i + 2}) {
                if(j < N) {
                    dp[j] = Math.min(dp[j], dp[i] + Math.abs(h[j] - h[i]));
                }
            }
        }
        System.out.println(dp[N-1]);
        out.close();
    }

    public static PrintWriter out;

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

        String nextLine(){
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
