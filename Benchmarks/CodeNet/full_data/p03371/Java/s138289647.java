

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            int ans = Integer.MAX_VALUE;
            for (int i = 0; i <= Math.max(x, y) * 2; i++) {
                int remX = Math.max(0, x - i / 2);
                int remY = Math.max(0, y - i / 2);

                ans = Math.min(ans, c * i + remX * a + remY * b);
            }
            System.out.println(ans);
        }
    }
}
