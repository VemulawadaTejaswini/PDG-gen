import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        System.out.println(Sosu(n));
    }

    public static long Sosu(long n) {
        for (long i = 2; i < n; i++) {
            if (n % i == 0) {
                i=1;
                n = n + 1;
            }
        }
        return n;
    }
}