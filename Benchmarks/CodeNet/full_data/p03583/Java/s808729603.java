import java.util.Scanner;

public class Main {

    static int MAX = 3500;

    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // h <= n <= w

        double ans = 4.0 / n;

        for (double h = 1; h <= MAX; h++) {
            double _h = 1 / h;
            if (ans / 3 > _h) {
                break;
            }

            double rest = ans - _h;
            for (double d = h; d <= MAX; d++) {
                double _d = 1 / d;
                if (rest / 2 > _d) {
                    break;
                }

                double w = 1 / (rest - _d);
                if(w <= 0 || w > MAX) continue;

                if (Math.abs(Math.ceil(w) - w) < 0.00001) {
                    System.out.println((int) h + " " + (int) d + " " + (int) Math.ceil(w));
                    System.exit(0);
                }
                if (Math.abs(Math.floor(w) - w) < 0.00001) {
                    System.out.println((int) h + " " + (int) d + " " + (int) Math.floor(w));
                    System.exit(0);
                }
            }
        }
    }
}