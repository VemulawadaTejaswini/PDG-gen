import java.util.Scanner;

/**
 * @Description:
 * @Author: sunyx
 * @CreateDate: 2019/10/11 13:42
 */
public class ATC {
    static int n, min = Integer.MAX_VALUE;
    static int[] nums;

    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        if (n == 2) {
            min = nums[0] == nums[1] ? 1 : 0;
            System.out.println(min);
            return;
        }
        t(0, 0);
        System.out.println(min);
    }

    public static void t(int i, int pv) {
        if (i >= n) return;
        if (i == 0) {
            int cv = 0;
            for (int x = 2; x < n; x++) if (x % 2 == 0 && nums[i] != nums[x]) cv += 1;
            t(i + 1, cv);
        } else {
            int cv = 0;
            for (int x = 0; x < n; x++) {
                if((pv+cv) > min) break;
                if (i != x && i % 2 == x % 2 && nums[i] != nums[x]) cv += 1;
            }
            if (nums[i - 1] == nums[i] && pv == 0 && cv == 0) cv=n/2;
            min = Math.min(min, pv+cv);
            t(i + 1, pv + cv);
        }
    }
}
