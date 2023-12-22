import java.util.Scanner;

public class Main {

    static int A;
    static int B;
    static int C;
    static int X;
    static int Y;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        X = sc.nextInt();
        Y = sc.nextInt();

        solve();
    }

    public static void solve() {
        long sum = 0;

        if (A + B > C * 2) {
            if (X > Y) {
                sum = C * Y * 2;

                if (A < C * 2) {
                    sum += (X - Y) * A;
                } else {
                    sum += (X - Y) * C * 2;
                }
            } else {
                sum = C * X * 2;

                if (B < C * 2) {
                    sum += (Y - X) * B;
                } else {
                    sum += (Y - X) * C * 2;
                }
            }
        } else {
            sum = A * X + B * Y;
        }

        System.out.println(sum);
    }
}
