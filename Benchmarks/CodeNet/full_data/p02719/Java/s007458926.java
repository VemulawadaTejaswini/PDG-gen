
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);

        long N = scanner.nextLong();
        long K = scanner.nextLong();
        long min = N;

        N %= K;
        while (true) {
            long next = Math.abs(N - K);
            if (min > next) {
                min = next;
            } else {
                break;
            }
            N = next;
        }
        System.out.println(N);
    }
}
