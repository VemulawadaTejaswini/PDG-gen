import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int A, B, C, X, Y;

        try (Scanner sc = new Scanner(System.in)) {
            A = sc.nextInt();
            B = sc.nextInt();
            C = sc.nextInt();
            X = sc.nextInt();
            Y = sc.nextInt();
        }
        int result = 0;
        int C2 = 2 * C;
        int sagaku = C2 - (A + B);
        int min = X < Y ? X : Y;
        if (sagaku < 0) {
            result += C2 * min;
        } else {
            result += A * min;
            result += B * min;
        }

        if (X > Y) {
            if (A > C2) {
                result += C2 * (X - Y);
            } else {
                result += A * (X - Y);
            }
        } else if (X < Y) {
            if (B > C2) {
                result += C2 * (Y - X);
            } else {
                result += B * (Y - X);
            }
        }

        System.out.println(result);
    }
}
