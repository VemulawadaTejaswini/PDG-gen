import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        double a = scan.nextInt();
        double b = scan.nextInt();
        double x = scan.nextInt();
        double current = x / a;
        if (current == a * b) {
            System.out.println(0);
            return;
        }
        if (current <= a * b / 2) {
            double height = 2 * current / b;
            double atan2 = 90 - Math.abs(Math.atan2(height, b)) * 180 / Math.PI;
            System.out.printf("%.9f\n", atan2);
            return;
        }
        double height = (2 * current - b * a) / a;
        double atan2 = Math.abs(Math.atan2(b - height, a)) * 180 / Math.PI;
        System.out.printf("%.9f\n", atan2);
    }
}
