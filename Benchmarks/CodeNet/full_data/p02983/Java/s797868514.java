import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long l = sc.nextLong();
        long r = sc.nextLong();

        long min = Long.MAX_VALUE;
        if (r - l > 2019) {
            min = 0;
        } else {
            flag:
            for (long i = l; i < r; i++) {
                for (long j = l + 1; j <= r; j++) {
                    min = Math.min(min, (i * j) % 2019);
                    if (min == 0) break flag;
                }
            }
        }


        System.out.println(min);
    }
}