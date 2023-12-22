import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();

        long match = 0;
        for (long i = 1; i < N + 1; i++) {
            if (isFavorite(i, N)) {
                match += i;
            }
        }
        System.out.println(match);
    }

    private static boolean isFavorite(long i, long n) {
        return n / i == n % i;
    }
}
