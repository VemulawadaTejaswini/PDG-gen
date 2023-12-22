import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int m = sc.nextInt();
    int[] start = new int[n];
    int[] end = new int[n];

    for (int i=0; i < m; i++) {
      int a = sc.nextInt();
      int b = sc.nextInt();

      start[a-1] += 1;
      end[b-1] += 1;
    }

    int ans = 0;
    int flag = 1;
    int tmp_count = 0;

    for (int i=0; i < n; i ++) {
      if (flag == 1) {
        if (start[i] > 0) {
          flag = -1;
          tmp_count = start[i]
        }
      } else if (flag == -1) {
        if (end[i] > 0) {
          ans++;
          tmp_count - end[i];
          if (tmp_count == 0 && start[i] > 0) {
            flag = 1;
          }
        }
      }
    }

    System.out.println(ans);
  }
}
