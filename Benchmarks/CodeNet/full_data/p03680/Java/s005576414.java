import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }

    int now = 1;
    int next = 0;

    for (int i = 0; i < n; i++) {
      next = a[now - 1];
      now = next;
      if (next == 2) {
        System.out.println(i + 1);
        return;
      }
    }

    System.out.println(-1);

  }
}