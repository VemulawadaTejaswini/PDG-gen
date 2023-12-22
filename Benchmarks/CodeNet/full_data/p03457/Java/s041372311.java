import java.util.Scanner;

public class Main {

    private static class Position {
        long x = 0;
        long y = 0;
    }

    private static boolean canTravel(long[] t, long[] x, long[] y) {
        Position pos = new Position();
        for (int i = 0; i < t.length; i++) {
            long dist;
            long dt;
            if (i == 0) {
                dist = Math.abs(x[i]) + Math.abs(y[i]);
                dt = t[i];
            } else {
                dist = Math.abs(x[i] - x[i - 1]) + Math.abs(y[i] - y[i - 1]);
                dt = t[i] - t[i - 1];
            }
            if (dist > dt || dist % 2 != dt % 2) {
                return false;
            }
            pos.x = x[i];
            pos.y = y[i];
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] t = new long[n];
        long[] x = new long[n];
        long[] y = new long[n];

        for (int i = 0; i < n; i++) {
            t[i] = sc.nextInt();
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        if (canTravel(t, x, y)) {
            System.out.println("Yes");
            return;
        }
        System.out.println("No");
    }

}
