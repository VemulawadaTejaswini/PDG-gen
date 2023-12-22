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
    int[] buka = new int[n];
    for (int i = 0; i < n - 1; i++) {
      int joshi = sc.nextInt();
      buka[joshi - 1]++;
    }
    for (int i = 0; i < buka.length; i++) {
      System.out.println(buka[i]);
    }
  }
}