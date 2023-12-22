

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Main {
    static Scanner sc = new Scanner(System.in);
    static int n;
    static Map<Integer, XY> map;
    static int max = 0;

    public static void main(String[] args) {
        n = sc.nextInt();
        map = new HashMap();

        for (int i = 0; i < n; i++) {
            int t = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (max < t) {
                max = t;
            }
            map.put(t, new XY(x, y));
        }
        if (solve(0, 0, 0)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    private static boolean solve(int t, int x, int y) {
        if (t > max || x < 0 || y < 0) {
            return false;
        }
        XY xy = map.get(t);
        if (xy == null) {
            return solve(t + 1, x + 1, y) || solve(t + 1, x - 1, y) || solve(t + 1, x, y + 1) || solve(t + 1, x, y - 1);
        }
        if (xy != null && (xy.x != x || xy.y != y)) {
            return false;
        }
        if (xy != null && xy.x == x && xy.y == y && t == max) {
            return true;
        }
        return solve(t + 1, x + 1, y) || solve(t + 1, x - 1, y) || solve(t + 1, x, y + 1) || solve(t + 1, x, y - 1);
    }

    private static class XY {
        int x;
        int y;

        public XY(int a, int b) {
            x = a;
            y = b;
        }
    }
}

