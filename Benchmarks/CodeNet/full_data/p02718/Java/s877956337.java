import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int[] nums = new int[N];
        int sum = 0;
        for (int i = 0; i < N; i++) {
            nums[i] = scanner.nextInt();
            sum += nums[i];
        }
        scanner.close();

        int ans = 0;
        for (int i : nums) {
            if (i >= sum / (4 * M)) {
                ans++;
            }
        }

        if (ans >= M) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
