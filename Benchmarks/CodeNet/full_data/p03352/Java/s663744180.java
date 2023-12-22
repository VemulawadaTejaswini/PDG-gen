

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            int ans = 1;
            for (int b = 2; b <= n; b++) {
                int x = b * b;
                while (x <= n) {
                    ans = Math.max(ans, x);
                    x *= b;
                }
            }
            System.out.println(ans);
        }
    }
}
