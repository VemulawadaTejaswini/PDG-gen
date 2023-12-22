import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.lang.*;


public class Main {


    public static void main(String[] args) {
        FastReader in = new FastReader();
        int n = in.nextInt();
        int k = in.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }
        int ans[] = new int[n+1];
        ans[1] = 0;
        int limit = Math.min(n,k);
        for(int i=2;i<=limit;i++){
            int min = Integer.MAX_VALUE;
            for(int j=1;j<i;j++){
                min = Math.min(min,ans[j]+Math.abs(arr[i-1]-arr[j-1]));
            }
            ans[i] = min;
        }

        for(int i=k+1;i<=n;i++){
            int min = Integer.MAX_VALUE;
            for(int j=i-k;j<i;j++){
                try {
                    min = Math.min(min, ans[j] + Math.abs(arr[i-1] - arr[j-1]));
                }catch (Exception e){
                    System.out.println(i+" "+j);
                }
            }
            ans[i] = min;
        }
        System.out.println(ans[n]);



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

