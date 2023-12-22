import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        solve(scanner);
    }

    static void solve(Scanner scanner) {
        int M = Integer.parseInt(scanner.nextLine().split(" ")[1]);
        long[] nums = Arrays.stream(scanner.nextLine().split(" ")).mapToLong(Long::parseLong).toArray();
        long[] cSum = new long[nums.length + 1];
        Map<Long, Long> m = new HashMap<>();
        m.put(0L, 1L);
        long ans = 0;
        for (int i = 1; i < nums.length + 1; i++) {
            cSum[i] += cSum[i - 1] + nums[i - 1];
            long rem = cSum[i] % M;
            ans += m.getOrDefault(rem, 0L);
            m.put(rem, m.getOrDefault(rem, 0L) + 1);
        }
        System.out.println(ans);
    }

}