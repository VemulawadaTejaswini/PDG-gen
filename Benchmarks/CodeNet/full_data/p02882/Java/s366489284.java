import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double x = sc.nextDouble();
        sc.close();

        if (x / a <= a * b / 2) {
            System.out.println(Math.toDegrees(Math.atan(a * Math.pow(b, 2) / (2 * x))));
        } else {
            System.out.println(Math.toDegrees(Math.atan((2 * (b - x / Math.pow(a, 2)) / a))));
        }
    }
}