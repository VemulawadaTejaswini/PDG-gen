import java.util.*;

import static java.lang.Math.pow;
import static sun.swing.MenuItemLayoutHelper.max;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int k = scan.nextInt();
        int tmp = max(a, b, c);
        int ans = a + b + c - tmp;
        ans += tmp * Math.pow(2.0, (double) k);
        System.out.println(ans);
    }

}
