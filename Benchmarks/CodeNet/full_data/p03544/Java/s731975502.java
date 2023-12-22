import java.util.*;

public class Main{
  static long[] memo;
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next());
    memo = new long[N+1];
    memo[0] = 2;
    memo[1] = 1;
    System.out.println(func(N));
  }
  public static long func(int N){
    if(memo[N] > 0){
      return memo[N];
    }
    
    return memo[N] = func(N-1) + func(N-2);
  }
}