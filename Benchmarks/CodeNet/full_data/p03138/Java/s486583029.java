import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Main {
  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
  static long K;
  static int kLength, N;
  static long[] A;
  static long[] dp;
  
	public static void main (String[] args) throws IOException {    
    String[] first = br.readLine().split(" ");
    N = Integer.parseInt(first[0]);
    K = Long.parseLong(first[1]);
    kLength = Long.toBinaryString(K).length();
    A = new long[N];
    dp = new long[kLength];
    
    String[] line = br.readLine().split(" ");
    for(int i = 0; i < N; i++) {
      A[i] = Long.parseLong(line[i]);
    }
    
    long ans = getSum(dp(kLength-1));
    // long ans = dp(kLength-1);
    
    bw.write(ans + "\n");
    
    bw.close();
	}

  public static long dp(int index) {
    if(index == -1) {
      return 0;
    }

    if(dp[index] == 0) {

      long first = dp(index-1);
      long second = first + (1 << index);

      long firstSum = getSum(first);
      long secondSum = getSum(second);

      if(second > K) dp[index] = first;

      else if(firstSum < secondSum) {
        dp[index] = second;
      }

      else dp[index] = first;
    }

    return dp[index];
  }

  public static long getSum(long curr) {
    long sum = 0;
    for(int i = 0; i < N; i++) {
      sum += curr ^ A[i];
    }

    return sum;
  }
}
