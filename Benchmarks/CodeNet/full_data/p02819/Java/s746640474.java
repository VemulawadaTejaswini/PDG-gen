import java.util.*;
 
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();

        int l = 1; // NG
        int r = 1_000_000_007;

        for (int i = X; i <= r; i++) {
            if (isPrime(i)) {
                System.out.println(i);
                return;
            }
        }
    }

    private static boolean isPrime(int a) {
        boolean isPrime = true;
        for (int i = 2; i*i < a; i++) {
            if (a%i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}
