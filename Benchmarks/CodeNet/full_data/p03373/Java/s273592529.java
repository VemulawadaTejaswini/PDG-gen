import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        long startTime = System.currentTimeMillis();

        Scanner scanner = new Scanner(System.in);

        long A = scanner.nextLong();
        long B = scanner.nextLong();
        long C = scanner.nextLong();
        long X = scanner.nextLong();
        long Y = scanner.nextLong();
        scanner.close();

        long V = 2 * C - (A + B);

        if (V >= 0) {
            long T = A * X + B * Y;
            System.out.println(T);
        } else {
            long x;
            long y;
            if (X < Y) {
                // Xの場合
                x = B * (Y - X) + C * 2 * X;
                // Yの場合
                y = C * 2 * Y;
            } else {
                // X
                x = C * 2 * X;
                // Y
                y = A * (X - Y) + C * 2 * Y;
            }
            System.out.println(Math.min(x, y));
        }
//        System.out.println(System.currentTimeMillis() - startTime);
    }
}