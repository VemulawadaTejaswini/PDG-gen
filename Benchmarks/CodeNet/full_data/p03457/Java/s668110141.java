import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] t = new int[N + 1];
        int[] x = new int[N + 1];
        int[] y = new int[N + 1];
        for (int i = 1; i < N + 1; i++) {
            t[i] = sc.nextInt();
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        for (int i = 0; i < N; i++) {
            int dis = Math.abs(x[i] - x[i+1]) + Math.abs(y[i] - y[i+1]);
            int span = t[i+1] - t[i];

            if (dis > span || (span - dis) % 2 == 1) {
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");
    }
}