import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    static class Fast {
        BufferedReader br;
        StringTokenizer st;

        public Fast() {
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
    public static void main(String args[]) throws Exception {
        Fast in = new Fast();
        long a=in.nextLong();
        long b=in.nextLong();
        if(a==b){
            System.out.println(-1);
            return;
        }
        if(a==1 || b==1){
            System.out.println(-1);
            return;
        }
        long i=(long)1e18-(long)1e18%a;
        while(i>=0){
            if(i%b!=0){
                System.out.println(i);
                return;
            }
            i-=a;
        }
        System.out.println(-1);
    }
}




