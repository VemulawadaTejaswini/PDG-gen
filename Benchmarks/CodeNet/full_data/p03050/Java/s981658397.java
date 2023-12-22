import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long N = sc.nextLong();
    long ans = 0;
    
    for(long i=1;i<=N;i++){
      long a = N / i;
      long b = N % i;
      if(a==b){
        ans += i;
      }
    }
    System.out.println(ans);
  }
}
