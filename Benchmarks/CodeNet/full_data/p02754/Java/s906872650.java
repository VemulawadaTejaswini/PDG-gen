import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        if (a == 0) {
            System.out.println("0");
            return;
        }
        long d = a + b;
        long q = n / d;
        long r = n % d;
        long blue = (q * a) + (a < r ? a : r);
        System.out.println(blue);
    }
}