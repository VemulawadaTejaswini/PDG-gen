import java.util.Scanner;

class Main{
  
  static int solve(int[] h, int N){
    int[] dp = new int[N];
    dp[0] = 0;
    dp[1] = Math.abs(h[1] - h[0]);

    for(int i = 2; i< N; i++){
      dp[i] = Math.min(dp[i-1] + Math.abs(h[i] - h[i-1]), dp[i-2] + Math.abs(h[i] - h[i-2]));
    }
    return dp[N-1];
  }

  public static void main(String... args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Input N");
    int N = sc.nextInt();
    
    int[] h = new int[N];
    System.out.println(String.format("Input %d heights" , N));
    for(int i =0; i< N; i++){
       h[i]= sc.nextInt();
    }
    //_________________________
    int result = solve(h, N);
    System.out.println(result);

    if(sc != null)
      sc.close();
  }  
}