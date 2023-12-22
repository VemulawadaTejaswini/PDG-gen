import java.util.Scanner;

public class Main {
  static long n, s;

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    n = sc.nextLong();  s = sc.nextLong();

    long ans = -1;
    if(n == s){
      ans = n + 1;
    }
    if(n > s){
      for(long b = 2; b * b <= n; b++){
        if(f(b, n) == s){
          ans = b;
          break;
        }
      }
      if(ans == -1){
        for(long p = 1; p * p < n; p++){
          long b = (n - s) / p + 1;
          if(f(b, n) == s){
            ans = b;
            break;
          }
        }
      }
    }

    System.out.println(ans);
  }

  private static long f(long b, long n){
    if(n < b){
      return n;
    }
    return f(b, n / b) + (n % b);
  }
}
