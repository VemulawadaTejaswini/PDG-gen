import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] t = new int[n + 1];
        int[] x = new int[n + 1];
        int[] y = new int[n + 1];
        t[0] = 0;
        x[0] = 0;
        y[0] = 0;
        for (int i = 1; i <= n; i++) {
            t[i] = sc.nextInt();
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        boolean success = true;
        for (int i = 1; i <= n; i++) {
            int T = t[i] - t[i - 1];
            int a = Math.abs(x[i] - x[i - 1]);
            int b = Math.abs(y[i] - y[i - 1]);

            int m = T - (a + b);
            if (m < 0 || m % 2 != 0) {
                success = false;
                break;
            }
        }
        if (success){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
