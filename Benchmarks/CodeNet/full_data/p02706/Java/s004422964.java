import java.util.*;

public class Main {

  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    int n = scan.nextInt();
    int m = scan.nextInt();

    for (int i = 0; i < m; i++) {
      int d = scan.nextInt();
      n -= d;
    }

    System.out.println(n >= 0 ? n : -1);
  }
}