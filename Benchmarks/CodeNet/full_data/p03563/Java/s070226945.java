import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double g = sc.nextDouble();

        sc.close();

        double ans = g - r + g;

        System.out.println(ans);
    }
}