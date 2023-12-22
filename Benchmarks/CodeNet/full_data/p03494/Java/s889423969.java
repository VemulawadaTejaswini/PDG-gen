import java.util.*;
import java.util.Collections;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int min = Integer.MAX_VALUE;
    int cnt = 0;
    int N = sc.nextInt();
    for (int i = 0; i < N; i++) {
      cnt = 0;
      int A = sc.nextInt();
      while (A % 2 == 0) {
        cnt++;
        A /= 2;
      }
      min = Math.min(min, cnt);
    }
    System.out.println(min);
  }

  public static void primeFactorization(int num) {
    int Z = 0;
    for (int i = 2; num > i; i++) {
      while (num % i == 0) {
        System.out.println(i);
        num /= i;
        Z = num;
      }
    }
    System.out.println(Z);
  }

  public static boolean isPrime(int num) {
    if (num < 2)
      return false;
    else if (num == 2)
      return true;
    else if (num % 2 == 0)
      return false;

    for (int i = 3; i < num; i += 2) {
      if (num % i == 0) {
        return false;
      }
    }
    return true;
  }
}
