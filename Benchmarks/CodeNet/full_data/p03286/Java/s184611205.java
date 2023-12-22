import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        long n = sc.nextLong();
        StringBuilder sb = new StringBuilder();
        if(n < 0){
            n = Math.abs(n-2);
            long tmp = 2;
            for(int i = 0;;i++){
                if(Math.abs(n) % tmp != 0){
                    n -= (n%tmp);
                    sb.append(1);
                }else{
                    sb.append(0);
                }
                n /= -2;
                if(n == 0){
                    break;
                }
            }
        }else{
            long tmp = 2;
            for(int i = 0;;i++){
                if(Math.abs(n % tmp) != 0){
                    if(i % 2 == 0){
                        n -= (n%tmp);
                    }else{
                        n += (n%tmp);
                    }
                    sb.append(1);
                }else{
                    sb.append(0);
                }
                tmp *= 2;
                if(n == 0){
                    break;
                }
            }
        }
        System.out.println(sb.reverse().toString());
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
