import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int[] a = new int[N];
    for (int i = 0; i < N; i++) {
      a[i] = scanner.nextInt();
    }

    int count = 0;
    for (int i = 1; i < N; i++) {
      if (a[i] == a[i - 1]) {
        count++;
        i++;
      }
    }
    System.out.println(count);
  }
}
