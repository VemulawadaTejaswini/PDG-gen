import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // 入力処理
        Scanner sc = new Scanner(System.in);

        int[] nums = Stream.of(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = nums[0];
        int k = nums[1];
        String[] strs = sc.nextLine().split("");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < n; i++) {
            String tmp = "";
            if (i + 1 == k) {
                tmp = strs[i].toLowerCase();
            } else {
                tmp = strs[i];
            }
            result.append(tmp);
        }

        System.out.println(result);
    }
}
