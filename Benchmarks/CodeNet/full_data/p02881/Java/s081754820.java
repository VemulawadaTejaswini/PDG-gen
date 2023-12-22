import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        long sqrt = (long) Math.sqrt(n * 1.0) + 1;
        // System.out.println(sqrt);

        long a = -1;
        long b = -1;
        for (long i = sqrt; i > 0; i--) {
            if (n % i == 0) {
                a = i;
                b = n / a;
                break;
            }
        }

        long ans = a + b - 2;
        System.out.println(ans);

        sc.close();
    }

}
