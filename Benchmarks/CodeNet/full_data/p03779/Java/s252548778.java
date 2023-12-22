import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int X = scanner.nextInt();

    for (int i = 1; i <= X; i++) {
      int d = i * (i + 1) / 2;
      if (d >= X) {
        System.out.println(i);
        return;
      }
    }
  }
}
