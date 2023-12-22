import java.util.Scanner;

/**
 * Main
 */
public class Main {
  public static void main(String[] args) {
    (new Main()).run();
  }

  public void run() {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int size = 0;
    for (int i = 0; i < m; i++) {
      int task = sc.nextInt();
      size += task;
    }
    int result = n - size;
    System.out.println(result < 0 ? -1 : result);
  }
}