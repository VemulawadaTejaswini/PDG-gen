import java.io.*;
import java.util.*;

public class Main {
    
    public static void main(String[] args) throws IOException {
        int N = in.nextInt();         // number of items
        int W = in.nextInt();         // capacity
        int[] weight = new int[N];    // weights
        int[] value = new int[N];     // values
        
        for(int i = 0; i < N; i++){
            weight[i] = in.nextInt();
            value[i] = in.nextInt();
        }

        long[] dp = new long[W + 1];
        // without repetition - each item can be taken only once
        for(int n = 0; n < N; n++){
            for(int w = W; w >= weight[n]; w--){
                dp[w] = Math.max(dp[w], dp[w - weight[n]] + value[n]);
            }
        }

        out.println(dp[W]);
        in.close();
        out.close();
    }
  
    static Reader in = new Reader();
    static PrintWriter out = new PrintWriter(System.out);
}

class Reader {
    BufferedReader reader;
    StringTokenizer tokenizer;

    Reader() {
        reader = new BufferedReader(new InputStreamReader(System.in));
        tokenizer = new StringTokenizer("");
    }

    String next() throws IOException {
        while (!tokenizer.hasMoreTokens() ) { 
            tokenizer = new StringTokenizer(reader.readLine()); 
        }
        return tokenizer.nextToken();
    }

    int nextInt() throws IOException { 
        return Integer.parseInt(next()); 
    }
    
    void close() throws IOException { 
        reader.close(); 
    }
}
