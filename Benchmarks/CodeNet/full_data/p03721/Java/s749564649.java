import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[][] nums = new int[n][2];
        for (int i = 0; i < n; i++) {
            nums[i][0] = sc.nextInt();
            nums[i][1] = sc.nextInt();
        }
        
        Arrays.sort(nums, (a, b) -> Integer.compare(a[1], b[1]));
        Arrays.sort(nums, (a, b) -> Integer.compare(a[0], b[0]));
        
        int count = 0;
        for (int i = 0; i < n; i++) {
            count += nums[i][1];
            
            if (count >= k) {
                System.out.println(nums[i][0]);
                return;
            }
            
        }
    }
}
