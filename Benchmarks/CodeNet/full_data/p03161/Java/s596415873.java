import java.io.*;
import java.lang.*;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.math.BigInteger;
//1/26 done
public class Main { //CHANGE TO MAIN WHEN SUBMITTING
    static InputReader in = new InputReader(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        int n = in.nextInt();
        int limit = in.nextInt();
        int[] a = new int[n];
        for(int i = 0; i<n; i++) a[i] = in.nextInt();
        int[] dp = new int[n];
        Arrays.fill(dp,(int)1e9);
        dp[0] = 0;
        if(dp.length==1){
            out.print(0);
        }
        else{
            dp[1] = Math.abs(a[1]-a[0]);
            for(int i = 2; i<n; i++){
                for(int k = i-1, temp = 1; k>=0 && temp<=limit; k--, temp++){
                    dp[i] = Math.min(dp[i],Math.abs(a[i]-a[k])+dp[k]);
                }
            }
            out.print(dp[n-1]);
        }
        out.close();
    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

        public String nextLine() {
            try {
                return reader.readLine();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }

        public boolean hasNext() {
            String next = null;
            try {
                next = reader.readLine();
            } catch (Exception e) {
            }
            if (next == null) {
                return false;
            }
            tokenizer = new StringTokenizer(next);
            return true;
        }

        public BigInteger nextBigInteger() {
            return new BigInteger(next());
        }
    }
}

