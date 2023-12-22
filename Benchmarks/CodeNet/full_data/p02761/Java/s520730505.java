import static java.util.Arrays.fill;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner fsc = new Scanner(System.in);
        int n = fsc.nextInt();
        int m = fsc.nextInt();
        int[] ans = new int[n];
        fill(ans, -1);
        for (int i = 0; i < m; i++) {
            int s = fsc.nextInt() - 1;
            int c = fsc.nextInt();
            if (ans[s] < 0) {
                ans[s] = c;
            } else if (ans[s] != c) {
                System.out.println(-1);
                return;
            }
        }
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                if (ans[i] == 0) {
                    if (n != 1) {
                        System.out.println(-1);
                        return;
                    } else {
                        System.out.print(0);
                    }
                } else if (ans[i] < 0) {
                    System.out.print(1);
                } else {
                    System.out.print(ans[i]);
                }
            } else {
                System.out.print(ans[i] >= 0 ? ans[i] : 0);
            }
        }
        System.out.println();
    }
}
