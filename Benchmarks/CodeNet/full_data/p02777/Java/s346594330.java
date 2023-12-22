import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] colors = new String[2];
        int[] nums = new int[2];
        for (int i = 0; i < 2; i++) {
            colors[i] = sc.next();
        }
        for (int i = 0; i < 2; i++) {
            nums[i] = sc.nextInt();
        }
        String color = sc.next();
        for (int i = 0; i < 2; i++) {
            if (colors[i].equals(color)) {
                nums[i]--;
                break;
            }
        }
        System.out.println(nums[0] + " " + nums[1]);
    }
}