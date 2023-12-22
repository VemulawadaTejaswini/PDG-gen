import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // 要素数
    int inputs = sc.nextInt();

    // 要素を配列に格納する
    int[] nums = new int[inputs];
    for (int i = 0; i < inputs; i++) {
      nums[i] = sc.nextInt();
    }

    // 配列に格納された要素1つ1つについて、条件を満たさないものをカウントする
    int illegals = 0;
    for (int i = 0; i < inputs; i++) {
      for (int j = 0; j <= i; j++) {
        if (nums[i] > nums[j]) {
          illegals++;
          break;
        }
      }
    }
    System.out.println(inputs - illegals);
  }
}
