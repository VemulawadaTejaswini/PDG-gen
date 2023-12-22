import java.util.*;

public class Main {

    public static String doPlan(int[] t, int[] x, int[] y) {
        for (int i = 0; i < t.length - 1; i++) {
            int t1 = t[i];
            int t2 = t[i+1];
            int x1 = x[i];
            int x2 = x[i+1];
            int y1 = y[i];
            int y2 = y[i+1];
            if (((t2 - t1) >= Math.abs(x2 - x1) + Math.abs(y2 - y1))
                && ((t2 - t1) % 2 == (Math.abs(x2 - x1) + Math.abs(y2 - y1)) % 2)) {

            } else {
                return "No";
            }
         }
         return "Yes";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] t = new int[N + 1];
        int[] x = new int[N + 1];
        int[] y = new int[N + 1];
        t[0] = 0;
        x[0] = 0;
        y[0] = 0;
        for (int i = 1; i <= N; i++) {
            t[i] = sc.nextInt();
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        System.out.println(doPlan(t, x, y));
    }

}
