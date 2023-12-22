import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
	public static void main (String[] args) {
      Scanner in = new Scanner(System.in);
      int N = in.nextInt();
      int K = in.nextInt();
      int[] a = new int[N+1];
      for (int i = 1; i <= N; i++) {
        a[i] = in.nextInt();
      }
      long[][] dp = new long[N+1][K+1];
      for(int i=0; i<= N ;i++){
        dp[i][0] = 1;
      }
      long[] temp = new long[K+1];
      long modulo = 1000000000+7;
      for(int i = 0; i<= N ;i++){
        temp[0] = 1;
        for(int j = 1; j<=K; j++){
          dp[i][j] = temp[j];
          
          if(i != N){
            temp[j] = (dp[i][j] + temp[j-1]) % modulo;
            temp[j] = (temp[j] - (( j-a[i+1]-1 >=0) ? dp[i][j-a[i+1]-1] : 0)) % modulo;
          }
        }
      }
      System.out.println(dp[N][K] % (modulo));
	}
}
