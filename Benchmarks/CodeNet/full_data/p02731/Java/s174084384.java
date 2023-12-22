import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double l = sc.nextDouble();
        double a = l / 3;
        double ans = a * a * a;
        System.out.println(String.format("%1$.7f", ans));
    }
}