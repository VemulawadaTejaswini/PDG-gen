import java.util.Scanner;

public class Main {
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    long X = sc.nextLong();
    long Y = sc.nextLong();
    long ans = Integer.MAX_VALUE;
    if (Y >= X) {
      ans = Y - X;
    }
    if (-Y >= X) {
      ans = Math.min(ans, -Y - X + 1);
    }
    if (Y >= -X) {
      ans = Math.min(ans, Y + X + 1);
    }
    if (-Y >= -X) {
      ans = Math.min(ans, -Y + X + 2);
    }
    System.out.println(ans);
  }

}
