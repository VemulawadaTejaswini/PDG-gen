import java.util.*;
import java.io.*;
 
public class Main {
    static boolean[][] used;
    static int[] ans;
    public static void main(String[] args) throws Exception {
        long max = 100000 * 20000000000L;
        FastScanner sc = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = sc.nextInt();
        long m = sc.nextLong();
        int[] a = sc.nextIntArray(n);
        long[] cumA = new long[n+1];
        int[] cumN = new int[200001];
        Arrays.sort(a);
        for(int i = 0; i < n; i++){
            cumA[i+1] = a[i] + cumA[i];
            cumN[a[i]]++;
        }
        for(int i = cumN.length-1; i > 0; i--){
            cumN[i-1] += cumN[i];
        }
        int left = -1;
        int right = 200000+1;
        while(right - left > 1){
            int mid = (left+right)/2;
            long cnt = 0;
            for(int v : a){
                cnt += cumN[Math.max(0,mid-v)];
            }
            if(cnt >= m){
                left = mid;
            }else{
                right = mid;
            }
        }
        long ans = 0;
        int total = 0;
        for(int v : a){
            int cnt = cumN[Math.max(0,left-v)];
            total += cnt;
            ans += v*cnt+(cumA[n]-cumA[n-cnt]);
        }
        System.out.println(ans);
        //System.out.println(ans-(total-m)*left);
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


