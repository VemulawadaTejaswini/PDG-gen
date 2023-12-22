//package BeginnerContest148;

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        FastReader sc = new FastReader();
        PrintWriter pw = new PrintWriter(System.out);
        int n = sc.nextInt();
        int[] list = new int[n];
        for(int i = 0; i<n; i++) list[i] = sc.nextInt();
        int curr = 1;
        int ans = 0;
        for(int i = 0; i<n; i++){
            if(curr != list[i]){
                ans++;
            }
            else{
                curr++;
            }
        }
        if(ans == n) pw.println(-1);
        else{
            pw.println(ans);
        }
        pw.close();
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