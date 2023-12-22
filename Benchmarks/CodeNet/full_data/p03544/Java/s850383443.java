import java.io.*;
import java.util.StringTokenizer;






public class Main {
    public static void main(String[] args) throws IOException {
        FastScanner in = new FastScanner();
        int N = in.nextInt();

        String Lucas [] = new String [N+2];
        Lucas[0] = "2";
        Lucas[1] = "1";

        for (int i = 2; i <= N+1; i++)
        {
            String L1 = Lucas[i-1];
            String L2 = Lucas[i-2];

            long newL1 = Long.valueOf(L1);
            long newL2 = Long.valueOf(L2);

            long L3 = newL1 + newL2;

            Lucas[i] = Long.toString(L3);
        }

        System.out.println(Lucas[N]);
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
