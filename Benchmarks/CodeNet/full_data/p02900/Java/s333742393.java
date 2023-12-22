import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    long b = sc.nextLong();
    long gcd = gcd(a, b);
    System.out.println(countDivisor(gcd));
  }

  private static long gcd(long a, long b){
    if(a % b == 0) return a > b ? b : a;
    return gcd(b, a % b);
  }

  private static int countDivisor(long n){
    int count = 0;
    for(long i = 2; i * i <= n; i++){
      if( n % i != 0){
        continue;
      }
      count++;
      n /= i;
    }
    if(n > 1) count++;
    return ++count;
  }
}

