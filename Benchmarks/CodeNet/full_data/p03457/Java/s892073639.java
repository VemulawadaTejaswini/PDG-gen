import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String args[]) throws IOException {
        FastReader s = new FastReader();
        int n = s.nextInt();
        int a = 0, b =0, ot = 0;
        for(int i=0;i<n;i++){
            int t = s.nextInt();
            t = t - ot;
            ot = ot + t;
            int x = s.nextInt();
            int y = s.nextInt();
            int l = Math.abs(x-a);
            int u = Math.abs(y-b);
//            System.out.println(i+" "+l+" "+u);
            if(l+u>t){
//                System.out.println(i+"a");
                System.out.println("No");
                return;
            }
            int k = t - l - u;
            if(k%2==1){
//                System.out.println("b");
                System.out.println("No");
                return;
            }
            a = x;
            b = y;
        }
        System.out.println("Yes");
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
