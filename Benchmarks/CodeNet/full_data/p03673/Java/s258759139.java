import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    int tmp = 0;
    if (n % 2 == 1) {
      tmp = a[n - 1];
    }
    n--;
    int[] a2 = new int[n];
    for (int i = 0; i < n; i++) {
      if (i % 2 == 0) {
        a2[(i + n) / 2] = a[i];
      } else {
        a2[(n - i) / 2] = a[i];
      }
    }
    n++;
    if (n % 2 == 0) {
      for (int i = 0; i < a2.length; i++) {
        System.out.print(a2[i] + " ");
      }
    } else {
      System.out.print(tmp);
      for (int i = a2.length - 1; i >= 0; i--) {
        System.out.print(" " + a2[i]);
      }
    }
  }
}