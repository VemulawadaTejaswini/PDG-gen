import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int q = sc.nextInt();
    String[] line = sc.next().split("");
    int[] nums = new int[n];
    boolean flg = false;
    int current = 0;
    for (int i = 0; i < n; i++) {
      if (flg && "C".equals(line[i])) {
        current++;
        flg = false;
      } else if ("A".equals(line[i])) {
        flg = true;
      } else {
        flg = false;
      }
      nums[i] = current;
    }
    for (int i = 0; i < q; i++) {
      int a = sc.nextInt() - 1;
      int b = sc.nextInt() - 1;
      System.out.println(nums[b] - nums[a]);
    }
  }
}