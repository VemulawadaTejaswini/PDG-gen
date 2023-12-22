import java.util.*;

public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int a[] = new int[n];
    for (int i = 0; i < n; i++) a[i] = sc.nextInt();
    
    int y = 0;
    while (true) {
      int x = 0;
      for (int i = 0; i < n; i++) {
        if (a[i] % 2 == 0) {
          a[i] /= 2;
          x++;
        } else {
          break;
        }
      }
      if (x == n) {
        y++;
      } else {
        break;
      }
    }
    
    System.out.println(y);
 }
}