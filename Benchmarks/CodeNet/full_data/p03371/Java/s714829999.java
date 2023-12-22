import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        long ans = 0;

        int min = Math.min(x, y);
        if ((a*min + b*min) > c*min*2) {
            ans += c*min*2;
            x -= min;
            y -= min;
        } else {
            ans += a*min + b * min;
            x -= min;
            y -= min;
        }

        int num = x > y ? a : b;
        int max = Math.max(x, y);
        if (num*max > c*max*2) {
            ans += c*max*2;
        } else {
            ans += num * max;
        }

        System.out.println(ans);
    }
}
