import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int sum = 0;
    int mul = 1;
    int[] a = new int[n];

    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
      mul *= a[i];
    }

    for (int i = 0; i < n; i++) {
      sum += mul / a[i];
    }

    System.out.println((1.0 * mul) / sum);

  }
}