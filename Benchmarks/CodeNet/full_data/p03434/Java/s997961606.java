import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    Integer[] a = new Integer[n];

    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }

    Arrays.sort(a, Collections.reverseOrder());

    int b = 0;
    int c = 0;

    for (int i = 0; i < n; i++) {
      if (i % 2 == 0) {
        b += a[i];
      } else {
        c += a[i];
      }
    }
    
    System.out.println(b - c);
  }
}
