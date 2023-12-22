import java.io.*;
import java.util.StringTokenizer;

public final class Main{
    public static void main(String[] args){
        FastScanner stdIn = new FastScanner(System.in);
        long n = stdIn.nextLong();
        long[] h = new long[(int)n];
        for(int i=0; i<n; i++){
            h[i] = stdIn.nextLong();
        }

        for(int i=(int)n-2; i>=0; i--){
            if(h[i]-h[i+1]>1){
                System.out.println("No");
                return;
            }else if(h[i]-h[i+1]==1){
                h[i] = h[i]-1;
            }
        }
        System.out.println("Yes");
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
    
    public long nextInt() {
        return Integer.parseInt(next());
    }

}
