import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static int total = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = sc.nextInt();
        }
        me(nums);
        System.out.println(Main.total);

    }

    public static void me(int[] nums) {

        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            min = num < min ? num : min;
        }
        Main.total += min;
        int ti = 0;
        int i;
        for (i = 0; i < nums.length; i++) {
            nums[i] -= min;
            if (nums[i] == 0) {
                if (ti < i) {
                    me(Arrays.copyOfRange(nums, ti, i));
                }
                ti = i + 1;
            }
        }
        if (ti < i) {
            me(Arrays.copyOfRange(nums, ti, i));
        }
    }
}