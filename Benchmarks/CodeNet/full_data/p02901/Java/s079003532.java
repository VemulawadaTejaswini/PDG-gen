import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<Key> keys = new ArrayList<>();
        for(int i = 0; i < m; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int t = 0;
            for(int j = 0; j < b; j++){
                t += 1 << (sc.nextInt()-1);
            }
            keys.add(new Key(a,b,t));
        }
        int[][] dp = new int[m+1][n*n];
        for(int i = 0; i <= m; i++){
            Arrays.fill(dp[i],Integer.MAX_VALUE/2);
        }
        dp[0][0] = 0;
        for(int i = 0; i < m; i++){
            Key k = keys.get(i);
            for(int j = 0; j < n*n; j++){
                dp[i+1][j] = Math.min(dp[i+1][j],dp[i][j]);
                dp[i+1][j | k.t] = Math.min(dp[i+1][j | k.t], dp[i][j] + k.c);
            }
        }
        System.out.println(dp[m][n*n-1] == Integer.MAX_VALUE/2 ? -1 : dp[m][n*n-1]);
    }
}

class Key{
    int c, o, t;
    public Key(int c, int o, int t){
        this.c = c;
        this.o = o;
        this.t = t;
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
