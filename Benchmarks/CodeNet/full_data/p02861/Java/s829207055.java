import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        double x[] = new double[N];
        double y[] = new double[N];
        for (int i = 0; i < N; i++) {
            x[i] = sc.nextDouble();
            y[i] = sc.nextDouble();

        }

        double distAll = 0.0;

        for (int i = 0; i < N; i++) {
            for (int j = i; j < N; j++) {
                distAll += calcDist(x[i], y[i], x[j], y[j]);
            }
        }

        System.out.println((distAll * 2) / N);
    }

    static double calcDist(double x1, double y1, double x2, double y2) {
        double xDiff = Math.pow(x1 - x2, 2);
        double yDiff = Math.pow(y1 - y2, 2);

        return Math.sqrt(xDiff + yDiff);

    }
}
