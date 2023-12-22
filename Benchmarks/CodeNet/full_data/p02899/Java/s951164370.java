import java.util.Scanner;

class Main {
  public static void main(String argv[]) {
    int n;
    Scanner sc = new Scanner(System.in);
    n = Integer.parseInt(sc.next());
    int a[] = new int[n];
    for (int i = 0;i < n;i++) {
      a[i] = Integer.parseInt(sc.next());
    }
    for (int i = 1;i <= n;i++) {
      for (int j = 0;j < n;j++) {
        if (a[j] == i)
          System.out.print((j + 1) + " ");
      }
    }
    System.out.println();
  }
}