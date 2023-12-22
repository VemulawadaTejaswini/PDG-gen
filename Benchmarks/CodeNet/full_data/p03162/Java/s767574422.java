import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.lang.*;


public class Main {


    public static void main(String[] args) {
        FastReader in = new FastReader();
        int n = in.nextInt();
        int arr[][] = new int[n][3];
        for(int i=0;i<n;i++){
            arr[i][0] = in.nextInt();
            arr[i][1] = in.nextInt();
            arr[i][2] = in.nextInt();
        }
        int dp1[] = new int[n];
        int dp2[] = new int[n];
        int dp3[] = new int[n];
        dp1[0] = arr[0][0];
        dp2[0] = arr[0][1];
        dp3[0] = arr[0][2];
        for(int i=1;i<n;i++){
            dp1[i] = Math.max(dp3[i-1],dp2[i-1]) + arr[i][0];
            dp2[i] = Math.max(dp1[i-1],dp3[i-1]) + arr[i][1];
            dp3[i] = Math.max(dp1[i-1],dp2[i-1]) + arr[i][2];
        }
        System.out.println(Math.max(dp1[n-1],Math.max(dp2[n-1],dp3[n-1])));


    }



    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
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

