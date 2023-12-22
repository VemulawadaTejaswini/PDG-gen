import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        
        long count = 0;
        
        
        if (nums[0] > x) {
            count += nums[0] - x;
            nums[0] = x;
        }
        
        for (int i = 1; i < n; i++) {
            if (nums[i - 1] + nums[i] > x) {
                count += nums[i - 1] + nums[i] - x;
                nums[i] -= nums[i - 1] + nums[i] - x;
            }
        }
        
        System.out.println(count);
    }
}