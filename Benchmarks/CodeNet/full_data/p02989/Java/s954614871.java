import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = input.nextInt();
        }
        Arrays.sort(nums);
        if(nums[n/2] > nums[n/2-1])
            System.out.println(nums[n/2] - nums[n/2-1]);
        else
            System.out.println(0);

    }
}
