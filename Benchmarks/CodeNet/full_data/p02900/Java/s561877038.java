import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    long A = sc.nextLong();
    long B = sc.nextLong();
    long g = gcd(A,B);

    int ans = 1;
    long f = (long)Math.sqrt(g);
    for(int i = 2; i <= f; i++){
      if(g%i == 0){
        ans++;
        while(g%i == 0){
          g /= i;
        }
      }
    }
    if(g > 1){
      ans++;
    }
    System.out.println(ans);
  }
  public static long gcd(long a, long b){
    if(b == 0){
      return a;
    }
    return gcd(b, a%b);
  }
}
