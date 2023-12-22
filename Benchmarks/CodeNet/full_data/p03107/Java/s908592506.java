import java.util.*;
import java.io.*;

public class Main{


    public static void main(String[] args) {
        FastReader in = new FastReader();

        String s = in.nextLine();
        int cnt[] = new int[2];
        for (int l = 0; l < s.length(); ++l){
            cnt[(int)s.charAt(l) - (int)'0'] ++;
        }
        System.out.println(Math.min(cnt[0], cnt[1])*2);




    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
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