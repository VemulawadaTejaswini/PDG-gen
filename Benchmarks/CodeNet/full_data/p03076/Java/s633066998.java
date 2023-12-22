import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int[] a = new int[5];
    for (int i = 0; i < 5; i++) a[i] = scanner.nextInt();
    int sum = 0;
    int max = 0;
    for (int i = 0; i < 5; i++) {
      int d = (a[i] + 9) / 10 * 10;
      sum += d;
      max = Math.max(max, d - a[i]);
    }
    System.out.println(sum - max);
  }
}
