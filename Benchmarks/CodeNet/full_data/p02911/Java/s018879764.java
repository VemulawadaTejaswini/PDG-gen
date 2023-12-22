
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long N = scanner.nextLong();
        long K = scanner.nextLong();
        long Q = scanner.nextLong();

        Map<Long, Long> players = new HashMap<>();

        for (long i = 0 ; i < Q ; i++) {
            long A = scanner.nextLong();
            players.put(A, players.getOrDefault(A, 0L) + 1);
        }

        for (long i = 1 ; i <= N ; i++) {
            long score =  K - (Q - players.getOrDefault(i, 0L));
            if (score > 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
