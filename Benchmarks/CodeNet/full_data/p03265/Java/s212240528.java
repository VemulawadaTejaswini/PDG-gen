
import java.util.Scanner;

public class Main {


  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int x1 = scanner.nextInt();
    int y1 = scanner.nextInt();
    int x2 = scanner.nextInt();
    int y2 = scanner.nextInt();

    int xlen = x2 - x1;
    int ylen = y2 - y1;

    System.out.printf("%d %d %d %d\n", x2 - ylen, y2 + xlen, x1 - ylen, y1 + xlen);
  }

}
