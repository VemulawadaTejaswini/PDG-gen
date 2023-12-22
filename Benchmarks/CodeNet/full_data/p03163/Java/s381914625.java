import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int W = sc.nextInt();
    long[][] memo = new long[N+1][W+1];
    for(int i = 0; i <= N; i++){
      Arrays.fill(memo[i], -1);
    }
    memo[0][0] = 0;
    int[] w = new int[N];
    long[] v = new long[N];
    for(int i = 0; i < N; i++){
      w[i] = sc.nextInt();
      v[i] = sc.nextLong();
    }
    System.out.println(solve(memo, w, v, W, N));
  }
  
  public static long solve(long[][] memo, int[] w, long[] v, int W, int N){
    for(int i = 0; i < N; i++){
      for(int j = 0; j <= W; j++){
        if(memo[i][j] != -1){
          if(w[i] + j <= W){
            long tmp = memo[i][j] + v[i];
            memo[i+1][w[i]+j] = memo[i+1][w[i]+j] > tmp ? memo[i+1][w[i]+j] : tmp;
          }
          memo[i+1][j] = memo[i+1][j] > memo[i][j] ? memo[i+1][j] : memo[i][j];
        }
      }
    }
    Arrays.sort(memo[N]);
    return memo[N][W];
  }
}