import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // 入力処理
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine().split("")[0]);
        int t = 0, x = 0, y = 0;
        boolean ok = true;

        for (int i = 0; i < n; i++) {
            int[] nums = Stream.of(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            t = nums[0] - t;

            x = nums[1] - x;
            y = nums[2] - y;

            // 偶数・奇数が揃っていない場合はNG
            if (t % 2 == 0) {
                if ((x + y) % 2 != 0) {
                    ok = false;
                    break;
                }
            } else {
                if ((x + y) % 2 == 0) {
                    ok = false;
                    break;
                }
            }

            // そこまで行けない場合はNG
            if (t < x + y) {
                ok = false;
                break;
            }
        }

        if (ok) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
