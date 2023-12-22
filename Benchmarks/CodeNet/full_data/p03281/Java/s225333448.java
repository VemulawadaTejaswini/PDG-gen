import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int ans = 0;

    for (int i = 3; i <= n; i+=2) {
      int count = 0;
      for (int k = 1; k <= n; k++) {
        if (i%k == 0) {
          count++;
        }
      }
      if (count == 8) {
        ans++;
      }
    }

    System.out.println(ans);

  }

}
