import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int W = scanner.nextInt();
    int H = scanner.nextInt();
    int N = scanner.nextInt();
    int left = 0, right = W, bottom = 0, top = H;
    for (int i = 0; i < N; i++) {
      int x = scanner.nextInt();
      int y = scanner.nextInt();
      int a = scanner.nextInt();
      switch (a) {
        case 1:
          left = Math.max(left, x);
          break;
        case 2:
          right = Math.min(right, x);
          break;
        case 3:
          bottom = Math.max(bottom, y);
          break;
        case 4:
          top = Math.min(top, y);
          break;
      }
    }
    System.out.println(Math.max(right - left, 0) * Math.max(top - bottom, 0));
  }
}
