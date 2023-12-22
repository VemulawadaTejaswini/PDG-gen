import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // ABC158B - Count Balls

        Scanner sc = new Scanner(System.in);

        long n = sc.nextInt();
        long a = sc.nextInt();
        long b = sc.nextInt();

        if (a == 0) {
            System.out.println(0);
            return;
        }

        long x = n / (a + b);
        long y = n % (a + b);
        y = (y > a && y != 0) ? a : y;
        long ans = x * a + y;

        System.out.println(ans);
    }
}