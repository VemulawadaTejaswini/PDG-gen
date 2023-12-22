import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        int m = sc.nextInt();
        int k = sc.nextInt();
        int max = (int)Math.pow(2,m);
        if(m % 2 == 1){
            if(k == 0){
                StringBuilder sb = new StringBuilder();
                for(int i = 0; i < max; i++){
                    sb.append(i + " " + i + " ");
                }
                System.out.println(sb.toString().trim());
            }else{
                System.out.println(-1);
            }
        }else{
            if(max <= k){
                System.out.println(-1);
                return;
            }else if(k == 0){
                StringBuilder sb = new StringBuilder();
                for(int i = 0; i < max; i++){
                    sb.append(i + " " + i + " ");
                }
                System.out.println(sb.toString().trim());
            }else{
                StringBuilder sb = new StringBuilder();
                for(int i = max-1; i >= 1; i--){
                    if(i != k){
                        sb.append(i + " ");
                    }
                }
                sb.append(k + " " + 0 + " ");
                for(int i = 1; i < max; i++){
                    if(i != k){
                        sb.append(i + " ");
                    }
                }
                sb.append(0 + " " + k + " ");
                System.out.println(sb.toString().trim());
            }
        }
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
