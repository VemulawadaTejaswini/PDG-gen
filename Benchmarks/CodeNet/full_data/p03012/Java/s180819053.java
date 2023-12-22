import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        solve();
    }

    private static void solve() {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int sum = 0;
        int[] nums = new int[n];
        int min = 0;

        for (int i = 0; i < n; i++) {
        	nums[i] = input.nextInt();
        	sum += nums[i];
        }

        min = sum;

        for (int num: nums) {
        	sum = sum - num * 2;
        	if (sum < 0) {
        		min = Math.min(min, sum * (-1));
        	} else {
        		min = Math.min(min, sum);
        	}
        }

        System.out.println(min);
    }
}
