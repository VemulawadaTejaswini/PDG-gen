import java.util.Scanner;

class Frog2{
  static final int INF = (int)1e9+7;
  static int solve(int[] h, int N, int K){
    int[] dp = new int[N];
    dp[0] = 0;
    for(int i= 1; i< N; i++){
      dp[i] = INF;
      for(int j = 1; j <= K; j++)
      	if(i-j >= 0)
      		dp[i] = Math.min(dp[i], dp[i-j] + Math.abs(h[i] - h[i-j]));
    }
    return dp[N-1];
  }

  

  public static void main(String... args){

    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int[] h = new int[N];
    for(int i =0; i< N; i++){
       h[i]= sc.nextInt();
    }
    //_________________________
    int result = solve(h, N, K);
    System.out.println(result);

    if(sc != null)
      sc.close();

  }  
}