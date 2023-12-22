import java.util.Scanner;

// https://atcoder.jp/contests/abc087/tasks/abc087_b
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A, B, C;

        A = scanner.nextInt();
        B = scanner.nextInt();
        C = scanner.nextInt();

        int X = scanner.nextInt();

        //helper(0, A, B, C, X);

        int result = 0;

        for (int i = 0; i <= A; i++) {
            for (int j = 0; j <= B; j++) {
                for (int k = 0; k <= C; k++) {
                    if (500 * i + 100 * j + 50 * k == X) {
                        result++;
                    }
                }
            }
        }

        System.out.println(result);
    }
}