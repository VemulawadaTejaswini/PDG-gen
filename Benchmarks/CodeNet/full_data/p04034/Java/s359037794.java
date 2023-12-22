import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        boolean[] can = new boolean[n];
        can[0] = true;
        int[] ball = new int[n];
        Arrays.fill(ball, 1);
        int ans = 0;
        for (int i = 0; i < m; i++) {
            int x = scanner.nextInt() - 1;
            int y = scanner.nextInt() - 1;

            if (can[x]) {
                can[y] = true;

                if (ball[x] == 1) {
                    can[x] = false;
                }
            }

            ball[x]--;
            ball[y]++;
        }

        for (boolean b : can) {
            if (b) {
                ans++;
            }
        }

        System.out.println(ans);
    }
}