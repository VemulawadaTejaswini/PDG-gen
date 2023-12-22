import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        MyScanner in = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));

        String str = in.nextLine().trim();

        if (str.charAt(3) == str.charAt(4) && str.charAt(5) == str.charAt(6)) out.println("Yes");
        else out.println("No");


        out.close();
    }

    public static PrintWriter out;

    public static class MyScanner {
        BufferedReader br;
        StringTokenizer st;

        public MyScanner() {
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