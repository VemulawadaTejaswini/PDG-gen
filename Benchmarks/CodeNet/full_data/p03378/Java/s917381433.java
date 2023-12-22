import java.util.*;

import static java.lang.Integer.min;

public class Main {

    public static void main(String[] args) {
        int right = 0, left = 0, n, m, x;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        m = s.nextInt();
        x = s.nextInt();
        for (int i = 0; i < m; i++) {
            int tmp = s.nextInt();
            if (tmp < x) left++;
            else right++;
        }
        System.out.println(min(right, left));
    }

}
