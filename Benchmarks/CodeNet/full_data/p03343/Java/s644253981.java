import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int Q = sc.nextInt();
    int array[] = new int[N];
    for (int i = 0; i < N; i++) {
      array[i] = sc.nextInt();
    }
    solve(N, K, Q, array);
  }

  private static void solve(int N, int K, int Q, int array[]) {
    List<Integer> list = new ArrayList<>();
    int ans = Integer.MAX_VALUE;

    for (int i = 0; i < N; i++) {
      int selected = array[i]; // smallest
      for (int j = 0; j < N; j++) {
        if (array[j] >= selected) {
          list.add(array[j]);
        } else {
          if (list.size() >=  K + Q - 1) {
            list.sort(Integer::compare);
            int qthsmallest = list.get(Q-1);
            int tmp = qthsmallest - selected;
            if (tmp < ans) {
              ans = tmp;
            }
          }
          list.clear();
        }
      }
      if (list.size() >=  K + Q - 1) {
        list.sort(Integer::compare);
        int qthsmallest = list.get(Q-1);
        int tmp = qthsmallest - selected;
        if (tmp < ans) {
          ans = tmp;
        }
      }
      list.clear();
    }
    System.out.println(ans);
  }
}
