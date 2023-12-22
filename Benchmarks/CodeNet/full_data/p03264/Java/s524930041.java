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
        int k = sc.nextInt();
        System.out.println((k / 2) * (k / 2));
    }
}