import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        int[] t = new int[n + 1];
        for (int i = 1; i <= n; i++)
            t[i] = t[i - 1] + scanner.nextInt();
        int[] v = new int[n + 2];
        for (int i = 1; i <= n; i++)
            v[i] = scanner.nextInt();
        for (int i = n; i > 0; i--)
            v[i] = Math.min(v[i], v[i + 1] + t[i] - t[i - 1]);

        double ans = 0;
        for (int i = 0; i < n; i++) {
            int startSpeed = Math.min(v[i], v[i + 1]);
            int endSpeed = Math.min(v[i + 1], v[i + 2]);
            int maxSpeed = v[i + 1];
            int time = t[i + 1] - t[i];

            if (maxSpeed - startSpeed + maxSpeed - endSpeed >= time) {
                int j = Math.min(startSpeed, endSpeed);
                int k = Math.abs(startSpeed - endSpeed);
                int l = time - k;
                ans += j * k * 2 + k * k;
                ans += j * l + l * l / 2d;
            } else {
                int j = maxSpeed - startSpeed;
                int k = maxSpeed - endSpeed;
                ans += startSpeed * j * 2 + j * j;
                ans += endSpeed * k * 2 + k * k;
                ans += (time - maxSpeed + startSpeed - maxSpeed + endSpeed) * maxSpeed * 2;
            }
        }

        System.out.println(ans / 2d);
    }
}