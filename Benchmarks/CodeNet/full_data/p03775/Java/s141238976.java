import java.util.Scanner;
import static java.lang.Math.*;

class Main
{
  public static void main(String[]$) {
    long N = new Scanner(System.in).nextLong();
    int ans = 314159265;
    for (long i = 1; i*i <= N; ++i) {
      if(N % i == 0) {
        ans = min(ans, max($(i), $(N/i)));
      }
    }
    System.out.println(ans);
  }
  
  static int $(long n) {
    int cnt  = 0;
    while(n > 0) {
      n /= 10;
      ++cnt;
    }
    return cnt;
  }
}