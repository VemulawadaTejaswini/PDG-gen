import java.util.Scanner;

public class Main {
    static int pay(int x) {
        if (x == 1) {
            return 300000;
        } else if (x == 2) {
            return 200000;
        } else if (x == 3) {
            return 100000;
        } else {
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        int x = std.nextInt();
        int y = std.nextInt();
        int ans = 0;
        if (x == 1 && y == 1) {
            ans += 400000;
        }

        ans += pay(x);
        ans += pay(y);
        System.out.println(ans);
    }
}
