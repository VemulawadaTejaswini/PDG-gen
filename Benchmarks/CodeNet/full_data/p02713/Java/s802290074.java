import java.io.*;
import java.util.*;

public class Main {
    static int gcd(int a, int b)
    {
        // Everything divides 0
        if (a == 0)
            return b;
        if (b == 0)
            return a;

        // base case
        if (a == b)
            return a;

        // a is greater
        if (a > b)
            return gcd(a-b, b);
        return gcd(a, b-a);
    }
    public static void main(String[] args) throws Exception{

        FastReader fs = new FastReader();
        out = new PrintWriter(new BufferedOutputStream(System.out));


        int k = fs.nextInt();
        
        long kP = k;
        long ans = (kP*(kP+1))/2;

        for(int i=1 ; i<=k ; i++){
            for(int j=i+1 ; j<=k ; j++){
                long calc = (long) gcd(i,j)*6;
                ans += calc;
            }
        }

        for(int i=1 ; i<=k ; i++){
            for(int j=i+1 ; j<=k ; j++){
                for(int l=j+1 ; l<=k ; l++){
                    int calc = gcd(i,j);
                    long calcF = gcd(calc,l);
                    ans += calcF*6;
                }
            }
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
