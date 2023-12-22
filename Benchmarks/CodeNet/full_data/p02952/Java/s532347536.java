import java.util.Scanner;

public class Main {
  private static boolean isOddNumDigits (int n) {
    int count = 0;
    while (n > 0) {
      n /= 10;
      count++;
    }
    return count % 2 == 1;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.nextLine());
    sc.close();
    int count = 0;
    for (int i = 1; i <= n; i++) {
      count += isOddNumDigits(i) ? 1 : 0;
    }
    System.out.println(count);
  }
}