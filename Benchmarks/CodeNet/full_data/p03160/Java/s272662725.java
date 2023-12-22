import java.util.stream.*;
import java.io.*;

public class Main {
  
  static int n;
  static long[] dp, h;

  static long max(long a, long b, long c){
    return Math.max(Math.max(a, b), c);
  }

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String[] in;
    in = br.readLine().split(" ");
    n = Integer.parseInt(in[0]);

    in = br.readLine().split(" ");
    h = Stream.of(in).mapToLong(Long::parseLong).toArray();

    br.close();

    dp = new long[n+1];
    dp[2] = Math.abs(h[1] - h[0]);
    for(int i = 3; i <= n; i++){
      dp[i] = Math.min(dp[i-1] + Math.abs((h[i-1] - h[i-2])), dp[i-2] + Math.abs((h[i-1] - h[i-3])));
    }
    
    System.out.println(dp[n]);
  }
}