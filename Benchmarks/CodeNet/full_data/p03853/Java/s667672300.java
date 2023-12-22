import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int H = scanner.nextInt();
    int W = scanner.nextInt();
    String[] s = new String[H];
    for (int i = 0; i < H; i++) {
      s[i] = scanner.next();
    }
    for (int i = 0; i < H * 2; i++) {
      System.out.println(s[i / 2]);
    }
  }
}
