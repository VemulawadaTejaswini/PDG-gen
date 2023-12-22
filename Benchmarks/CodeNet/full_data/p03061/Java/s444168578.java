import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        int n = sc.nextInt();
        long[] a = sc.nextLongArray(n);
        long[] la = new long[n];
        la[0] = a[0];
        long[] ra = new long[n];
        ra[n-1] = a[n-1];
        for(int i = 1; i < n; i++){
            la[i] = gcd(la[i-1],a[i]);
        }
        for(int i = n-2; i >= 0; i--){
            ra[i] = gcd(ra[i+1],a[i]);
        }
        long ans = 0;
        for(int i = 0; i < n; i++){
            if(i == 0){
                ans = Math.max(ans,ra[i+1]);
            }else if(i == n-1){
                ans = Math.max(ans,la[i-1]);
            }else{
                ans = Math.max(ans,gcd(la[i-1],ra[i+1]));
            }
        }
        System.out.println(ans);
    }
    private static long gcd(long a, long b){
        while (b > 0){
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
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
