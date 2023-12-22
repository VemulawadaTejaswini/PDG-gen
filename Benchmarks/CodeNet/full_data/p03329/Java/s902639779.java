import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) {
    new Main().run();
  }

  public void run() {
    
    try(BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {

      int n = Integer.parseInt(in.readLine());
      int[] dp = new int[n+1];
      dp[0] = 0;
      for(int i=1; i<=n; i++) {
        dp[i] = Integer.MAX_VALUE;
        
        for(int pow = 1; pow <= i; pow *= 6) {
          dp[i] = Math.min(dp[i], dp[i-pow]+1);
        }

        for(int pow = 9; pow <= i; pow *= 9) {
          dp[i] = Math.min(dp[i], dp[i-pow]+1);
        }
      }

      System.out.println(dp[n]);
    }
    catch(IOException e) {
      System.err.println(e);
    }
  }
}