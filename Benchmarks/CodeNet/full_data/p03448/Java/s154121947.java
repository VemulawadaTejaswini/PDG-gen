import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int c = scanner.nextInt();
    int x = scanner.nextInt();

    int count = 0;

    for (int aCount = 0; aCount <= a; aCount++) {
      for (int bCount = 0; bCount <= b; bCount++) {
        for (int cCount = 0; cCount <= c; cCount++) {
          int result = aCount * 500 + bCount * 100 + cCount * 50;


          if (result == x) {
            count++;
          }
        }
      }
    }

    System.out.println(count);
    scanner.close();
  }
}
