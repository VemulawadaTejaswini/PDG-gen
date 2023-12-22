import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        int max = Integer.MAX_VALUE;
        FastScanner sc = new FastScanner(System.in);
        int d = sc.nextInt();
        long g = sc.nextLong();
        long[] p = new long[d];
        long[] c = new long[d];
        for(int i = 0; i < d; i++){
            p[i] = sc.nextLong();
            c[i] = sc.nextLong();
        }
        long ans = Long.MAX_VALUE;
        for(int i = 0; i < (2 << d); i++){
            long tmp = 0;
            long now = 0;
            int maxUseLess = -1;
            for(int j = 0; j < d; j++){
                if((i >> j) % 2 == 0){
                    maxUseLess = j;
                }else{
                    tmp += p[j];
                    now += c[j]+(j+1)*100*p[j];
                }
            }
            if(maxUseLess != -1){
                if(g <= now){
                    ans = Math.min(ans,tmp);
                }else if((g-now) > (maxUseLess+1) * p[maxUseLess] * 100){
                    continue;
                }else{
                    tmp += (long)Math.ceil((g-now)/(double)((maxUseLess+1) *100));
                    ans = Math.min(ans,tmp);
                }
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
