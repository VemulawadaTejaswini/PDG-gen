import java.util.*;
import java.io.*;
 
public class Main {
    static boolean[] arrived;
    static ArrayList<ArrayList<Integer>> li;
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();
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
        System.out.println(beamSearch(k,a,f));
    }
    
    public static long beamSearch(long k, Long[] a, long[] f){
        int n = a.length;
        long left = 0;
        long right = (long)Math.pow(10,12)+1;
        while(right - left > 1){
            long mid = (right + left)/2L;
            long tmp = 0;
            for(int i = 0; i < n; i++){
                tmp += Math.max(0,a[i]-(mid/f[i]));
            }
            if(tmp <= k){
                right = mid;
            }else{
                left = mid;
            }
        }
        return right;
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
