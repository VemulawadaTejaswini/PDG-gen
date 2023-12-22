import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] x = new double[n];
        String[] v = new String[n];
        double ans = 0;
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextDouble();
            v[i] = sc.next();
        }
        for (int i = 0; i < n; i++) {
            if (v[i].equals("JPY"))
                ans += x[i];
            else
                ans += x[i] * 380000;
        }
        System.out.println(ans);
    }
}