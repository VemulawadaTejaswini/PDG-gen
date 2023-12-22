import java.io.*;
import java.util.*;

public class Main {
    static long a[];
    static int n;
    public static void main(String[] args) throws Exception {
        FastReader sc = new FastReader();
        n=sc.nextInt();
        a=new long[n];
        long sum1=0,sum2=0;
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
            if (i%2==0)sum1+=a[i];
            else sum2+=a[i];
        }
        if (n%2==0){
            System.out.println(Math.max(sum1,sum2));
            return;
        }
        long ans=Long.MIN_VALUE;
        for (int i=0;i<n;i++){
            ans=Math.max(ans,Math.max(sum1-(i%2==0?a[i]:0),sum2));
        }
        System.out.println(ans);
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