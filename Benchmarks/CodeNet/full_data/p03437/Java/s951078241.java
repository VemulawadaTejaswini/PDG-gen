import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    long X = scanner.nextLong();
    long Y = scanner.nextLong();

    new Main().execute(X, Y);
  }

  public void execute(long X, long Y) {
    if (X % Y == 0) {
      System.out.println("-1");
      return;
    }

    for (long i = 2; i < Y - 1; i++) {
      if ((X * i) % Y != 0) {
        System.out.println(X * i);
        return;
      }
    }

    System.out.println("-1");
  }

}
