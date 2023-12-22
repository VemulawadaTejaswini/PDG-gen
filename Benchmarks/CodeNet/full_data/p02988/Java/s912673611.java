import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        scanner.nextLine();

        final String[] sp = scanner.nextLine().split(" ");
        final int[] nums = Arrays.stream(sp).mapToInt(Integer::parseInt).toArray();

        int count = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            int p0 = nums[i];
            int p1 = nums[i + 1];
            int p2 = nums[i + 2];

            if (Math.max(Math.max(p0, p1), p2) != p1 && Math.min(Math.min(p0, p1), p2) != p1) {
                count++;
            }
        }

        System.out.println(count);
    }
}