import java.awt.*;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        FastReader sc = new FastReader();
        int n=sc.nextInt();
        long cnt[]=new long[n+1];
        int a[]=new int[n];
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
            cnt[a[i]]++;
        }
        long ways=0;
        for (int i=1;i<=n;i++){
            ways+=((long) cnt[i]*(cnt[i]-1)/2);
        }
        long ans[]=new long[n];
        for (int i=0;i<n;i++){
            ans[i]=ways-(cnt[a[i]]*(cnt[a[i]]-1)/2)+((cnt[a[i]]-2)*(cnt[a[i]]-1)/2);
        }
        StringBuilder sb=new StringBuilder();
        for (long x:ans){
            sb.append(x+"\n");
        }
        System.out.print(sb);
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