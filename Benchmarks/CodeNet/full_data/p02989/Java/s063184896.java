import java.math.BigDecimal;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        String line = sc.nextLine();
        check(num, line);
    }

    public static void check(String num, String line) {
        int cnt = Integer.parseInt(num);
        String[] strs = line.split(" ");
        int[] nums = new int[strs.length];
        for(int i=0; i<strs.length; i++) {
            nums[i] = Integer.parseInt(strs[i]);
        }
        Arrays.sort(nums);
        int size = cnt/2;
        if(nums[size-1]==nums[size]) {
            System.out.println(0);
            return;
        }
        System.out.println(nums[size]-nums[size-1]);
    }
}