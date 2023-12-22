import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long l = sc.nextLong();
        long r = sc.nextLong();

        if (r - l >= 2019) {
            System.out.print(0);
            return;
        }

        long min = 2019;
        for (long i = l; i <= r - 1; i++) {
            for (long j = i+1; j <= r; j++) {
                long mod = (i * j) % 2019;
                if (min > mod) {
                    min = mod;
                }
            }
        }
        System.out.print(min);
    }
}