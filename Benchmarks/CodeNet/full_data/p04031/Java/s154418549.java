import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = n;
        int[] nums = new int[n];
        int sum = 0;
        int costs = 0;
        boolean[] flags = new boolean[201];
        for (int i = 0; i < n; i++) {
            int temp = scan.nextInt();
            nums[i] = temp;
            if (!flags[temp+100]) {
                sum += nums[i];
                flags[temp+100] = true;
            }else{
                m--;
            }
        }
        double avg = Math.round((double)sum / m);
        for (int num : nums) {
            costs += Math.pow(num - avg, 2);

        }
        System.out.println(costs);

    }

}
