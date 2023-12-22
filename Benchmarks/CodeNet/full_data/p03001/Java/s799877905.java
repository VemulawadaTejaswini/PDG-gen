import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double w = sc.nextDouble();
        double h = sc.nextDouble();
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double ans = 0.0;
        if(x < y) {
            ans = h * x;
        } else {
            ans = w * y;
        }
        int ans2 = 0;
        if(x == y) ans2 = 1;
        System.out.println(ans + " " + ans2);
    }
}