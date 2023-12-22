import java.util.*;

public class Main{
  static long N;
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    N = sc.nextLong();
    long ans = 0;
    if(N == 0){
      ans = 1;
    }else if(N%2 == 0){
      N /= 2;
      long m = 5;
      while(m < N){
        ans += N/m;
        m *= 5;
      }
    }
    System.out.println(ans);
  }
}