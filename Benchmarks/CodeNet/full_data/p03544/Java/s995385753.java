import java.io.*;
import java.util.StringTokenizer;






public class Main {
    public static void main(String[] args) throws IOException {
        FastScanner in = new FastScanner();
        int N = in.nextInt();

        String Lucas [] = new String [10^18];
        Lucas[0] = "2";
        Lucas[1] = "1";

        for (int i = 2; i <= N+1; i++)
        {
            String L1 = Lucas[i-1];
            String L2 = Lucas[i-2];

            int newL1 = Integer.valueOf(L1);
            int newL2 = Integer.valueOf(L2);

            int L3 = newL1 + newL2;
            String newL3 = Integer.toString(L3);

            Lucas[i] = newL3;
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
