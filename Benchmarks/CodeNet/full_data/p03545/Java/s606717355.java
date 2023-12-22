
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] nums = new int[4];
        for (int i = 0; i < 4; i++) {
            nums[i] = Integer.parseInt(s.substring(i, i + 1));
        }
        int tmp;
        for (int i = 0; i < 8; i++) {
            tmp = nums[0];
            for (int j = 0; j < 3; j++) {
                tmp += nums[j + 1] * (i % Math.pow(2, j + 1) - i % Math.pow(2, j) != 0 ? 1 : -1);
            }
            if (tmp==7) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(nums[j]);
                    System.out.print(i % Math.pow(2, j + 1) - i % Math.pow(2, j) != 0 ? "+" : "-");
                }
                System.out.println(nums[3]+"=7");
                return;
            }
        }
    }
}
