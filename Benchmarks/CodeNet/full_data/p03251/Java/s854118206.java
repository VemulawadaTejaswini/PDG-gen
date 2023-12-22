import java.util.*;

/**
 * Copyright © 2018 Chris. All rights reserved.
 *
 * @author Chris
 * 2018/7/5 22:51
 *
 */
public class Main {

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        int max = -200;
        int min = 200;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, sc.nextInt());
        }
        for (int i = 0; i < m; i++) {
            min = Math.min(min, sc.nextInt());
        }
        if (max < min && max < y && min > x) {
            System.out.println("No War");
        } else {
            System.out.println("War");
        }
    }

    public static void main(String args[]) {

        solve(new Scanner(System.in));
    }
}
