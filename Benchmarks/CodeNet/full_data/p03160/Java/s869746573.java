import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author radhakm
 * https://atcoder.jp/contests/dp/tasks/dp_a
 */
public class Main {
    static int[] h;
    static int n;
    static Integer[] dp;
    public static void main(String[] args) {
        InputReader reader = new InputReader(System.in);
        n = reader.nextInt();
        h = new int[n];
        dp = new Integer[n];
        for(int i=0;i<n;i++){
            h[i] = reader.nextInt();
        }
        System.out.println(frogJump(0));
    }

    static int frogJump(int idx){
        if(idx == n-1){
            return 0;
        }
        if(dp[idx]!=null){
            return dp[idx];
        }

        int minCost = Math.abs(h[idx] - h[idx+1]) + frogJump(idx+1);
        if(idx+2<n) {
            int cost = Math.abs(h[idx] - h[idx+2]) + frogJump(idx+2);
            minCost = Math.min(minCost,cost);
        }
        dp[idx] = minCost;
        return minCost;
    }
}

class InputReader {
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
}