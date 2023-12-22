import java.util.*;

public class C {
    public static long gcd(long a, long b) {
        while (b != 0) {
            long tmp = b;
            b = a % b;
            a = tmp;
        }

        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

        HashMap<Integer, Integer> divs = new HashMap<>();

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int[] prefixGCD = new int[n - 1];

        prefixGCD[0] = nums[0];

        for (int i = 1; i < n - 1; i++) {
            prefixGCD[i] = (int) gcd(prefixGCD[i - 1], nums[i]);
        }

        int best = prefixGCD[n - 2];
        int runningGCDsuffix = nums[n - 1];

        for (int i = n - 2; i > 0; i--) {
            best = Math.max(best, (int) gcd(runningGCDsuffix, prefixGCD[i - 1]));
            runningGCDsuffix = (int) gcd(runningGCDsuffix, nums[i]);
        }

        best = Math.max(best, runningGCDsuffix);

        System.out.println(best);
    }
}