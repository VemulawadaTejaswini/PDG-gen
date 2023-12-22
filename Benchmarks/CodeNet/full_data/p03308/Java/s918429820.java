import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] nums = new int[n];
        int min = 1;
        int max = 1;
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(sc.next());
            // 1回目のループのみminをセット
            if (i == 0) min = nums[i];
            max = (nums[i] > max) ? nums[i] : max; 
            min = (nums[i] < min) ? nums[i] : min;
        }
        System.out.println(Math.abs(max - min));
    }
}
