import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // 入力処理
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Integer[] nums = Stream.of(sc.nextLine().split(" ")).map(Integer::valueOf).toArray(Integer[]::new);

        Arrays.sort(nums, Comparator.reverseOrder());
        int alice = 0;
        int bob = 0;
        boolean turnAlice = true;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                alice+=nums[i];
            } else {
                bob+=nums[i];
            }
        }

        System.out.println(alice - bob);
    }
}
