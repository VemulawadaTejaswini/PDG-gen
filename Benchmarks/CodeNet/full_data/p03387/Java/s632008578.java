import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int[] nums = new int[3];
        for (int i = 0; i < 3; i++) {
            nums[i] = cin.nextInt();
        }
        Arrays.sort(nums);
        int distance1 = nums[2] - nums[0];
        int distance2 = nums[2] - nums[1];
        int count = distance1 / 2 + distance2 / 2;
        int evenodd = distance1 % 2 + distance2 % 2;
        count += (evenodd == 1) ? 2 : (evenodd == 2) ? 1 : 0;
        System.out.println(count);
    }
}
