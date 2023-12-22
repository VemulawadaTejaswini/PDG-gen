import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int A = 1000000007;
    int num = 1;
    for(int i = 2; i <= N; i++) {
      if(isPrime(i)) {
        int power = 0;
        for(int k = 1; k < 10; k++) {
          if(N >= Math.pow(i, k)) {
            power += (N / (int)Math.pow(i, k));
          } else {
            break;
          }
        }
        num = (num * (power + 1)) % A;
      }
    }
    System.out.println(num);
  }

  public static boolean isPrime(int n) {
    boolean flg = true;
    for(int i = 2; i * i <= n; i++) {
      if(n % i == 0) {
        flg = false;
        break;
      } 
    }
    return flg;
  }
}