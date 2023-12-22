
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long N = scanner.nextLong();

        long answer = Long.MAX_VALUE;
        for (long i = 1 ; i * i <= N ; i++) {
            if (N % i == 0) {
                long j = N / i;
                answer = Math.min(answer, i + j - 2);
            }
        }

        System.out.println(answer);
    }
}
