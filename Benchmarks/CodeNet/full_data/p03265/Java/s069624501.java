import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      int x1 = sc.nextInt();
      int y1 = sc.nextInt();
      int x2 = sc.nextInt();
      int y2 = sc.nextInt();
      System.out.println(solve(x1, y1, x2, y2));
    }
  }

  public static String solve(int x1, int y1, int x2, int y2) {
    int[] r = new int[4];
    int d1 = y1 - y2;
    int d2 = x1 - x2;
    r[0] = x2 + d1; 
    r[1] = y2 - d2;
    r[2] = r[0] + d2;
    r[3] = r[1] + d1;
    return String.format("%d %d %d %d\n", r[0], r[1], r[2], r[3]);
  }
}
