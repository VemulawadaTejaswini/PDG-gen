import java.util.Scanner;
import java.util.Arrays;

public class Main {
  void run() {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] s = new int[n];
    int sum = 0;
    for (int i = 0; i < n; i++) {
      s[i] = sc.nextInt();
      sum += s[i];
    }

    if (sum % 10 != 0) {
      System.out.println(sum);
    } else {
      Arrays.sort(s);
      for (int i = 0; i < n; i++) {
        if (s[i] % 10 == 0) {
          continue;
        }
        System.out.println(sum - s[i]);
        return;
      }
      System.out.println(0);
    }
  }
 
  public static void main(String[] args) {
    new Main().run();
  }
}
