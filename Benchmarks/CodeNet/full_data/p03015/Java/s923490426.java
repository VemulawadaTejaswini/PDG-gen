import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        long mod = (long)Math.pow(10,9)+7;
        char[] S = sc.next().toCharArray();
        int len = S.length;
        long[][] dp = new long[len+1][2];
        dp[0][0] = 1;
        for(int i = 0; i < len; i++){
            int c = S[i] - '0';
            //ai+bi = 0;
            if(S[i] == '0'){
                dp[i+1][0] = dp[i][0];
                dp[i+1][1] = dp[i][1];
            }else{
                dp[i+1][1] = (dp[i][0] + dp[i][1]) % mod;
            }
            //ai+bi = 1;
            if(S[i] == '0'){
                dp[i+1][1] += dp[i][1]*2;
                dp[i+1][1] %= mod;
            }else{
                dp[i+1][0] += dp[i][0]*2;
                dp[i+1][0] %= mod;
                dp[i+1][1] += dp[i][1]*2;
                dp[i+1][1] %= mod;
            }
        }
        System.out.println((dp[len][0] + dp[len][1]) % mod);
    }
}

class FastScanner {
    private BufferedReader reader = null;
    private StringTokenizer tokenizer = null;
    public FastScanner(InputStream in) {
        reader = new BufferedReader(new InputStreamReader(in));
        tokenizer = null;
    }

    public String next() {
        if (tokenizer == null || !tokenizer.hasMoreTokens()) {
            try {
                tokenizer = new StringTokenizer(reader.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return tokenizer.nextToken();
    }

    public String nextLine() {
        if (tokenizer == null || !tokenizer.hasMoreTokens()) {
            try {
                return reader.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return tokenizer.nextToken("\n");
    }

    public long nextLong() {
        return Long.parseLong(next());
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }

    public double nextDouble() {
         return Double.parseDouble(next());
    }
    
    public String[] nextArray(int n) {
        String[] a = new String[n];
        for (int i = 0; i < n; i++)
            a[i] = next();
        return a;
    }

    public int[] nextIntArray(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = nextInt();
        return a;
    }

    public long[] nextLongArray(int n) {
        long[] a = new long[n];
        for (int i = 0; i < n; i++)
            a[i] = nextLong();
        return a;
    } 
}
