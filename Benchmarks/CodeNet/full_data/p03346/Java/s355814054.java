import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n = sc.nextInt();
        int[] a = sc.nextIntArray(n);
        int now = 1;
        int[] cnt = new int[n+1];
        for(int i = 0; i < n; i++){
            cnt[i+1] = cnt[i];
            if(a[i] == now){
                now++;
            }else{
                cnt[i+1]++;
            }
        }
        int[] cnt2 = new int[n+1];
        int now2 = n;
        for(int i = n-1; i >= 0; i--){
            cnt2[i] = cnt2[i+1];
            if(a[i] == now2){
                now2--;
            }else{
                cnt2[i]++;
            }
        }
        pw.println(Math.min(cnt[n],cnt2[0]));
        /*
        int ans = 0;
        for(int i = 0; i <= n; i++){
            pw.println(cnt[i] + " " + cnt2[i]);
            ans = Math.max(ans,cnt[i]+cnt2[i]-1);
        }
        pw.println(ans);
        */
        pw.flush();
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
