import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    long A = sc.nextLong();
    long B = sc.nextLong();
    long C = gcd(A, B);
    
    int ans = 1;
    long N = (long)Math.sqrt(C);
    for(int i = 2; i <= N && C > 1; i++){
      boolean flag = false;
      while(C%i == 0){
        C /= i;
        flag = true;
      }
      
      if(flag){
        ans++;
      }
    }
    System.out.println(ans);
  }
  public static long gcd(long A, long B){
    if(A < B){
      return gcd(B, A);
    }
    
    if(B == 0){
      return A;
    }
    
    return gcd(B, A%B);
  }
}
