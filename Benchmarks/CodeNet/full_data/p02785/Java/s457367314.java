
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int K = scanner.nextInt();

        long[] H = new long[N];

        for (int i = 0 ; i < N ; i++) {
            H[i] = scanner.nextLong();
        }

        Arrays.sort(H);

        long total = 0L;
        for (int i = 0 ; i < N - K ; i++) {
            total += H[i];
        }

        System.out.println(total);
    }
}
