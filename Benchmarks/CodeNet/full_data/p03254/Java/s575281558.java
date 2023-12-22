import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int x = scanner.nextInt();
    int[] a = new int[N];
    for (int i = 0; i < N; i++) {
      a[i] = scanner.nextInt();
    }
    Arrays.sort(a);

    int count = 0;
    for (int i = 0; i < N; i++) {
      if (x >= a[i]) {
        count++;
        x -= a[i];
      } else {
        break;
      }
    }
    System.out.println(count);
  }
}
