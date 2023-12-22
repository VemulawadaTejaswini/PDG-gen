import java.awt.Point;
import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        MyReader mr = new MyReader();
        int h = mr.nextInt();
        int n = mr.nextInt();

        int[] a = new int[n];
        int[] m = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = mr.nextInt();
            m[i] = mr.nextInt();
        }

        int[] dp = new int[h+1];
        //1st fill
        for(int i = 1;i<=h;i++){
            if(i < a[0])dp[i] = m[0];
            else{
                dp[i] = m[0] + dp[i-a[0]];
            }
        }

        for(int i = 1;i<n;i++){
            for(int j = 1;j<=h;j++){
                if(j<a[i]){
                    dp[j] = Math.min(dp[j],m[i]);
                }
                else{
                    dp[j] = Math.min(dp[j],m[i]+dp[j-a[i]]);
                }
            }
        }

        System.out.println(dp[h]);





    }

    static class MyReader {
        BufferedReader br;
        StringTokenizer st;

        MyReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (Exception e) {
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
            String res = "";
            try {
                res = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }

            return res;
        }

        int[] nextIntArray(int n) {
            try {
                st = new StringTokenizer(br.readLine());
            } catch (Exception e) {
                e.printStackTrace();
            }
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            return arr;
        }

        long[] nextLongArray(int n) {
            try {
                st = new StringTokenizer(br.readLine());
            } catch (Exception e) {
                e.printStackTrace();
            }
            long[] arr = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            return arr;
        }

        String[] nextStringArray(int n) {
            String res = "";
            try {
                res = br.readLine();
            } catch (Exception e) {
                e.printStackTrace();
            }

            String[] arr = res.split(" ");
            return arr;
        }
    }

    static void swap(int[] arr, int i, int j) {
        int A = arr[i];
        arr[i] = arr[j];
        arr[j] = A;
    }

}


