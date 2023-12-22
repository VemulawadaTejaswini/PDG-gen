import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long l = in.nextInt();
        long r = in.nextInt();

        long min1 = 2020, min2 = 2020;
        for (long i = l; i <= r ; i++) {
            if (i % 2019 <= min1) {
                min2 = min1;
                min1 = i % 2019;
            } else if (i % 2019 <= min2) {
                min2 = i % 2019;
            }

            if (min2 == 0) break;
        }

        System.out.println((min1 * min2) % 2019);
    }
}