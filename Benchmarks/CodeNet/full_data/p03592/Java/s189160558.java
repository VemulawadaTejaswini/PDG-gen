import java.util.*;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int k = sc.nextInt();
    int count = 0;

    for(int i = 0; i<=n; i++) {
      count = i * m;
      if(count == k) {
        System.out.println("Yes");
        return;
      }
      for(int j = 0; j<=m; j++) {
        count += j * n - 2 * i * j;
        if(count == k) {
          System.out.println("Yes");
          return;
        }
      }
    }
    System.out.println("No");
  }
}
