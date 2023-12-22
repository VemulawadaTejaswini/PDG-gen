import java.util.*;
import static java.lang.System.*;

public class Main{
  public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
	  
	  int N = sc.nextInt();
	  int K = sc.nextInt();
	  int[] H = new int[N];
	  int[] dp = new int[N];
	  for(int i=0; i<N; i++) {
		  H[i] = sc.nextInt();
		  dp[i] = 10100;
	  }
	 
	 dp[0] = 0;
	 for (int i=1; i<K; i++) {
		 for(int j=1; j<=i ; j++) {
			 int n = dp[i - j] + Math.abs(H[i] - H[i - j]);
			 if ( dp[i] > n) dp[i] = n;
		 }	 
	 }
	 
	 for(int i = K; i< N; i++) {
		 for(int j=1; j<=K; j++) {
			 int n = dp[i - j] + Math.abs(H[i] - H[i - j]);
			 if ( dp[i] > n) dp[i] = n;
		 }

	 }
	 for ( int i: dp) out.print(i + " ");
	out.println("\n" + dp[N - 1]);
  }
}