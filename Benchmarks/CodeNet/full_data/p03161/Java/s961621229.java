
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] s = sc.nextLine().split(" ");
    int N = Integer.parseInt(s[0]);
    int K = Integer.parseInt(s[1]);
    String[] str = sc.nextLine().split(" ");
    int[] ans = new int[N];
    ans[0] = 0;
    for (int i = 1; i < N; i++) {
      ans[i] = Integer.MAX_VALUE;
    }

    for (int i = 0; i < N; i++) {
      for (int j = i + 1; j <= i + K && j < N; j++) {
        ans[j] =
            Math.min(
                ans[j], Math.abs(Integer.parseInt(str[j]) - Integer.parseInt(str[i])) + ans[i]);
      }
    }
    System.out.println(ans[N - 1]);
  }
}
