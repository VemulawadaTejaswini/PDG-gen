import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int y = sc.nextInt();
    Boolean finded = false;
    out: for (int a = 0; a < n; a++) {
      for (int b = 0; b < n - a; b++) {
        int c = n - a - b;
        if (a * 10000 + b * 5000 + c * 1000 == y) {
          finded = true;
          System.out.println(String.format("%d %d %d", a, b, c));
          break out;
        }
      }
    }
    if (!finded) System.out.println("-1 -1 -1");
  }
}
