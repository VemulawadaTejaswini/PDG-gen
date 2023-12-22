import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long M = sc.nextLong();
    System.out.println(ans(N, M));
  }
  
  public static long ans(int N, long M){
    if(N == 0){
      return 1L;
    }
    if(N == 1) return ans(N - 1, M);
    long count = 0;
    for(long i = 1; i <= M; i++){
      if(M % i == 0){
        count += ans(N - 1, M / i);
        count = count >= 1000000000L+7 ? count % 1000000000L+7 : count;
      }
    }
    return count;
  }
}

