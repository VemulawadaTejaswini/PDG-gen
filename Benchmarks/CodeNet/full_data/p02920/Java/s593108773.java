import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    TreeMap<Integer, Integer[]> map = new TreeMap<>();
    int n = sc.nextInt();
    int pow = (int) Math.pow(2, n);
    Integer[] nums = new Integer[pow];
    for (int i = 0; i < pow; i++) {
      nums[i] = sc.nextInt();
    }
    Arrays.sort(nums, (i1, i2) -> Integer.compare(i2, i1));
    boolean valid = true;
    int crnt = 0, start = 1;
    while (n > 0 && valid) {
      int nxt = (int) Math.pow(2, crnt++);
      for (int i = start; i < start + nxt; i++) {
        if (nums[i] >= nums[i - nxt]) {
          valid = false;
          break;
        }
      }
      start += nxt;
      n--;
    }
    System.out.println(valid ? "Yes" : "No");
  }
}