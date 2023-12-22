import java.util.*;
import java.io.*;
 
public class Main {
    static char[] cl = {'3','5','7'};
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        long n = sc.nextLong();
        int len = String.valueOf(n).length();
        int[] used = new int[3];
        System.out.println(dfs(len,0,n,"",used));
    }
    
    private static long dfs(int len, int digit, long max, String s, int[] used){
        if(len == digit){
            if(Long.parseLong(s) <= max && used[0] >= 1 && used[1] >= 1 && used[2] >= 1){
                return 1;
            }else{
                return 0;
            }
        }
        long ret = used[0] >= 1 && used[1] >= 1 && used[2] >= 1 ? 1 : 0;
        int i = 0;
        for(char c : cl){
            used[i]++;
            ret += dfs(len,digit+1,max,s+c,used);
            used[i]--;
            i++;
        }
        return ret;
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
