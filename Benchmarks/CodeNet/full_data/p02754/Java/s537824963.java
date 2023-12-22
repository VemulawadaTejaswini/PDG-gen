import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a == 0) {
            System.out.println("0");
            return;
        }
        int d = a + b;
        int q = n / d;
        int r = n % d;
        int blue = (q * a) + (a < r ? a : (a-r));
        System.out.println(blue);
    }
}
