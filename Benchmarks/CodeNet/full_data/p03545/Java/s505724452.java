import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        FastScanner in = new FastScanner();
        int N = in.nextInt();
        String newN = Integer.toString(N);

        char A = newN.charAt(0);
        char B = newN.charAt(1);
        char C = newN.charAt(2);
        char D = newN.charAt(3);

        int newA = Character.getNumericValue(A);
        int newB = Character.getNumericValue(B);
        int newC = Character.getNumericValue(C);
        int newD = Character.getNumericValue(D);



        if (newA+newB+newC+newD==7)
        {
            System.out.println(newA + "+" + newB + "+" + newC +  "+" + newD + "=7" );
            System.exit(0);
        }

        if (newA+newB+newC-newD==7)
        {
            System.out.println(newA + "+" + newB + "+" + newC +  "-" + newD + "=7" );
            System.exit(0);
        }

        if (newA+newB-newC-newD==7)
        {
            System.out.println(newA + "+" + newB + "-" + newC +  "-" + newD + "=7" );
            System.exit(0);
        }

        if (newA-newB+newC+newD==7)
        {
            System.out.println(newA + "-" + newB + "+" + newC +  "+" + newD + "=7" );
            System.exit(0);
        }
        if (newA-newB-newC+newD==7)
        {
            System.out.println(newA + "-" + newB + "-" + newC +  "+" + newD + "=7" );
            System.exit(0);
        }
        if (newA-newB+newC-newD==7)
        {
            System.out.println(newA + "-" + newB + "+" + newC +  "-" + newD + "=7" );
            System.exit(0);
        }
        if (newA-newB-newC-newD==7)
        {
            System.out.println(newA + "+" + newB + "+" + newC +  "+" + newD + "=7" );
            System.exit(0);
        }
        if (newA+newB+newC+newD==7)
        {
            System.out.println(newA + "+" + newB + "+" + newC +  "+" + newD + "=7" );
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
