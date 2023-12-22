import java.util.*;

public class Main {

  public static void main(String[] args) {
    Main m = new Main();
    m.exec();
  }

  private void exec() {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
	int m = scan.nextInt();
    int result = n * m - (2 * m + 2 * (n - 2))
    System.out.println(result);
  }
}