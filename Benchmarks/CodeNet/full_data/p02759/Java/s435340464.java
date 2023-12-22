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
    System.out.println(n / 2 + n % 2);
  }
}