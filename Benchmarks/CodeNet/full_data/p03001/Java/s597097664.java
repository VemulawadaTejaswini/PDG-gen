
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        long W = scanner.nextLong();
        long H = scanner.nextLong();
        long x = scanner.nextLong();
        long y = scanner.nextLong();

        if ((double)x == (double)W / 2 && (double)y == (double)H / 2) {
            double tmp = (double)H * ((double)W / 2);
            System.out.print(String.format("%.10f", tmp));
            System.out.print(" ");
            System.out.print(1);
            return;
        }

        System.out.print(String.format("%.10f", (double)H * ((double)W / 2)));
        System.out.print(" ");
        System.out.print(0);

    }
}
