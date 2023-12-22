import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int X = scanner.nextInt();
    int Y = scanner.nextInt();

    new Main().execute(X, Y);
  }

  public void execute(int X, int Y) {
    if (X % Y == 0) {
      System.out.println("-1");
      return;
    }

    for (int i = 2; i < Y - 1; i++) {
      if ((X * i) % Y != 0) {
        System.out.println(X * i);
        return;
      }
    }

    System.out.println("-1");
  }

}
