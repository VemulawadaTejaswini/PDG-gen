import java.util.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long N=sc.nextLong();
    long M=sc.nextLong();
    long sum_N = 0;
    long sum_M = 0;
    
    if(ABS(N-M) < 2){
      for(i = N;i = 0;i--){
        sum_N *= i;
      }
      for(j = M;j = 0;j--){
        sum_M *= j;
      }
    }
    System.out.println(sum_N * sum_M);
  }
}
      