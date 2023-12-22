import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        PriorityQueue<Integer> q = new PriorityQueue<Integer>(Comparator.reverseOrder());
        long mod = (long)1e9+7;
        int n = sc.nextInt();
        int max = (int)rep2(2,n,mod);
        for(int i = 0; i < max; i++){
            q.add(sc.nextInt());
        }
        int now = q.poll();
        for(int i = 0; i < n; i++){
            int roops = (int)rep2(2,i,mod);
            int min = Integer.MAX_VALUE;
            for(int j = 0; j < roops; j++){
                int tmp = q.poll();
                if(now == tmp){
                    System.out.println("No");
                    return;
                }
                min = tmp;
            }
            now = min;
        }
        System.out.println("Yes");
    }
    
    private static long rep2(long b, long n, long mod){
        if(n == 0) return 1;
        long bn = rep2(b,n/2,mod);
        if(n % 2 == 0){
            return (bn*bn)%mod;
        }else{
            return (bn*bn)%mod*b%mod;
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
