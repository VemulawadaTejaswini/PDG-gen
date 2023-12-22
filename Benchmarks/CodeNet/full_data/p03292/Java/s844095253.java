import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[3];
        for(int i = 0; i < 3; i++)
        	nums[i] = sc.nextInt();
        Arrays.sort(nums);
        int cost = 0;
        for(int i = 1; i < 3; i++)
        	cost += nums[i] - nums[i - 1];

        System.out.println(cost);
    }
}
