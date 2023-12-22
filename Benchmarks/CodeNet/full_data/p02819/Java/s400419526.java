import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();

    int max = 100010;
    for (int i = a; i <= max; i++) {
      if (isPrime(i)) {
        System.out.println(i);
        return;
      }
    }
  }

  private static boolean isPrime(int num) {
    for (int i = 2; i < num; i++) {
      if (num % i == 0) {
        return false;
      }
    }
    return true;
  }
}
