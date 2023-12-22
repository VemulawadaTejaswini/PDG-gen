import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), t = sc.nextInt(), A = sc.nextInt();
        int ans = 0;
        double min = 1e9, T = (double)t;
        for (int n = 0; n < N; n++) {
            double h = sc.nextDouble();
            double f = Math.abs(A - (T - h * 0.006));
            if (min > f) { min = f; ans = n + 1; }
        }
        sc.close();
        System.out.println(ans);
    }
}