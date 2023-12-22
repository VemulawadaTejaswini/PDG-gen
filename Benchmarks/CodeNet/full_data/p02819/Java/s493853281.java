import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    while(true) {
      if(isPrime(n)) {
        System.out.println(n);
      } else {
        n++;
      }
    }
  }

  private static boolean isPrime(final int n) {
    if(n < 2 || n % 2 == 0) {
      return false;
    }
    if(n == 2) {
      return true;
    }
    for (int i = 3; i <= Math.sqrt(n); i++) {
      if(n % i == 0) {
        return false;
      }
    }
    return true;
   }
}
