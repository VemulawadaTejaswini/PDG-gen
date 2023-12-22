import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double W = scan.nextDouble();
        double H = scan.nextDouble();
        double x = scan.nextDouble();
        double y = scan.nextDouble();
        int ans = 0;
        if (W / 2 == x && H / 2 == y) ans = 1;
        System.out.printf("%.10f %d", W * H / 2, ans);
    }
}