import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = Stream.of(sc.nextLine().split("")).mapToInt(Integer::parseInt).toArray();

        // 1000
        int n = 1 << nums.length - 1;

        for (int i = 0; i < n; i++) {
            int sum = nums[0];
            String str = String.valueOf(nums[0]);
            for (int k = 0; k < nums.length - 1; k++) {
                if ((i & (1 << k)) != 0) {
                    // 足し算
                    sum += nums[k+1];
                    str += "+" + nums[k+1];
                } else {
                    // 引き算
                    sum -= nums[k+1];
                    str += "-" + nums[k+1];
                }
            }
            if (sum == 7) {
                System.out.println(str + "=7");
                return;
            }
        }
    }
}