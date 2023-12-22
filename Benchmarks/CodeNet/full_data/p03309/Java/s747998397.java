import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] nums = new int[n];
    int countPlus = 0;
    int countZero = 0;
    for (int i = 0; i < n; i++) {
      nums[i] = sc.nextInt() - (i + 1);

    }
    Arrays.sort(nums);
    int b = 0;
    if (n % 2 == 0) {
      b = ((nums[n / 2] + nums[n / 2 - 1]) / 2);
    } else {
      b = nums[n / 2];
    }
    int total = 0;
    for (int i = 0; i < n; i++) {
      nums[i] -= b;
      total += Math.abs(nums[i]);
    }
    System.out.println(total);
  }
}