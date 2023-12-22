import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] nums = new Integer[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        Arrays.sort(nums, Collections.reverseOrder());
        int aliceSum = 0;
        int bobSum = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                aliceSum += nums[i];
            } else {
                bobSum += nums[i];
            }
        }
        System.out.println(aliceSum - bobSum);
    }
}