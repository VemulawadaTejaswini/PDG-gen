import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();


        double as = squareRoot(a);
        double bs = squareRoot(b);
        double cs = squareRoot(c);

        if (as + bs < cs) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }

    public static double squareRoot(double c) {
        double epsilon = 1e-15;    // relative error tolerance
        double t = c;              // estimate of the square root of c

        while (Math.abs(t - c / t) > epsilon * t) {
            t = (c / t + t) / 2.0;
        }
        return t;
    }
}