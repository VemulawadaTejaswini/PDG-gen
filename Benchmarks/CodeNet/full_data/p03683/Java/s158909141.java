import java.util.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long N=sc.nextLong();
    long M=sc.nextLong();
    long sum_N = 1;
    long sum_M = 1;
    long ans = 0;
    int n_m = Math.abs(N-M);
    
    if(n_m < 2){
      for(long i = N;i <= 0;i--){
        sum_N *= i;
      }
      for(long j = M;j <= 0;j--){
        sum_M *= j;
      }
      if(n_m == 0){
        ans =sum_N * sum_M * 2;
      }else{
        ans =sum_N * sum_M;
      }
    }
    System.out.println(ans);
  }
}
      