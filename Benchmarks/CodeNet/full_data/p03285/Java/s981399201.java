
import java.util.*;

public class Main {
public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int total = 0;
  
  if (N < 4) {
    return;
  }

    for (int i = 0; total <= N; i++) {
      for (int j = 0; total <= N; j++) {
          total = 4 * i + 7 * j;
          if (N == total) {
            System.out.println("Yes");
            return;
          }
      }
      total = 0;
    }

    System.out.println("No");
  }
}
