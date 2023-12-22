import java.util.*;

public class Main {

  public static void main(String[] args) {
    Main m = new Main();
    m.exec();
  }

  private void exec() {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int sum = 0;
    for (int i = 0; i < n; i++) {
      int l = scan.nextInt();
      int r = scan.nextInt();
      sum += r - l + 1;
    }
    System.out.println(sum);
  }
}