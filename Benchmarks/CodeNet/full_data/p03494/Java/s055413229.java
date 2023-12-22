import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        int[] nums = Stream.of(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int cnt = 0;
        for (int i = 0; i < num; i++) {
            if (nums[i] % 2 != 0) {
                break;
            }
            int div = nums[i] / 2;
            nums[i] = div;
            cnt++;
        }
        System.out.println(cnt);
    }
}
