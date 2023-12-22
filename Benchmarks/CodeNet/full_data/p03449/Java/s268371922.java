

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        FastScanner in = new FastScanner();
        int N = in.nextInt();
        int arrayT [] = new int [N];
        int arrayB [] = new int [N];
        int top [] = new int [N];
        int sumT = 0;
        int sumB = 0;
        int best = 0;
        for (int i = 0; i < N; i++ )
        {
            arrayT[i] = in.nextInt();
        }
        for (int i = 0; i < N; i++ )
        {
            arrayB[i] = in.nextInt();
        }
        int bottom [] = new int [N];
        for (int i =0; i<N;i++)
        {
            sumT += arrayT[i];
            top[i] = sumT;
        }

        for (int i =N-1; i>=0;i--)
        {
            sumB += arrayB[i];
            bottom[i] = sumB;
        }
        int sum = 0;
        for (int i = 0; i < N; i ++){
            sum = top[i] + bottom[i];

            best = Math.max(sum,best);



        }
        System.out.println(best);



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
