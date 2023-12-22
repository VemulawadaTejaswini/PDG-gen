import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int curX = 0;
        int curY = 0;
        int curT = 0;
        for (int i = 0; i < n; i++) {
            int t = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            int dX = Math.abs(x - curX);
            int dY = Math.abs(y - curY);
            int d = dX + dY;
            int dT = Math.abs(t - curT);
            int diff = dT - d;
            if (d > dT || diff % 2 != 0) {
                System.out.println("No");
                return;
            }
            
            curT = t;
            curX = x;
            curY = y;
        }
        System.out.println("Yes");
    }
}
