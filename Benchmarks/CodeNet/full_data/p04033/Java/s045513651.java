import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = b - a + 1;
            if (a <= 0 && b >= 0 || a == 0 || b == 0) {
                System.out.println("Zero");
                return;
            }
            if (a > 0) {
                System.out.println("Positive");
                return;
            }
            if (n % 2 == 0) {
                System.out.println("Positive");
                return;
            }
            System.out.println("Negative");
        }
    }

    private static int f(int n) {
        return (int) Math.floor((n * n + 4.0) / 8.0);
    }
}
