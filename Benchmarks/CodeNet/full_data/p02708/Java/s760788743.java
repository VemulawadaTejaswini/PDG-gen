import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        FastReader fs = new FastReader();
        out = new PrintWriter(new BufferedOutputStream(System.out));
        long n = fs.nextLong();
        long k = fs.nextLong();
        long mod = 1000000007;
        long ans = 0 ;

        long first = ((n)*(n+1))/2;




        for(long i=k ; i<=(n+1) ; i++){
            long term1 = first - (i*(i-1))/2;
            long term2 = ((n-i)*(n-i+1))/2;
            
            long fin = term1 - term2 + 1 ;
            ans = (ans%mod+fin%mod)%mod;
        }

        out.println(ans);

        out.close();

    }

    //-----------PrintWriter for faster output---------------------------------
    public static PrintWriter out;

    //-----------MyScanner class for faster input----------
    public static class FastReader {
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
    //--------------------------------------------------------
}
