import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long l = sc.nextLong();
        long r = sc.nextLong();

        long min1 = Long.MAX_VALUE;
        long min2 = min1;
        long tmp = Math.min(r, l + 2020);
        for (long i = l; i <= tmp; i++) {
            long mod = i % 2019;
            if (min1 >= mod) {
                min2 = min1;
                min1 = mod;
            } else if (min2 > mod) {
                min2 = mod;
            }
        }

        System.out.println((min1 * min2) % 2019);
    }
}