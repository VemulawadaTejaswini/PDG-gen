import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        String s = sc.next();

        List<Integer> nums = new ArrayList<>();

        char prev = s.charAt(0);
        if (prev == '0') {
            nums.add(0);
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == prev) {
                count++;
            } else {
                nums.add(count);
                prev = s.charAt(i);
                count = 1;
            }
        }
        if (count != 0) {
            nums.add(count);
        }
        if (prev == '0') {
            nums.add(0);
        }

        int c = 0;
        int[] sum = new int[nums.size() + 1];
        int i = 1;
        for (Integer num : nums) {
            sum[i] = sum[i - 1] + num;
            i++;
        }

        int result = 0;
        for (int l = 0; l < sum.length; l += 2) {
            int r = l + 2 * k + 1;
            if (r >= sum.length) r = sum.length - 1;
            result = Math.max(result, sum[r] - sum[l]);
        }

        System.out.println(result);
    }
}
