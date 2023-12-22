import java.util.Scanner;


public class Main {
    private static int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();

        long x = n / ( a + b );
        long y = n % ( a + b );

        if (a < y) {
            y = a;
        }

        System.out.println( (a * x) + y );

        if (!sc.hasNext()) {
            return;
        }
    }
}
