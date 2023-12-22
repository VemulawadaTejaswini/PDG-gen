import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
        Arrays.sort(nums);
        int k = sc.nextInt();
        int ans = nums[0] + nums[1] + (int) (nums[2] * Math.pow(2, k));
        System.out.println(ans);
    }

}
