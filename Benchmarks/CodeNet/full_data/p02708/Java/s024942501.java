import java.io.*;
import java.util.*;
public class Main{
    private static void solver(InputReader sc, PrintWriter out) throws Exception {
        int n = sc.nextInt();
        int k = sc.nextInt();
        long mod = 1000000007;
        long sum=0;
        long pre[] = new long[n+1];
        pre[0] = 0;
        for(int i=1; i<n+1; i++){
            pre[i] = i + pre[i-1];
        }
        long suf[] = new long[n+1];
        suf[n] = n;
        for(int i=n-1;i>=0; i--){
            suf[i] = i+suf[i+1];
        }
      /* for(long xx : suf)
           out.print(xx+" ");
       out.println();
        for(long xx : pre)
            out.print(xx+" ");*/
        for(int i=k-1; i<n+1; i++){
            sum += (suf[n-i]-pre[i] + 1)%mod;
            sum %=mod;
        }
        out.println(sum);
    }
    private static boolean helper(long x){
        double ans = Math.sqrt(x);
        return ans%1!=0;
    }

    private static int gcd(int a, int b){
        if(b==0)
            return a;
        return gcd(b, a%b);
    }
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        solver(in,out);
        out.close();
    }
    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }
        public long nextLong() {
            return Long.parseLong(next());
        }
        public int[] readIntArray(int n){
            int arr[] = new int[n];
            for(int i=0;i<n;i++) arr[i] = nextInt();
            return arr;
        }
    }
}
class Pair  {
    int x;
    int y;

    Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair pair = (Pair) o;
        return x == pair.x &&
                y == pair.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}