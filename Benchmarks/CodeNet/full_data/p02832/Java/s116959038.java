import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    int count = 1;
    int ans = 0;

    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }

    for (int i = 0; i < n; i++) {
      if (a[i] == count) {
        count++;
      } else if (a[i] != count) {
        ans++;
      }
    }

    if (ans < n) {
      System.out.println(ans);
    } else {
      System.out.println(-1);
    }

  }
}
