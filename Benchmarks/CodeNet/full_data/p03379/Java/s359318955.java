import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        int[] nums2 = new int[n];
        for(int i = 0; i < n; i++) {
            int num = sc.nextInt();
            nums[i] = num;
            nums2[i] = num;
        }
        
        Arrays.sort(nums2);
        int medianA = nums2[n / 2 - 1];
        int medianB = nums2[n / 2];
        
        for (int i = 0; i < n; i++) {
            int num = nums[i];
            if (num <= medianA) {
                System.out.println(medianB);
            } else {
                System.out.println(medianA);
            }
        }
    }
}
