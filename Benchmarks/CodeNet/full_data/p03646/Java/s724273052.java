import java.util.*;
import java.io.*;
 
public class Main {
    static String[] word = {"dream", "dreamer", "erase", "eraser"};
    static int[] wordlen = {5,7,5,6};
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        long k = sc.nextLong();
        System.out.println(50);
        long[] ans = new long[50];
        Arrays.fill(ans,49);
        long pow = k/50L;
        long rem = k%50L;
        for(int i = 0; i < 50; i++){
            ans[i] += pow;
        }
        for(int i = 0; i < rem; i++){
            ans[i] += 50;
            for(int j = 0; j < 50; j++){
                if(i == j) continue;
                ans[j]--;
            }
        }
        for(int i = 0; i < 50; i++){
            System.out.print(ans[i] + " ");
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
