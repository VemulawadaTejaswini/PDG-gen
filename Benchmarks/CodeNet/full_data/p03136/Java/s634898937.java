import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(sc.next());
        }
        int max = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] > max) {
               max = nums[i];
            }
            sum += nums[i];
        }
        if (max < sum - max) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
