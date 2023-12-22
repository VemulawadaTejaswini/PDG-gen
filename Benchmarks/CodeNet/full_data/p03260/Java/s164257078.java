import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    static int gcd(int a, int b) {
        if (a % b != 0) {
            return gcd(b, a % b);
        } else {
            return b;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int n = sc.nextInt();
        int b = sc.nextInt();
        if (n % 2 == 1 && b % 2 == 1) {
            System.out.println("Yes");
        } else
            System.out.println("No");
    }
}