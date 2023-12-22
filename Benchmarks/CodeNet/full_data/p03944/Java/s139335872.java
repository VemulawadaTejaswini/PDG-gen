import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int w = scan.nextInt();
        int h = scan.nextInt();
        int n = scan.nextInt();

        int l = 0, r = w, t = h, b = 0;
        for (int i = 0; i < n; i++) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            int a = scan.nextInt();

            if (a == 1) {
                if (x > l) l = x;
            }
            if (a == 2) {
                if (x < r) r = x;
            }
            if (a == 3) {
                if (y > b) b = y;
            }
            if (a == 4) {
                if (y < t) t = y;
            }
        }

        System.out.println(Math.max(0, (r - l) * (t - b)));
    }
}
