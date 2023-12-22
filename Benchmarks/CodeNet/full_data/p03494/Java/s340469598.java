import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int inputs = sc.nextInt();
    int[] nums = new int[inputs];
    for (int i = 0; i < nums.length; i++) {
      nums[i] = sc.nextInt();
    }
    loop(nums);
  }

  private static int loop(int[] nums) {

    int ope = 0;
    for (int i = 0; i < nums.length; i++) {
      // 2つ目の整数
      if (nums[i] % 2 == 0) {
        nums[i] = nums[i] / 2;
      } else {
        System.out.println(loop(nums));
        return ope;
      }
    }
    return loop(nums);
  }
}
