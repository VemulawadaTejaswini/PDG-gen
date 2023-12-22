import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int count = 0;
    int[] a = new int[N];
    for (int i = 0; i < N; i++) a[i] = scanner.nextInt();
    for (int i = 0; i < N; i++) {
      if (a[i] != i + 1) count++;
    }
    if (count <= 2) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
  }
}
