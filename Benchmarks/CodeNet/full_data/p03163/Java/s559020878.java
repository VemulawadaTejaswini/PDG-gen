import java.util.*;
public class Main{
  public static long[][] memo;
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int W = sc.nextInt();
    memo = new long[N][W+1];
    for(int i = 0; i < N; i++){
      Arrays.fill(memo[i], -1);
    }
    int[] w = new int[N];
    long[] v = new long[N];
    for(int i = 0; i < N; i++){
      w[i] = sc.nextInt();
      v[i] = sc.nextLong();
    }
    System.out.println(solve(w, v, W));
  }
  
  public static long func(int W, int wn, int[] wa, long[] va, int n){
    if(n == wa.length) return 0;
    if(memo[n][wn] != -1) return memo[n][wn];
    if(wa[n] <= wn){
      long tmp = Math.max(va[n] + func(W, wn-wa[n], wa, va, n+1),
                    func(W, wn, wa, va, n+1));
      memo[n][wn] = tmp;
      return tmp;
    }
    return func(W, wn, wa, va, n+1);
  }
  
  public static long solve(int[] w, long[] v, int W){
    return func(W, W, w, v, 0);
  }
}