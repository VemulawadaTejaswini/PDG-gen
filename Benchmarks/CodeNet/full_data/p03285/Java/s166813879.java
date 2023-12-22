
import java.util.*;

public class Main {
public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int total = 0;
  
  if (N < 4) {
    System.out.println("No");
    return;
  }

    for (int i = 0; total <= N; i++) {
      total = 4 * i;
      for (int j = 0; total <= N; j++) {
          total += 7 * j;
          if (N == total) {
            System.out.println("Yes");
            return;
          }
      }
    }

    System.out.println("No");
  }
}
