import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        Integer[] nums = new Integer[N];
        int sum = 0;
        for (int i = 0; i < N; i++) {
            nums[i] = scanner.nextInt();
            sum += nums[i];
        }
        scanner.close();

        Arrays.sort(nums, Collections.reverseOrder());

        if (nums[M - 1] < sum / (4 * M)) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
            ;
        }

    }
}
