import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int sum = 0;
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      sum += arr[i] = sc.nextInt();
    }
    int half = sum / 2;
    int x = 0;
    int y = 0;

    for (int i = 0; i < arr.length; i++) {
      if (i >= 1 && i+1 == arr.length) {
        System.out.println(Math.abs(x - y));
        break;
      }
      x += arr[i];
      y = sum - x;
      if ((x + arr[i + 1]) > half) {
        int tmp_x = x + arr[i + 1];
        int tmp_y = sum - tmp_x;
        int ans = Math.abs(x - y);
        int tmp_ans = Math.abs(tmp_x - tmp_y);
        if (ans > tmp_ans) {
          System.out.println(tmp_ans);
          break;
        } else {
          System.out.println(ans);
          break;
        }
      }
    }
  }
}
