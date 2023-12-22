import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int inputs = sc.nextInt();
    int[] nums = new int[inputs];
    for (int i = 0; i < nums.length; i++) {
      nums[i] = sc.nextInt();
    }

    int ope = 0;
    while (true) {
      for (int i = 0; i < nums.length; i++) {
        // 割り切れないなら現在の操作回数を出力して終了
        if (nums[i] % 2 == 0) {
          nums[i] = nums[i] / 2;
        } else {
          System.out.println(ope);
          return;
        }
      }
      // 全探索を終えたら操作回数を増やす
      ope++;
    }
  }
}
