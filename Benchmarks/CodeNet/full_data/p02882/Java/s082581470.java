import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = (double)sc.nextInt();
        double b = (double)sc.nextInt();
        double x = (double)sc.nextInt();

        if (x <= a*a*b/2) {
            double rad = Math.atan( (2*x/(a*b)) / b );
            System.out.println(90 - Math.toDegrees(rad));
        } else {
            double rad = Math.atan( (b - (2*x/(a*a) - b))  / a );
            System.out.println(Math.toDegrees(rad));
        }
    }
}
