
import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int h = scanner.nextInt();
    int w = scanner.nextInt();

    if (h % 2 == 0 || w % 2 == 0) {
      System.out.println(h * w / 2);
    } else {
      System.out.println(h * w / 2 + 1);
    }

  }
}
