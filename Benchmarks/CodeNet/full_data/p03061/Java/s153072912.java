import java.util.*;

public class Main {
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

            for (int j = 1; j <= (int) Math.sqrt(nums[i]); j++) {
                if (nums[i] % j == 0) {
                    divs.put(j, divs.getOrDefault(j, 0) + 1);
                    divs.put(nums[i] / j, divs.getOrDefault(nums[i] / j, 0) + 1);
                }
            }
        }

        int best = 1;

        for (int div : divs.keySet()) {
            if (divs.get(div) >= n - 1) {
                best = Math.max(best, div);
            }
        }

        System.out.println(best);
    }
}