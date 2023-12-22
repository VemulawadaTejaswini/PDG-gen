
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    long h = scanner.nextLong();
    long w = scanner.nextLong();

    if (h % 2 == 0 || w % 2 == 0) {
      System.out.println((h * w) / 2);
    } else {
      System.out.println((h * w) / 2 + 1);
    }

  }
}
