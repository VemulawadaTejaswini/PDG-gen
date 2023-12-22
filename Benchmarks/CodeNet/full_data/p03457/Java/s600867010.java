import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] t = new int[n + 1];
        int[] x = new int[n + 1];
        int[] y = new int[n + 1];
        for (int i = 1; i < n + 1; i++) {
            t[i] = sc.nextInt();
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        String res = "Yes";
        for (int i =1; i < n + 1; i++) {
            int dx = Math.abs(x[i - 1] - x[i]);
            int dy = Math.abs(y[i - 1] - y[i]);
            int d = dx + dy;
            int s = (t[i] - t[i - 1]);
            if (s < d || s % 2 != d % 2) {
                res = "No";
                break;
            }
        }
        System.out.println(res);
    }

}
