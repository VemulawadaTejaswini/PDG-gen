import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int X = sc.nextInt();
    if (X % 2 == 0 && X != 2) {
      X += 1;
    }
    while (true) {
      boolean A = isPrime(X);
      if (A) {
        System.out.println(X);
        break;
      } else {
        X += 2;
      }
    }
  }

  public static boolean isPrime(int num) {
    if (num < 2)
      return false;
    else if (num == 2)
      return true;
    else if (num % 2 == 0)
      return false; // 偶数はあらかじめ除く

    for (int i = 3; i < num; i += 2) {
      if (num % i == 0) {
        // 素数ではない
        return false;
      }
    }

    // 素数である
    return true;
  }
}
