import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        int n = sc.nextInt();
        int[] a = sc.nextIntArray(n);
        long total = 0;
        for(int i = 0; i < n; i++){
            a[i] -= sc.nextInt();
            total += a[i];
        }
        if(total < 0){
            System.out.println(-1);
            return;
        }
        Arrays.sort(a);
        int l = 0;
        int r = n-1;
        boolean[] changed = new boolean[n];
        while(r >= 0 && l < n){
            if(a[l] >= 0){
                break;
            }else{
                changed[l] = true;
                changed[r] = true;
                if(-a[l] > a[r]){
                    a[l] += a[r];
                    a[r] = 0;
                    r--;
                }else{
                    a[r] += a[l];
                    a[l] = 0;
                    l++;
                }
            }
        }
        int ans = 0;
        for(int i = 0; i < n; i++){
            if(changed[i]){
                ans++;
            }
        }
        System.out.println(ans);
    }
}

class FastScanner {
    private BufferedReader reader = null;
    private StringTokenizer tokenizer = null;
    public FastScanner(InputStream in) {
        reader = new BufferedReader(new InputStreamReader(in));
        tokenizer = null;
    }
    
    public void close() throws Exception{
        this.reader.close();
        return;
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
