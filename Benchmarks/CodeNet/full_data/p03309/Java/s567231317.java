import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        long minSum = 0;
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
            minSum += Math.abs(nums[i] - (i + 1));
        }
        
        for (int i = 1; i < Integer.MAX_VALUE; i++) {
            int minSumA = 0;
            for (int j = 0; j < n; j++) {
                minSumA += Math.abs(nums[j] - (i + j + 1));
            }
            
            if (minSumA < minSum) {
                minSum = minSumA;
            } else {
                break;
            }
        }
        
        for (int i = 1; i < Integer.MAX_VALUE; i++) {
            int minSumA = 0;
            for (int j = 0; j < n; j++) {
                minSumA += Math.abs(nums[j] - (-i + j + 1));
            }
            
            if (minSumA < minSum) {
                minSum = minSumA;
            } else {
                break;
            }
        }
        
        System.out.println(minSum);
    }
}
