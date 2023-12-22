import java.util.*;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] t = new int[N];
        long[] x = new long[N];
        long[] y = new long[N];
        for (int i = 0; i < N; i++) {
            t[i] = sc.nextInt();
            x[i] = sc.nextLong();
            y[i] = sc.nextLong();
        }

        boolean canTravels = true;
        int startT = 0;
        long startX = 0;
        long startY = 0;
        for (int i = 0; i < N; i++) {
            if (!canTravel(startT, startX, startY, t[i], x[i], y[i])) {
                canTravels = false;
                break;
            }
            startT = t[i];
            startX = x[i];
            startY = y[i];
        }

        if (canTravels) {
            out.println("Yes");
        } else {
            out.println("No");
        }
    }

    static boolean canTravel(int t, long x, long y, int t1, long x1, long y1) {
        int diffT = t1 - t;
        long diffX = Math.abs(x1 - x);
        long diffY = Math.abs(y1 - y);

        return (diffT - diffX - diffY) >= 0 && (diffT - diffX - diffY) % 2 == 0;
    }
}