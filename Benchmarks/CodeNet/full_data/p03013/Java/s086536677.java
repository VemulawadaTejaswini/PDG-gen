import java.util.*;

public class Main{
  static int p = 1000000007;
  static long[] memo;
  static boolean[] check;
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String[] S = sc.nextLine().split(" ");
    int N = Integer.parseInt(S[0]);
    int M = Integer.parseInt(S[1]);
    check = new boolean[N+1];
    memo = new long[N+1];
    
    for(int i = 0; i < M; i++){
      int n = Integer.parseInt(sc.nextLine());
      check[n] = true;
    }
    
    long ans = func(N);
    System.out.println(ans);
  }
  
  public static long func(int N){
    if(check[N]){
      return 0;
    }
    
    if(N == 0 || N == 1){
      return 1;
    }
    
    if(memo[N] > 0){
      return memo[N];
    }
    
    return memo[N] = (func(N-1) + func(N-2)) % p;
  }
}