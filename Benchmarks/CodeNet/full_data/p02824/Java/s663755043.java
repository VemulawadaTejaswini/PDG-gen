import java.util.*;

public class Main implements Runnable {

    private static int MOD = 1_000_000_007;

    public static void main(String[] args) {
        // Run with 32MB stack
        Thread thread = new Thread(null, new Main(), "", 32 * 1024 * 1024);
        thread.start();
    }

    @Override
    public void run() {
        final Scanner scanner = new Scanner(System.in);
        solve(scanner);
    }

    static void solve(Scanner scanner) {
        int N = Integer.parseInt(scanner.next());
        long M = Long.parseLong(scanner.next());
        int V = Integer.parseInt(scanner.next());
        int P = Integer.parseInt(scanner.next());
        long[] nums = new long[N];
        for (int i = 0; i < N; i++) {
            nums[i] = Long.parseLong(scanner.next());
        }
        Arrays.sort(nums);

        long ans = 0;
        int diff = P - 1;
        if (V <= P) {
            ans = diff;
            for (int i = 0; i < N - diff; i++) {
                if (nums[i] + M >= nums[N - diff - 1]) {
                    ans++;
                }
            }
        } else {
            ans = diff;
            long[] cSum = new long[N + 1];
            for (int i = 1; i <= N; i++) {
                cSum[i] = cSum[i - 1] + nums[i - 1];
            }
            for (int i = 0; i < N - diff; i++) {
                long A = nums[i] + M;
                int index = Arrays.binarySearch(nums, 0, N - diff, A);
                if (index < 0) {
                    index = -(index + 1);
                }
                if (index > N - diff - 1 || nums[index] == nums[N - diff - 1]) {
                    long cap = A * index;
                    long sum = cSum[index + 1] - nums[i];
                    long fill = M * (V - diff);
                    if (cap - sum >= fill) {
                        ans++;
                    }
                }
            }
        }

        System.out.println(ans);
    }
}
