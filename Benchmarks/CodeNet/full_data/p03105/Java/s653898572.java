import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args){
        FastScanner fs = new FastScanner();
        PrintWriter pw = new PrintWriter(System.out);

        int a = fs.nextInt();
        int b = fs.nextInt();
        int c = fs.nextInt();
        int now = 0;
        int ans = 0;
        for (int i = 0; i < c; i++){
            now += a;
            if(now > b){
                break;
            }
            ans++;
        }
        pw.println(ans);
        pw.flush();
    }
    public static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner(Reader in) {
            br = new BufferedReader(in);
        }

        public FastScanner() {
            this(new InputStreamReader(System.in));
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

        String readNextLine() {
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
