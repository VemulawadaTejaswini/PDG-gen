import java.util.*;

public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    int[] a = new int[n + 1];
    int[] b = new int[n + 1];
    for (int i = 1; i <= n; i++) {
      a[i] = sc.nextInt();
      b[a[i]] = i;
    }

    for (int i = 1; i <= n; i++) {
      System.out.print(b[i]);
      if (i != n) System.out.print(" ");
    }
    
    System.out.println();
  }
}