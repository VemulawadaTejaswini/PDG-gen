import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {

    public static void main(String args[]) throws IOException {
        FastReader in = new FastReader();
        OutputStream outputStream = System.out;
        PrintWriter out = new PrintWriter(outputStream);
        Task.solve(in, out);
        out.close();
    }

    static class Task {

        public static void solve(FastReader in, PrintWriter out) {
            long n = in.nextLong(), m = in.nextLong();
            long[] a = new long[(int)m];
            for(int i=0;i<m;i++){
                a[i] = in.nextLong();
            }
            if(n>=m){
                System.out.println(0);
                return;
            }
            Arrays.sort(a);
            long[] b = new long[(int)m-1];
            for(int i=0;i<m-1;i++){
                b[i] = a[i+1]-a[i];
            }
            Arrays.sort(b);
            long sum=0;
            for(int i=0;i<(m-n);i++){
                sum+=b[i];
            }
            System.out.println(sum);
        }
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