import java.util.*;

public class Main {

    public void main(Scanner sc) {
        int h = sc.nextInt();
        int w = sc.nextInt();

        if (h % 3 == 0 || w % 3 == 0) {
            System.out.println(0);
            return;
        }

        if (h == 2 && w == 2) {
            System.out.println(1);
            return;
        }

        // ooooo
        // .....
        // xxxxx
        // xxxxx
        int ans = Math.min(h, w);

        // oo...
        // oo...
        // ooxxx
        // ooxxx
        int ww = (w + 1) / 3;
        int hh = h / 2;
        ans = Math.min(ans, sa(h * ww, hh * (w - ww), (h - hh) * (w - ww)));

        // ooooo
        // ..xxx
        // ..xxx
        // ..xxx
        ww = w / 2;
        hh = (h + 1) / 3;
        ans = Math.min(ans, sa(hh * w, (h - hh) * ww, (h - hh) * (w - ww)));

        System.out.println(ans);
    }

    private int sa(int... nums) {
        Arrays.sort(nums);
        return nums[nums.length - 1] - nums[0];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
        sc.close();
    }
}
