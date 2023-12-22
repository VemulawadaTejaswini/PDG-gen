import java.util.*;

public class Main {
    public static void main(String[] args) {
        solve(new Scanner(System.in));
//        solve(new Scanner(ex));
    }

//    private static final String ex = "3 2\n" +
//            "100 50 200";
//    private static final String ex = "5 8\n" +
//            "50 30 40 10 20\n";
    private static final String ex = "10 100\n" +
        "7 10 4 5 9 3 6 8 2 1";

    private static void solve(Scanner scanner) {
        String[] split = scanner.nextLine().split(" ");
        int N = Integer.parseInt(split[0]);
        int T = Integer.parseInt(split[1]);

        split = scanner.nextLine().split(" ");
        long nums[] = new long[N];
        for (int i = 0; i < N; i ++) nums[i] = Long.parseLong(split[i]);

        long min = nums[0];
        long maxGap = 0;
        for (int i = 1; i < N; i ++) {
            maxGap = Math.max(maxGap, nums[i] - min);
            min = Math.min(min, nums[i]);
        }

        int result = 0;
        Set<Long> set = new TreeSet<>();
        for (int i = 0; i < N; i ++) {
            if (set.contains(nums[i] - maxGap)) result ++;
            set.add(nums[i]);
        }

        System.out.println(result);
    }
}
