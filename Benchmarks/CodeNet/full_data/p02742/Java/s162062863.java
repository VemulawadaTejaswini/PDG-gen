import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    long H = scanner.nextInt();
    long W = scanner.nextInt();

    if (H == 1 || W == 1) {
      System.out.println(1);
      return;
    }
    long ws = W / 2;
    long wl = W - ws;
    long res = W * (H / 2);
    if (H % 2 != 0) {
      res += wl;
    }
    System.out.println(res);
  }
}
