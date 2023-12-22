import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] x = new int[N];
    int[] y = new int[N];
    for (int i = 0; i < N; i++) {
      x[i] = sc.nextInt();
      y[i] = sc.nextInt();
    }
    double d = 0;

    for (int[] p : perm(N)) {
      for (int i = 1; i < p.length; i++) {
        int p1 = p[i - 1];
        int p2 = p[i];
        d += dist(x[p1], y[p1], x[p2], y[p2]);
      }
    }
    System.out.println(d / fact(N));
  }

  static int fact(int n) {
    int ans = 1;
    while (n > 0) {
      ans *= n--;
    }
    return ans;
  }

  static double dist(int x1, int y1, int x2, int y2) {
    return Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
  }

  static List<int[]> perm(int n) {
    List<int[]> res = new ArrayList<>();
    int[] nums = new int[n];
    for (int i = 0; i < n; i++) {
      nums[i] = i;
    }
    helper(0, nums, res);
    return res;
  }

  private static void helper(int start, int[] nums, List<int[]> result) {
    if (start == nums.length - 1) {
      result.add(Arrays.copyOf(nums, nums.length));
      return;
    }

    for (int i = start; i < nums.length; i++) {
      swap(nums, i, start);
      helper(start + 1, nums, result);
      swap(nums, i, start);
    }
  }

  private static void swap(int[] nums, int i, int j) {
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
  }
}
