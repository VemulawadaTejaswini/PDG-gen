package Algorithms;

import java.io.*;
import java.util.StringTokenizer;






public class AtCoder079C {
    public static void main(String[] args) throws IOException {
        FastScanner in = new FastScanner();
        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();
        int D = in.nextInt();

        if (A+B+C+D==7)
        {
            System.out.println(A + "+" + B + "+" + C +  "+" + D + "=7" );
            System.exit(0);
        }

        if (A+B+C-D==7)
        {
            System.out.println(A + "+" + B + "+" + C +  "-" + D + "=7" );
            System.exit(0);
        }

        if (A+B-C-D==7)
        {
            System.out.println(A + "+" + B + "-" + C +  "-" + D + "=7" );
            System.exit(0);
        }

        if (A-B+C+D==7)
        {
            System.out.println(A + "-" + B + "+" + C +  "+" + D + "=7" );
            System.exit(0);
        }
        if (A-B-C+D==7)
        {
            System.out.println(A + "-" + B + "-" + C +  "+" + D + "=7" );
            System.exit(0);
        }
        if (A-B+C-D==7)
        {
            System.out.println(A + "-" + B + "+" + C +  "-" + D + "=7" );
            System.exit(0);
        }
        if (A-B-C-D==7)
        {
            System.out.println(A + "+" + B + "+" + C +  "+" + D + "=7" );
            System.exit(0);
        }
        if (A+B+C+D==7)
        {
            System.out.println(A + "+" + B + "+" + C +  "+" + D + "=7" );
            System.exit(0);
        }





    }

    public static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner(String s) {
            try {
                br = new BufferedReader(new FileReader(s));
            } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        public FastScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String nextToken() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        String nextLine() {
            st = null;
            try {
                return br.readLine();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            return null;
        }

        int nextInt() {
            return Integer.parseInt(nextToken());
        }

        long nextLong() {
            return Long.parseLong(nextToken());
        }

        double nextDouble() {
            return Double.parseDouble(nextToken());
        }
    }
}
