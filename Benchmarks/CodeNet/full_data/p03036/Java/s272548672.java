import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int r = scanner.nextInt();
    int D = scanner.nextInt();
    int x2000 = scanner.nextInt();

    long prev_x = x2000;

    for (int i = 0; i < 10; i++) {
      prev_x = r * prev_x - D;
      System.out.println(prev_x);
    }
  }
}