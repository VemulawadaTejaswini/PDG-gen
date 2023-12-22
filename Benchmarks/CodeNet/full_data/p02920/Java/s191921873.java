import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = 1;
    while (t-- > 0) {
      int n = sc.nextInt();
      int pow = 1 << n;
      Integer[] nums = new Integer[pow];
      for (int i = 0; i < pow; i++) {
        nums[i] = sc.nextInt();
      }
      Arrays.sort(nums, (i1, i2) -> Integer.compare(i2, i1));
      boolean valid = true;
      int crnt = 0, start = 1;
      while (n-- > 0 && valid) {
        int nxt = 1 << crnt++;
        int temp = 0;
        for (int i = start; i < start + nxt; i++) {
          if (nums[i] >= nums[temp++]) {
            valid = false;
            break;
          }
        }
        start += nxt;
      }
      System.out.println(valid ? "Yes" : "No");
    }
  }
}