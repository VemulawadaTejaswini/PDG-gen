

import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long [] a = new long[n + 1];
        long [] b = new long[n + 1];
        long [] c = new long[n + 1];
        long [][] happy = new long [n + 1][3];

        for (int i = 1; i <= n; ++i) {
            a[i] = scanner.nextLong();
            b[i] = scanner.nextLong();
            c[i] = scanner.nextLong();
        }
        happy[0][0] = 0;
        happy[0][1] = 0;
        happy[0][2] = 0;
        for (int i = 1; i <= n; ++i) {
            happy[i][0] = Math.max(happy[i - 1][1] + a[i],
                    happy[i - 1][2] + a[i]
                    );
            happy[i][1] = Math.max(happy[i - 1][0] + b[i],
                    happy[i - 1][2] + b[i]);
            happy[i][2] = Math.max(happy[i - 1][0] + c[i],
                    happy[i - 1][1] + c[i]);
        }
        System.out.println(Math.max(happy[n][0], Math.max(happy[n][1], happy[n][2])));
    }
}
