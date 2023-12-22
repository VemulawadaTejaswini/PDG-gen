import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double a = s.nextDouble();
        double b = s.nextDouble();
        double x = s.nextDouble() / a;
        double S = a * b;
        double h;
        if (x <= S/2) {
            h = x / b * 2.0D;
            System.out.println(90 - Math.toDegrees(Math.atan2(h,b)));
        } else {
            h = (S-x) / a * 2.0D;
            System.out.println(Math.toDegrees(Math.atan2(h,a)));
        }
    }
}
