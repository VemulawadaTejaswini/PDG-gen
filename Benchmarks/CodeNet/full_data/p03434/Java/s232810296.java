import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        Arrays.sort(nums);
        int aliceSum = 0;
        int bobSum = 0;
        boolean isAliceTurn = true;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (isAliceTurn) {
                aliceSum += nums[i];
                isAliceTurn = false;
            } else {
                bobSum += nums[i];
                isAliceTurn = true;
            }
        }
        System.out.println(aliceSum - bobSum);
    }
}