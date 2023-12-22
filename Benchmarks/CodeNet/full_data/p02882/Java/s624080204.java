import java.util.*;

public class Main {

    public static void main(String[] args) {
        // input
        Scanner sc = new Scanner(System.in);

        double a = sc.nextInt();
        int b = sc.nextInt();
        int x = sc.nextInt();

        double radians;

        if (x > a * a * b / 2) {
            radians = Math.atan(((a * a * b - x) * 2) / Math.pow(a, 3));
        } else {
            radians = Math.atan(a * b * b / (2 * x));
        }

        System.out.println(radians * 180 / Math.PI);
    }
}