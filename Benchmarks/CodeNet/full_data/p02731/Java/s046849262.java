import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int l = sc.nextInt();

    int max = 0;
    for (int x = 1; x < l; x++) {
      for (int y = 1; y < l; y ++) {
        if (x + y >= l) {
          continue;
        }
        int tmp = x * y * (l - x - y);
        if (tmp > max) {
          max = tmp;
        }
      }
    }

    System.out.println(max);
  }
}
