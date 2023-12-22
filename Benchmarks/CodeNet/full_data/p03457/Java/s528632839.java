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
        int n=in.nextInt();
        int prevx=0,prevy=0,prevt=0;
        while(n-->0){
            int t=in.nextInt();
            int x=in.nextInt(),y=in.nextInt();
            int total=Math.abs(x-prevx)+Math.abs(y-prevy);
            if(t<total){
                System.out.println("No");
                return;
            }
            int diff=total-(t-prevt);
            if(diff%2!=0){
                System.out.println("No");
                return;
            }
            prevx=x;
            prevy=y;
            prevt=t;

        }
        System.out.println("Yes");
        }
    }