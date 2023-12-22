import java.util.*;
import java.io.*;
 
public class Main {
    static boolean[] arrived;
    static ArrayList<ArrayList<Integer>> li;
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();
        /*
        long[] a = sc.nextLongArray(n);
        long[] f = sc.nextLongArray(n);
        Arrays.sort(a);
        Arrays.sort(f);
        */
        Long[] a = new Long[n];
        long[] f = new long[n];
        long total = 0;
        for(int i = 0; i < n; i++){
            long t = sc.nextLong();
            a[i] = t;
            total += t;
        }
        Arrays.sort(a,Collections.reverseOrder());
        if(total <= k){
            System.out.println(0);
            return;
        }
        for(int i = 0; i < n; i++){
            long t = sc.nextLong();
            f[i] = t;
        }
        Arrays.sort(f);
        long ans = Long.MAX_VALUE;
        boolean nextBreak = false;
        for(int i = 0; i < n; i++){
            long pow = (total-k)/(long)(n-i);
            long mod = (total-k)%(long)(n-i);
            long tmp = 0;
            if(mod != 0){
                tmp = Math.max((pow+1)*f[n-(int)mod],pow*f[n-i-1]);
            }else{
                tmp = pow*f[n-1];
            }
            ans = Math.min(ans,tmp);
            total -= a[i];
            k -= a[i];
            a[i] = 0L;
            if(nextBreak){
                break;
            }else if(k < 0){
                a[i] = -k;
                k = 0;
                nextBreak = true;
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
