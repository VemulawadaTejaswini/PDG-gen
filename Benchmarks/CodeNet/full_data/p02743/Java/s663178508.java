import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long a = scan.nextLong();
        long b = scan.nextLong();
        long c = scan.nextLong();

        double l = 2 * Math.sqrt(a * b) + a + b;
        double r = c;
        if (l < r) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
