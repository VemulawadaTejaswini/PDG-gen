import java.util.Scanner;

public class Main {
    void run() {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = scan.nextInt() % (2 * k);
            y[i] = scan.nextInt() % (2 * k);
            char c = scan.next().charAt(0);
            if (c == 'W') {
                y[i] += k;
                y[i] %= (2 * k);
            }
        }
        int ans = 0;
        for (int i = 0; i < 2 * k; i++) {
            for (int j = 0; j < 2 * k; j++) {
                int sum = 0;
                for (int l = 0; l < n; l++) {
                    if ( (i <= y[l] && (i + k) >= y[l]) && !(j <= x[l] && (j + k) >= x[l]))
                        continue;
                    if (!(i <= y[l] && (i + k) >= y[l]) &&  (j <= x[l] && (j + k) >= x[l]))
                        continue;
                    sum++;
                }
                ans = Math.max(ans, sum);
            }
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        new Main().run();
    }
}
