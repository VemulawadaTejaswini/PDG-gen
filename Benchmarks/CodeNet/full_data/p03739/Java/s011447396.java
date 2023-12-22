import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    int count1 = 0;
    int sum1 = 0;
    // 最初の和が正
    for (int i = 0; i < n; i++) {
      sum1 += a[i];
      if (i % 2 == 0) {
        while (sum1 <= 0) {
          sum1++;
          count1++;
        }
      } else {
        while (sum1 >= 0) {
          sum1--;
          count1++;
        }
      }
    }
    int count2 = 0;
    int sum2 = 0;
    // 最初の和が負
    for (int i = 0; i < n; i++) {
      sum2 += a[i];
      if (i % 2 == 0) {
        while (sum2 >= 0) {
          sum2--;
          count2++;
        }
      } else {
        while (sum2 <= 0) {
          sum2++;
          count2++;
        }
      }
    }
    int ans = Integer.min(count1, count2);
    System.out.println(ans);
  }
}