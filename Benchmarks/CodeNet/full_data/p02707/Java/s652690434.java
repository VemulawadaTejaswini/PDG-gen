import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] a = new int[n];
    for (int i = 0; i < n-1; i++) {
      int num = scanner.nextInt();
      a[num-1]++;
    }
    for (int i = 0; i < n; i++) {
      System.out.println(a[i]);
    }

  }
}
