import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    private static double waterBottle(int a, int b, int x) {
        if (2 * x <= a * a * b) {
            return Math.toDegrees(Math.atan((double) a * b * b / (2 * x)));
        } else if (x < a * a * b) {
            return Math.toDegrees(Math.atan((double) (2 * (a * a * b - x)) / (a * a * a)));
        }
        return 0;

    }

    public static void main(String[] args) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = sc.nextInt();
        System.out.println(waterBottle(a, b, x));
    }
}